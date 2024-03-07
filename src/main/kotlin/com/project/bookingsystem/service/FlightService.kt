package com.project.bookingsystem.service

import com.project.bookingsystem.document.Flight
import com.mongodb.client.MongoCollection
import org.bson.Document
import bookingSystem.Booking

interface FlightService {
    /**
     * insert flights record
     */
    suspend fun insertFlight(flightCollection: MongoCollection<Document>?, flight: Flight)

    /**
     * get all flights
     */
    suspend fun getAllFlights(request: Booking.Empty): Booking.FlightList

    /**
     * search flights for a source and destination
     */
    suspend fun searchFlight(departureLocation: String, destinationLocation: String, flightCollection: MongoCollection<Document>): Booking.FlightList

}