package com.project.bookingsystem.service

import bookingSystem.*
import com.project.bookingsystem.document.*
import com.project.bookingsystem.exception.FlightException
import com.project.bookingsystem.service.impl.CarRentalServiceImpl
import com.project.bookingsystem.service.impl.FlightServiceImpl
import com.project.bookingsystem.service.impl.FlightTicketServiceImpl
import com.project.bookingsystem.service.impl.HotelServiceImpl
import com.google.gson.Gson
import com.mongodb.client.MongoCollection
import org.bson.Document
import org.litote.kmongo.KMongo
import bookingSystem.Booking.BookingResponse
import bookingSystem.Booking.FlightBookingRequest
import com.project.bookingsystem.exception.CarRentalException
import com.project.bookingsystem.exception.HotelException
import com.project.bookingsystem.util.DatabaseConnectionUtil
//import com.project.bookingsystem.util.SqsUtility

class BookingSytemImpl: BookingServiceGrpcKt.BookingServiceCoroutineImplBase() {

    val databaseConnectionUtil= DatabaseConnectionUtil()
    val flightCollection: MongoCollection<Document> =databaseConnectionUtil.getCollection("flight")
    val flightTicketCollection: MongoCollection<Document> = databaseConnectionUtil.getCollection("flight_ticket")
    val hotelCollection: MongoCollection<Document> = databaseConnectionUtil.getCollection("hotel")
    val hotelBookingCollection: MongoCollection<Document> = databaseConnectionUtil.getCollection("hotel-bookings")
    val carCollection: MongoCollection<Document> = databaseConnectionUtil.getCollection("car")

    val gson = Gson()

    val flightTicketservice = FlightTicketServiceImpl()
    val flightService = FlightServiceImpl()
    val hotelService = HotelServiceImpl()
    val carService = CarRentalServiceImpl()


    override suspend fun addFlight(request: FlightBookingRequest): BookingResponse {
        val flight = request.flight;
        val flightObject = Flight(
            flight.flightNumber, flight.airline, flight.price,
            flight.departureLocation, flight.destinationLocation
        )
        try {
            flightService.insertFlight(flightCollection, flightObject)
            //SqsUtility.publishEvent(flightObject)

        } catch (e: Exception) {
            throw FlightException("Error occurred while creating the flight data", e)
        }

        return Booking.BookingResponse.newBuilder()
            .setStatusCode("200 OK")
            .setMessage("Flight added successfully")
            .build()
    }

    override suspend fun searchFlight(request: Booking.SearchFlightRequest): Booking.FlightList {
        val departureLocation = request.departureLocation
        val destinationLocation = request.destinationLocation

        val flightList : Booking.FlightList = flightService.searchFlight(departureLocation, destinationLocation, flightCollection)
        //SqsUtility.publishEvent(flightList)
        return flightList
    }

    override suspend fun bookFlight(request: FlightBookingRequest): BookingResponse {
        val user = request.user;
        val flight = request.flight;
        val flightObject = Flight(
            flight.flightNumber, flight.airline, flight.price,
            flight.departureLocation, flight.destinationLocation
        )

        val flightTicket = FlightTicket(user, flightObject)

        try {
            val client = KMongo.createClient()
            val database = client.getDatabase("bookings")
            flightTicketservice.bookFlightTicket(database, flightTicket, "flight_ticket")
            //SqsUtility.publishEvent(flightTicket)

        } catch (e: Exception) {
            throw FlightException("Error occurred while booking the flight ticket", e)
        }
        val response = BookingResponse.newBuilder()
            .setStatusCode("200 OK")
            .setMessage("flight booked successfully")
            .build()
        return response
    }


    override suspend fun getAllFlights(request: Booking.Empty): Booking.FlightList {
        return flightService.getAllFlights(request)
    }


    override suspend fun getFlightTicketForUser(request: Booking.UserIdRequest): BookingResponse {
        val flightTicket: FlightTicket =
            flightTicketservice.getFlightTicketForUser(flightTicketCollection, request.userName)

        var flightTicketResponse = BookingResponse.newBuilder()
            .setStatusCode("200 OK")
            .setMessage("flight booking response : ${gson.toJson(flightTicket)}")
            .build()

        return flightTicketResponse
    }

    override suspend fun addHotel(request: Booking.AddHotelRequest): BookingResponse {
        val hotel = request.hotel
        val hotelObject = Hotel(
            hotel.hotelName, hotel.hotelLocation, hotel.checkinDate, hotel.checkoutDate
        )

        try {
            hotelService.addHotel(hotelCollection, hotelObject)
        }
        catch (e: Exception) {
            throw HotelException("Error occurred while booking the hotel", e)
        }
        //SqsUtility.publishEvent(hotelObject)
        val response = BookingResponse.newBuilder()
            .setStatusCode("200 OK")
            .setMessage("Hotel added successfully!")
            .build()

        return response
    }


    override suspend fun searchHotel(request: Booking.SearchHotelRequest): Booking.Hotels {
        val hotelLocation = request.hotelLocation
        val hotels : Booking.Hotels = hotelService.searchHotels(hotelLocation, hotelCollection)
        //SqsUtility.publishEvent(hotels)
        return hotels
    }

    override suspend fun bookHotel(request: Booking.HotelBookingRequest): Booking.BookingResponse {
        val user = request.user
        val hotel = request.hotel
        val hotelObject = Hotel(
            hotel.hotelName, hotel.hotelLocation, hotel.checkinDate, hotel.checkoutDate
        )

        val hotelTicket = HotelTicket(user, hotelObject)
        val hotelResponse: HotelTicket = hotelService.reserveHotel(hotelTicket, "hotel-bookings")
        //SqsUtility.publishEvent(hotelTicket)

        val response = BookingResponse.newBuilder()
            .setStatusCode("200 OK")
            .setMessage("hotel booked successfully : ${gson.toJson(hotelResponse)}")
            .build()
        return response
    }


    override suspend fun getHotelReservationByUser(request: Booking.UserIdRequest): BookingResponse {
        val user = request.userName
        val hotelTicket = hotelService.getHotelReservationByUser(hotelBookingCollection, user)
        val response = BookingResponse.newBuilder()
            .setStatusCode("200 OK")
            .setMessage("hotel booking response: ${gson.toJson(hotelTicket)}")
            .build()
        return response
    }

    override suspend fun rentCar(request: Booking.CarBookingRequest): Booking.BookingResponse {
        val user = request.user
        val car = request.car
        val carObject = Car(
            car.carNumberPlate, car.carNumberPlate, car.driverContact, car.travelDate
        )

        val carTicket = CarTicket(user, carObject)
        val carResponse : CarTicket?
        try {
            carResponse = carService.rentACar(carTicket, "car")
        }
        catch (e: Exception) {
            throw CarRentalException("Error occurred while booking the car", e)
        }
        //SqsUtility.publishEvent(carTicket)
        val response = BookingResponse.newBuilder()
            .setStatusCode("200 OK")
            .setMessage("car booked successfully : ${gson.toJson(carResponse)}")
            .build()
        return response
    }


    override suspend fun getCarBookingByUser(request: Booking.UserIdRequest): BookingResponse {
        val user = request.userName
        val carTicket = carService.getCarBookingByUser(carCollection, user)
        val response = BookingResponse.newBuilder()
            .setStatusCode("200 OK")
            .setMessage("car booking response: ${gson.toJson(carTicket)}")
            .build()
        return response
    }
}