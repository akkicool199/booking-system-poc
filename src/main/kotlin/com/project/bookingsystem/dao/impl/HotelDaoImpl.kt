package com.project.bookingsystem.dao.impl

import com.project.bookingsystem.dao.HotelDao
import com.project.bookingsystem.document.*
import com.mongodb.client.MongoCollection
import com.mongodb.client.MongoDatabase
import com.mongodb.client.model.Filters
import org.bson.Document
import org.litote.kmongo.getCollection

class HotelDaoImpl(hotelCollection: MongoCollection<Document>?) : com.project.bookingsystem.dao.HotelDao {
    override fun addHotel(hotelCollection: MongoCollection<Document>, hotel: Hotel) {
        val hotelDocument = Document("hotelName", hotel.hotelName)
            .append("hotelLocation", hotel.hotelLocation)
            .append("checkinDate", hotel.checkinDate)
            .append("checkoutDate", hotel.checkoutDate)

        hotelCollection?.insertOne(hotelDocument)
        println("Hotel inserted successfully!")
    }

    override fun bookHotel(database: MongoDatabase, hotelTicket: HotelTicket, collectionName: String): HotelTicket {
        val collection = database.getCollection<HotelTicket>(collectionName)
        collection.insertOne(hotelTicket)
        println("Hotel booked successfully!")
        return hotelTicket;
    }

    override fun getHotelReservationByUser(hotelCollection: MongoCollection<Document>?, userName: String) : HotelTicket {
        val document = hotelCollection?.find(Filters.eq("user", userName))?.firstOrNull()

        return document?.let {
            HotelTicket(
                user = it.getString("user") ?: "",
                hotel = Hotel(
                    hotelName = (it["hotel"] as? Document)?.getString("hotelName") ?: "",
                    hotelLocation = (it["hotel"] as? Document)?.getString("hotelLocation") ?: "",
                    checkinDate = (it["hotel"] as? Document)?.getString("checkinDate") ?: "",
                    checkoutDate = (it["hotel"] as? Document)?.getString("checkoutDate") ?: ""
                )
            )
        }!!
    }

    override fun searchHotels(hotelLocation: String, hotelCollection: MongoCollection<Document>): List<Hotel> {
        val filter = Document(
            mapOf(
                "hotelLocation" to hotelLocation,
            )
        )

        val hotelDocuments = hotelCollection.find(filter)

        var hotels : List<Hotel> = emptyList()

        hotels = hotelDocuments.map { document ->
            Hotel(
                hotelName = document.getString("hotelName") ?: "",
                hotelLocation = document.getString("hotelLocation") ?: "",
                checkinDate = document.getString("checkinDate") ?: "",
                checkoutDate = document.getString("checkoutDate") ?: ""
            )
        }.toList()

        return hotels
    }

}