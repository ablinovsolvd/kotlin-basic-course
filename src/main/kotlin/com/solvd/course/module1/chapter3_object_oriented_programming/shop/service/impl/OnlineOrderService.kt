package com.solvd.course.module1.chapter3_object_oriented_programming.shop.service.impl

import com.solvd.course.module1.chapter3_object_oriented_programming.shop.service.AccountService
import com.solvd.course.module1.chapter3_object_oriented_programming.shop.entity.Order
import com.solvd.course.module1.chapter3_object_oriented_programming.shop.entity.status.OrderStatus
import com.solvd.course.module1.chapter3_object_oriented_programming.shop.service.OrderService


class OnlineOrderService(
    private val accountService: AccountService
) : OrderService {
    override fun processOrder(order: Order): Boolean {
        val account = order.getUser().getAccount()
        val amount = order.totalAmount()
        val success = accountService.withdraw(account, amount)

        if (success) {
            order.setStatus(OrderStatus.PAID)
            println("Order #${order.getId()} processed successfully for ${order.getUser().name}. Amount: $amount")
        } else {
            println("Order #${order.getId()} failed for ${order.getUser().name}. Not enough money!")
        }
        return success
    }

    override fun cancelOrder(order: Order): Boolean {
        if (order.getStatus() == OrderStatus.PAID) {
            val account = order.getUser().getAccount()
            val refundAmount = order.totalAmount()
            if (accountService.deposit(account, refundAmount)) {
                order.setStatus(OrderStatus.CANCELLED)
                println("Order #${order.getId()} cancelled and refunded. Status: ${order.getStatus()}")
                return true
            }
        } else {
            order.setStatus(OrderStatus.CANCELLED)
            println("Order #${order.getId()} cancelled before payment. Status: ${order.getStatus()}")
            return true
        }
        return false
    }
}
