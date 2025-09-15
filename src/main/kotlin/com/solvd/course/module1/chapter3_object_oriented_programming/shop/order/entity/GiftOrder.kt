package com.solvd.course.module1.chapter3_object_oriented_programming.shop.order.entity

import com.solvd.course.module1.chapter3_object_oriented_programming.shop.user.entity.User

/**
 * Make a class GiftOrder (inherits ExpressOrder) with:
 *
 * Property giftMessage (String)
 * Override displayInfo() to show all info including the gift message.
 */
class GiftOrder(orderId: Long,
                user: User,
                expressFee: Double,
                baseAmount: Double,
                val giftMessage: String
) : ExpressOrder(orderId, user, expressFee, baseAmount) {
    override fun displayInfo() {
        println("Order #$orderId for ${user.name} - " +
                "Express Fee: $expressFee - " +
                "Total: ${totalAmount()} - " +
                "Gift Message: $giftMessage")
    }
}
