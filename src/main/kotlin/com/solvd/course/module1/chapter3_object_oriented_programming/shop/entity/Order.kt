package com.solvd.course.module1.chapter3_object_oriented_programming.shop.entity

open class Order(val orderId: Long, val status: String) {
    open fun displayInfo() {
        println("Order #$orderId - Status: $status")
    }
}
