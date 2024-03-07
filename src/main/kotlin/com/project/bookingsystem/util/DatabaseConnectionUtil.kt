package com.project.bookingsystem.util

import com.mongodb.client.MongoCollection
import com.mongodb.client.MongoDatabase
import org.bson.Document
import org.litote.kmongo.KMongo

class DatabaseConnectionUtil {

    fun getDatabase() : MongoDatabase {
        val client = KMongo.createClient()
        val database = client.getDatabase("bookings")
        return database
    }

    fun getCollection(collectionName: String): MongoCollection<Document> {
        val client = KMongo.createClient()
        val database = client.getDatabase("bookings")
        return database.getCollection(collectionName)
    }
}