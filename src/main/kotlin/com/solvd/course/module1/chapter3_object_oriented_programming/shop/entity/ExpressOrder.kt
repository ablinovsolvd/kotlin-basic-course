package com.solvd.course.module1.chapter3_object_oriented_programming.shop.entity

/**
 * Make a class ExpressOrder (inherits Order) with:
 *
 * Property expressFee (Double, protected)
 * Override totalAmount() to include the express fee.
 * Override displayInfo() to show all info.
 */
/*
open class ExpressOrder(
    orderId: Long,
    user: User,
    protected var expressFee: Double,
    private val baseAmount: Double
) : Order(orderId, user) {

    override fun totalAmount(): Double {
        return baseAmount + expressFee
    }

    override fun displayInfo() {
        println("Order #$orderId for ${user.name} - " +
                "Express Fee: $expressFee - " +
                "Total: ${totalAmount()}")
    }
}

 */