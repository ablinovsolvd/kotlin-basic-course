package com.solvd.course.module1.chapter3_object_oriented_programming.shop.entity

class GiftOrder(orderId: Long,
                status: String,
                expressFee: Double,
                val giftMessage: String
) : ExpressOrder(orderId, status, expressFee) {
    override fun displayInfo() {
        println("Order #$orderId - Status: $status - Express Fee: $expressFee - Gift Message: $giftMessage")
    }
}