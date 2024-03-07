package com.project.bookingsystem.dao

import com.project.bookingsystem.document.Flight
import com.mongodb.client.MongoCollection
import org.bson.Document

interface FlightDao {
    /**
     * insert flight into db
     */
    fun insertFlight(flightCollection: MongoCollection<Document>?, flight: Flight)

    /**
     * get all the flights from db
     */
    fun getAllFlights(flightCollection: MongoCollection<Document>?): List<Flight>

    /**
     * search flights from db
     */
    fun searchFlight(departureLocation: String, destinationLocation: String, flightCollection: MongoCollection<Document>): List<Flight>

}