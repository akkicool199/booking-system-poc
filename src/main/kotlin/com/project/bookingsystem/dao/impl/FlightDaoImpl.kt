package com.project.bookingsystem.dao.impl

import com.project.bookingsystem.dao.FlightDao
import com.project.bookingsystem.document.Flight
import com.mongodb.client.MongoCollection
import org.bson.Document

class FlightDaoImpl(flightCollection: MongoCollection<Document>?) : com.project.bookingsystem.dao.FlightDao {

    // insert flight
    override fun insertFlight(flightCollection: MongoCollection<Document>?, flight: Flight) {
        val flightDocument = Document("flightNumber", flight.flightNumber)
            .append("airline", flight.airline)
            .append("price", flight.price)
            .append("departureLocation", flight.departureLocation)
            .append("destinationLocation", flight.destinationLocation)

        flightCollection?.insertOne(flightDocument)
        println("Flight inserted successfully!")
    }

     override fun getAllFlights(flightCollection: MongoCollection<Document>?): List<Flight> {
        val flightDocuments = flightCollection?.find()?.toList()
        var flightsList : List<Flight> = emptyList()
        if (flightDocuments != null) {
            flightsList = flightDocuments.map { document ->
                Flight(
                    flightNumber = document.getString("flightNumber") ?: "",
                    airline = document.getString("airline") ?: "",
                    price = document.getDouble("price") ?: 0.0,
                    departureLocation = document.getString("departureLocation") ?: "",
                    destinationLocation = document.getString("destinationLocation") ?: ""
                )
            }.toList()
        }
        return flightsList
    }


    override fun searchFlight(
        departureLocation: String,
        destinationLocation: String,
        flightCollection: MongoCollection<Document>
    ): List<Flight> {
        // Define the filter criteria
        val filter = Document(
            mapOf(
                "departureLocation" to departureLocation,
                "destinationLocation" to destinationLocation
            )
        )

        // Search flights based on the filter criteria
        val flightDocuments = flightCollection.find(filter)

        var flightsList : List<Flight> = emptyList()

        flightsList = flightDocuments.map { document ->
            Flight(
                flightNumber = document.getString("flightNumber") ?: "",
                airline = document.getString("airline") ?: "",
                price = document.getDouble("price") ?: 0.0,
                departureLocation = document.getString("departureLocation") ?: "",
                destinationLocation = document.getString("destinationLocation") ?: ""
            )
        }.toList()

        return flightsList
    }
}
