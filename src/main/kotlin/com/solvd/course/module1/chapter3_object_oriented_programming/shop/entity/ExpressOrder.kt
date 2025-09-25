package com.solvd.course.module1.chapter3_object_oriented_programming.shop.entity

import com.solvd.course.module1.chapter3_object_oriented_programming.shop.entity.status.OrderStatus

/**
 * Make a class ExpressOrder (inherits Order) with:
 *
 * Property expressFee (Double, protected)
 * Override totalAmount() to include the express fee.
 * Override displayInfo() to show all info.
 */
open class ExpressOrder(
    orderId: Int,
    user: User,
    products: List<Product>,
    deliveryAddress: Address,
    private val expressFee: Double,
    status: OrderStatus = OrderStatus.PENDING
) : Order(orderId, user, products, deliveryAddress, status) {

    override fun totalAmount(): Double {
        return super.totalAmount() + expressFee
    }

    override fun displayInfo() {
        super.displayInfo()
        println("Express Fee: $expressFee")
        println("Total with Express Fee: ${totalAmount()}")
    }
}
