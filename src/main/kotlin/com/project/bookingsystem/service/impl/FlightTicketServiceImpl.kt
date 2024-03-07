package com.project.bookingsystem.service.impl

import com.project.bookingsystem.dao.impl.FlightTicketDaoImpl
import com.project.bookingsystem.document.FlightTicket
import com.project.bookingsystem.service.FlightTicketService
import com.project.bookingsystem.util.DatabaseConnectionUtil
import com.mongodb.client.MongoCollection
import com.mongodb.client.MongoDatabase
import org.bson.Document

class FlightTicketServiceImpl : FlightTicketService {
    val database = DatabaseConnectionUtil().getDatabase()
    val flightTicketCollection: MongoCollection<Document> = database.getCollection("flight-ticket")

    val flightTicketDao = FlightTicketDaoImpl(flightTicketCollection)

    override fun bookFlightTicket(database: MongoDatabase, flightTicket: FlightTicket, collectionName: String) {
        flightTicketDao.bookFlightTicket(database, flightTicket, "flight_ticket")
    }

    override fun getFlightTicketForUser(flightTicketCollection: MongoCollection<Document>?, userName: String): FlightTicket {
        return flightTicketDao.getFlightTicketForUser(flightTicketCollection, userName)
    }
}