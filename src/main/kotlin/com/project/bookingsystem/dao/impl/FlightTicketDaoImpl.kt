package com.project.bookingsystem.dao.impl

import com.project.bookingsystem.dao.FlightTicketDao
import com.project.bookingsystem.document.Flight
import com.project.bookingsystem.document.FlightTicket
import com.project.bookingsystem.document.Hotel
import com.project.bookingsystem.document.HotelTicket
import com.mongodb.client.MongoCollection
import com.mongodb.client.MongoDatabase
import com.mongodb.client.model.Filters
import org.bson.Document
import org.litote.kmongo.getCollection
import bookingSystem.FlightOuterClass
import bookingSystem.Booking

class FlightTicketDaoImpl(flightTicketCollection: MongoCollection<Document>?) :
    com.project.bookingsystem.dao.FlightTicketDao {

     override fun bookFlightTicket(database: MongoDatabase, flightTicket: FlightTicket, collectionName: String) {
        val collection = database.getCollection<FlightTicket>(collectionName)

        // Insert the Flight object into the collection
        collection.insertOne(flightTicket)

        println("Flight Ticket booked successfully!")
    }

     override fun getFlightTicketForUser(flightCollection: MongoCollection<Document>?, userName: String): FlightTicket {
        val document = flightCollection?.find(Filters.eq("user", userName))?.firstOrNull()

        return document?.let {
            FlightTicket(
                user = it.getString("user") ?: "",
                flight = Flight(
                    flightNumber = (it["flight"] as? Document)?.getString("flightNumber") ?: "",
                    airline = (it["flight"] as? Document)?.getString("airline") ?: "",
                    price = (it["flight"] as? Document)?.getDouble("price") ?: 0.0,
                    departureLocation = (it["flight"] as? Document)?.getString("departureLocation") ?: "",
                    destinationLocation = (it["flight"] as? Document)?.getString("destinationLocation")
                        ?: "",
                    )
            )
        }!!

    }
}
