package com.solvd.course.module1.chapter3_object_oriented_programming.shop.entity

open class ExpressOrder(
    orderId: Long,
    status: String,
    protected var expressFee: Double
) : Order(orderId, status) {
    override fun displayInfo() {
        println("Order #$orderId - Status: $status - Express Fee: $expressFee")
    }
}