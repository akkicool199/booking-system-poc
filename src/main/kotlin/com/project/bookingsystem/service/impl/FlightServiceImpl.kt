package com.project.bookingsystem.service.impl

import com.project.bookingsystem.dao.impl.FlightDaoImpl
import com.project.bookingsystem.document.Flight
import com.project.bookingsystem.service.FlightService
import com.project.bookingsystem.util.DatabaseConnectionUtil
import com.mongodb.client.MongoCollection
import org.bson.Document
import bookingSystem.FlightOuterClass
import bookingSystem.Booking

class FlightServiceImpl : FlightService {

    val database = DatabaseConnectionUtil().getDatabase()
    val flightCollection: MongoCollection<Document> = database.getCollection("flight")

    val flightDao = FlightDaoImpl(flightCollection)

    override suspend fun insertFlight(flightCollection:MongoCollection<Document>? , flight: Flight) {
        flightDao.insertFlight(flightCollection, flight)
    }

    override suspend fun getAllFlights(request: Booking.Empty): Booking.FlightList {
        // Get all flights details
        val flights: List<Flight> = flightDao.getAllFlights(flightCollection)

        // Convert List<Flight> to FlightList
        val flightsList: Booking.FlightList = Booking.FlightList.newBuilder()
            .addAllFlights(flights.map { flight ->
                FlightOuterClass.Flight.newBuilder()
                    .setFlightNumber(flight.flightNumber)
                    .setAirline(flight.airline)
                    .setPrice(flight.price)
                    .setDepartureLocation(flight.departureLocation)
                    .setDestinationLocation(flight.destinationLocation)
                    .build()
            })
            .build()

        return flightsList
    }

    override suspend fun searchFlight(
        departureLocation: String,
        destinationLocation: String,
        flightCollection: MongoCollection<Document>
    ): Booking.FlightList {

        val flights = flightDao.searchFlight(departureLocation, destinationLocation, flightCollection)

        // Convert List<Flight> to FlightList
        val flightsList: Booking.FlightList = Booking.FlightList.newBuilder()
            .addAllFlights(flights.map { flight ->
                FlightOuterClass.Flight.newBuilder()
                    .setFlightNumber(flight.flightNumber)
                    .setAirline(flight.airline)
                    .setPrice(flight.price)
                    .setDepartureLocation(flight.departureLocation)
                    .setDestinationLocation(flight.destinationLocation)
                    .build()
            })
            .build()

        return flightsList
    }
}