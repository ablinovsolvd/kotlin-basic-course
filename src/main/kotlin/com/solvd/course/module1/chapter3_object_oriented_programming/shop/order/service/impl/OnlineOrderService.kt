package com.solvd.course.module1.chapter3_object_oriented_programming.shop.order.service.impl

import com.solvd.course.module1.chapter3_object_oriented_programming.shop.banckaccount.service.AccountService
import com.solvd.course.module1.chapter3_object_oriented_programming.shop.order.entity.Order
import com.solvd.course.module1.chapter3_object_oriented_programming.shop.order.service.OrderService

class OnlineOrderService(
    private val accountService: AccountService
) : OrderService {
    override fun processOrder(order: Order): Boolean {
        val amount = order.totalAmount()
        val success = accountService.withdraw(order.user.account, amount)

        if (success) {
            println("Order #${order.orderId} processed successfully for ${order.user.name}. Amount: $amount")
        } else {
            println("Order #${order.orderId} failed for ${order.user.name}. Not enough money!")
        }
        return success
    }
}