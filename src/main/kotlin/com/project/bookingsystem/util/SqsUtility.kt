/*
package com.project.bookingsystem.util

import software.amazon.awssdk.services.sqs.SqsClient
import software.amazon.awssdk.services.sqs.model.SendMessageRequest


class SqsUtility {
    val sqsClient = SqsClient.create()

    fun publishEvent(message: String) {
        val queueUrl = "https://sqs.us-west-2.amazonaws.com/123456789012/MyQueue"
        val request = SendMessageRequest.builder()
            .queueUrl(queueUrl)
            .messageBody(message)
            .build()
        sqsClient.sendMessage(request)
    }
}*/
