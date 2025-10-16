package com.solvd.course.module1.chapter3_object_oriented_programming.shop.service.impl

import com.solvd.course.module1.chapter3_object_oriented_programming.shop.entity.*
import com.solvd.course.module1.chapter3_object_oriented_programming.shop.entity.status.OrderStatus
import com.solvd.course.module1.chapter3_object_oriented_programming.shop.service.OrderService
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class OnlineOrderServiceTest {

    private val accountService = AccountServiceImpl()
    private val orderService = OnlineOrderService(accountService)

    // Helper to create a sample user for orders
    private fun makeUser(): User {
        val address = Address("Street", "City", "12345", "Country")
        val account = BankAccount(100.0)
        return User(1, "UserName", "email@email.com", "+123456789", address, account)
    }

    //Helper ro provide a common list of products
    private fun products(): List<Product> {
        return listOf(
            Product(1, "Product 1", 10.0),
            Product(2, "Product 2", 2.0)
        )
    }

    /** Test that processing an order works if the user has enough money */
    @Test
    fun testOrderProcessingSucceedsIfEnoughMoney() {
        val user = makeUser()
        val products = products()
        val order = Order(1, user, products, user.address)
        val success = orderService.processOrder(order)

        assertTrue(success, "Should succeed if enough money")
        assertEquals(OrderStatus.PAID, order.getStatus())
        assertEquals(88.0, user.getAccount().getBalance())
    }
}