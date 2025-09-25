package com.solvd.course.module1.chapter3_object_oriented_programming.shop.entity

import com.solvd.course.module1.chapter3_object_oriented_programming.shop.entity.status.OrderStatus
import com.solvd.course.module1.chapter3_object_oriented_programming.shop.service.Trackable

/**
 * Order (Regular, Express, Gift)
 * Make Order a concrete class with:
 *
 * orderId (Int)
 * user (User)
 * products (List of Product)
 * deliveryAddress (Address)
 * status (OrderStatus)
 * Function totalAmount(): Double
 * Function displayInfo()
 * Implements Trackable (interface with track() that prints status)
 * All fields must be encapsulated.
 * Make ExpressOrder and GiftOrder inherit from Order:
 *
 * ExpressOrder adds protected expressFee (Double).
 * GiftOrder adds giftMessage (String).
 */
open class Order(
    private val orderId: Int,
    private val user: User,
    private val products: List<Product>,
    private val deliveryAddress: Address,
    private var status: OrderStatus = OrderStatus.PENDING
): Trackable {

    open fun totalAmount(): Double {
        return products.sumOf { it.price }
    }

    open fun displayInfo() {
        println("-----------------------")
        println("ORDER INFO:")
        println("Order #$orderId for ${user.name} - Status: $status")
        println("Delivery Address: $deliveryAddress")
        println("Products:")
        products.forEach { product: Product ->
            println(" - ${product.name} @ ${product.price}")
        }
        println("Total: ${totalAmount()}")
        println("-----------------------")
    }

    override fun track() {
        println("Order #$orderId is currently $status")
    }

    fun getStatus(): OrderStatus {
        return status
    }

    fun setStatus(newStatus: OrderStatus) {
        status = newStatus
    }

    fun getId(): Int {
        return orderId
    }

    fun getUser(): User {
        return user
    }

    fun getProducts(): List<Product> {
        return products
    }

    fun getDeliveryAddress(): Address {
        return deliveryAddress
    }
}
