package com.solvd.course.module1.chapter3_object_oriented_programming.messages.email

class Message(val text: String)

fun send(message: Message, address: String) {
    println("Message `${message.text}` has been sent to $address")
}