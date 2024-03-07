package com.project.bookingsystem.service.impl

import com.project.bookingsystem.dao.impl.HotelDaoImpl
import com.project.bookingsystem.document.Hotel
import com.project.bookingsystem.document.HotelTicket
import com.project.bookingsystem.service.HotelService
import com.project.bookingsystem.util.DatabaseConnectionUtil
import com.mongodb.client.MongoCollection
import org.bson.Document
import bookingSystem.HotelOuterClass
import bookingSystem.Booking

class HotelServiceImpl : HotelService {
    val database = DatabaseConnectionUtil().getDatabase()
    val hotelCollection: MongoCollection<Document> = database.getCollection("hotel")

    val hotelDao = HotelDaoImpl(hotelCollection)

    override fun reserveHotel(hotelTicket: HotelTicket, collectionName: String): HotelTicket {
        return hotelDao.bookHotel(database, hotelTicket, collectionName)
    }

    override fun getHotelReservationByUser(hotelCollection: MongoCollection<Document>?, userName: String): HotelTicket {
        return hotelDao.getHotelReservationByUser(hotelCollection, userName)
    }

    override fun addHotel(hotelCollection: MongoCollection<Document>, hotelObject: Hotel) {
        return hotelDao.addHotel(hotelCollection, hotelObject)
    }

    override fun searchHotels(hotelLocation: String, hotelCollection: MongoCollection<Document>): Booking.Hotels {
         val hotels : List<Hotel> =  hotelDao.searchHotels(hotelLocation, hotelCollection)

        // Convert List<Hotel> to hotels
        val hotelsList: Booking.Hotels = Booking.Hotels.newBuilder()
            .addAllHotels(hotels.map { htl ->
                HotelOuterClass.Hotel.newBuilder()
                    .setHotelName(htl.hotelName)
                    .setHotelLocation(htl.hotelLocation)
                    .setCheckinDate(htl.checkinDate)
                    .setCheckoutDate(htl.checkoutDate)
                    .build()
            })
            .build()

        return hotelsList
    }


}