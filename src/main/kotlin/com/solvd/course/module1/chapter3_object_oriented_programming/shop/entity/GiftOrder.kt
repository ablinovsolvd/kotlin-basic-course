package com.solvd.course.module1.chapter3_object_oriented_programming.shop.entity

import com.solvd.course.module1.chapter3_object_oriented_programming.shop.entity.status.OrderStatus

/**
 * Make a class GiftOrder (inherits ExpressOrder) with:
 *
 * Property giftMessage (String)
 * Override displayInfo() to show all info including the gift message.
 */
class GiftOrder(orderId: Int,
                user: User,
                products: List<Product>,
                deliveryAddress: Address,
                expressFee: Double,
                private val giftMessage: String,
                status: OrderStatus = OrderStatus.PENDING
) : ExpressOrder(orderId, user, products, deliveryAddress, expressFee, status) {

    override fun displayInfo() {
        super.displayInfo()
        println("Gift Message: \"$giftMessage\"")
    }
}
