package com.project.bookingsystem.service

import com.project.bookingsystem.document.Hotel
import com.project.bookingsystem.document.HotelTicket
import com.project.bookingsystem.document.Hotels
import com.mongodb.client.MongoCollection
import org.bson.Document
import bookingSystem.Booking

interface HotelService {

    fun reserveHotel(hotelTicket: HotelTicket, collectionName: String) : HotelTicket

    fun getHotelReservationByUser(hotelCollection: MongoCollection<Document>?, userName: String) : HotelTicket

    fun addHotel(hotelCollection: MongoCollection<Document>, hotelObject: Hotel)

    fun searchHotels(hotelLocation: String, hotelCollection: MongoCollection<Document>): Booking.Hotels

}