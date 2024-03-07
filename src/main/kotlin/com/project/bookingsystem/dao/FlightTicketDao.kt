package com.project.bookingsystem.dao

import com.project.bookingsystem.document.FlightTicket
import com.mongodb.client.MongoCollection
import com.mongodb.client.MongoDatabase
import org.bson.Document

interface FlightTicketDao {
    /**
     * book flight ticket
     */
    fun bookFlightTicket(database: MongoDatabase, flightTicket: FlightTicket, collectionName: String)

    /**
     * get flight ticket for a user
     */
    fun getFlightTicketForUser(flightCollection: MongoCollection<Document>?, userName: String): FlightTicket

}