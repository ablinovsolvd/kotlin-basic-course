package com.solvd.course.module1.chapter3_object_oriented_programming.shop

import com.solvd.course.module1.chapter3_object_oriented_programming.shop.banckaccount.entity.BankAccount
import com.solvd.course.module1.chapter3_object_oriented_programming.shop.banckaccount.service.impl.AccountServiceImpl
import com.solvd.course.module1.chapter3_object_oriented_programming.shop.order.entity.ExpressOrder
import com.solvd.course.module1.chapter3_object_oriented_programming.shop.order.entity.GiftOrder
import com.solvd.course.module1.chapter3_object_oriented_programming.shop.order.service.impl.OnlineOrderService
import com.solvd.course.module1.chapter3_object_oriented_programming.shop.user.entity.User

/**
 * 6. Main Scenario
 * Create a user with some money in the bank.
 * Make a few orders: regular, express, gift.
 * Process the orders using the services.
 * Print all info: balances, order details, and show what happens if the user does not have enough money.
 */
fun main() {
    val account = BankAccount(50.0)
    val user = User("Alice", account)
    user.showBalance()

    val accountService = AccountServiceImpl() //Apple
    val orderService = OnlineOrderService(accountService)

    val expressOrder = ExpressOrder(1001L, user, 10.0, 43.0)
    expressOrder.displayInfo()

    val giftOrder = GiftOrder(2002L, user, 3.0, 7.0, "Happy Birthday!")
    giftOrder.displayInfo()

    orderService.processOrder(expressOrder)
    orderService.processOrder(giftOrder)
    user.showBalance()
}