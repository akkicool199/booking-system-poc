package com.project.bookingsystem.dao.impl

import com.project.bookingsystem.dao.CarDao
import com.project.bookingsystem.document.Car
import com.project.bookingsystem.document.CarTicket
import com.project.bookingsystem.document.Hotel
import com.project.bookingsystem.document.HotelTicket
import com.mongodb.client.MongoCollection
import com.mongodb.client.MongoDatabase
import com.mongodb.client.model.Filters
import org.bson.Document
import org.litote.kmongo.getCollection

class CarDaoImpl(carCollection: MongoCollection<Document>?) : com.project.bookingsystem.dao.CarDao {
    override fun rentACar(database: MongoDatabase, carTicket: CarTicket, collectionName: String): CarTicket {
        val collection = database.getCollection<CarTicket>(collectionName)
        // Insert the Flight object into the collection
        collection.insertOne(carTicket)
        println("car booked successfully!")
        return carTicket;
    }

    override fun getCarBookingByUser(carCollection: MongoCollection<Document>, userName: String): CarTicket {
        val document = carCollection?.find(Filters.eq("user", userName))?.firstOrNull()

        return document?.let {
            CarTicket(
                user = it.getString("user") ?: "",
                car = Car(
                    carNumberPlate = (it["car"] as? Document)?.getString("carNumberPlate") ?: "",
                    carDriver = (it["car"] as? Document)?.getString("carDriver") ?: "",
                    driverContact = (it["car"] as? Document)?.getString("driverContact") ?: "",
                    travelDate = (it["car"] as? Document)?.getString("travelDate") ?: ""
                )
            )
        }!!
    }

}