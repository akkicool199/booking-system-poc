package com.project.bookingsystem.service

import com.project.bookingsystem.document.FlightTicket
import com.mongodb.client.MongoCollection
import com.mongodb.client.MongoDatabase
import org.bson.Document
import bookingSystem.Booking

interface FlightTicketService {
    /**
     * book a flight ticket for a user
     */
    fun bookFlightTicket(database: MongoDatabase, flightTicket: FlightTicket, collectionName: String)

    fun getFlightTicketForUser(flightTicketCollection: MongoCollection<Document>?, userName: String): FlightTicket
}