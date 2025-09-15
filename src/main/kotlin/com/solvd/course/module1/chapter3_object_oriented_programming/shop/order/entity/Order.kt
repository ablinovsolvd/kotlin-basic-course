package com.solvd.course.module1.chapter3_object_oriented_programming.shop.order.entity

import com.solvd.course.module1.chapter3_object_oriented_programming.shop.user.entity.User

/**
 * Make an abstract class Order with:
 * Properties: orderId (Int), user (User)
 * Abstract function totalAmount(): Double
 * Open function displayInfo() that prints basic info about the order.
 */
abstract class Order(
    val orderId: Long,
    val user: User
) {
    abstract fun totalAmount(): Double

    open fun displayInfo() {
        println("Order #$orderId for ${user.name}")
    }
}
