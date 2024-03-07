package com.project.bookingsystem.dao

import com.project.bookingsystem.document.Hotel
import com.project.bookingsystem.document.HotelTicket
import com.project.bookingsystem.document.Hotels
import com.mongodb.client.MongoCollection
import com.mongodb.client.MongoDatabase
import org.bson.Document

interface HotelDao {
    /**
     * add Hotel
     */
    fun addHotel(hotelCollection: MongoCollection<Document>, hotelObject: Hotel)

    /**
     * book hotel
     */
    fun bookHotel(database: MongoDatabase, hotelTicket: HotelTicket, collectionName: String): HotelTicket

    /**
     * get booked hotel for user
     */
    fun getHotelReservationByUser(hotelCollection: MongoCollection<Document>?, userName: String) : HotelTicket

    /**
     * search hotels
     */
    fun searchHotels(hotelLocation: String, hotelCollection: MongoCollection<Document>): List<Hotel>

}