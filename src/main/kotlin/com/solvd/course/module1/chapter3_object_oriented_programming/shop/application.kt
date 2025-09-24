package com.solvd.course.module1.chapter3_object_oriented_programming.shop

import com.solvd.course.module1.chapter3_object_oriented_programming.shop.entity.*
import com.solvd.course.module1.chapter3_object_oriented_programming.shop.service.impl.AccountServiceImpl
//import com.solvd.course.module1.chapter3_object_oriented_programming.shop.entity.ExpressOrder
//import com.solvd.course.module1.chapter3_object_oriented_programming.shop.entity.GiftOrder
import com.solvd.course.module1.chapter3_object_oriented_programming.shop.service.impl.OnlineOrderService

/**
 * 6. Main Scenario
 * Create a user with some money in the bank.
 * Make a few orders: regular, express, gift.
 * Process the orders using the services.
 * Print all info: balances, order details, and show what happens if the user does not have enough money.
 */

fun main() {
    val address = Address("123 Main St", "Springfield", "12345", "Disnayland")
    val account = BankAccount(200.0)
    val user = User(1, "Tom", "tom@email.com", "+1234567890", address, account)

    val p1 = Product(1, "laptop", 120.0)
    val p2 = Product(1, "Mouse", 25.0)
    val p3 = Product(1, "Mug", 10.0)

    val cart = Cart()
    cart.addProduct(p1)
    cart.addProduct(p2)
    cart.addProduct(p3)

    val accountService = AccountServiceImpl()
    val orderService = OnlineOrderService(accountService)

    val order = Order(101, user, cart.getProducts(), address)

    order.displayInfo()
    order.track()
    orderService.processOrder(order)
    order.track()

    user.showBalance()
    println("-----------------------")
    orderService.cancelOrder(order)
    user.showBalance()
}
