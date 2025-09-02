package com.solvd.course.module1.chapter3_object_oriented_programming

import com.solvd.course.module1.chapter3_object_oriented_programming.messages.email.Message as EmailMessage
import com.solvd.course.module1.chapter3_object_oriented_programming.messages.email.send as emailSend

import com.solvd.course.module1.chapter3_object_oriented_programming.messages.sms.Message as SmsMessage
import com.solvd.course.module1.chapter3_object_oriented_programming.messages.sms.send as smsSend

//Classes and Objects in OOP
fun main() {
    val myEmailMessage = EmailMessage("Hello World!")
    emailSend(myEmailMessage, "to@gmail.com")

    val mySmsMessage = SmsMessage("Hello My Dear Friend")
    smsSend(mySmsMessage, "+11234567890")
}
