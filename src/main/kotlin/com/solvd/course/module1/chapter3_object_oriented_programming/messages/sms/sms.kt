package com.solvd.course.module1.chapter3_object_oriented_programming.messages.sms


class Message(val text: String)

fun send(message: Message, phoneNumber: String) {
    println("Message `${message.text}` has been sent to $phoneNumber")
}