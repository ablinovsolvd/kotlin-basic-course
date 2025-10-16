package com.solvd.course.module1.chapter3_object_oriented_programming.shop.entity

import com.solvd.course.module1.chapter3_object_oriented_programming.shop.entity.status.OrderStatus
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class OrderTest {
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

    /** Test that a regular order totals up the correct amount */
    @Test
    fun testOrderTotalAmount() {
        val user = makeUser()
        val products = products()
        val order = Order(1, user, products, user.address)

        assertEquals(12.0, order.totalAmount())
        assertEquals(OrderStatus.PENDING, order.getStatus())
    }

    /** Test that express order total includes the extra fee */
    @Test
    fun testExpressOrderTotalIncludesExtraFee() {
        val user = makeUser()
        val products = products()
        val expressFee = 5.99
        val expressOrder = ExpressOrder(1, user, products, user.address, expressFee)
        assertEquals(17.99, expressOrder.totalAmount(), 0.01)
    }

    /** Test that displayInfo for gift order includes the gift message */
    @Test
    fun testGiftOrderDisplayIncludesMessage() {
        val user = makeUser()
        val products = products()
        val expressFee = 5.99
        val giftMessage = "Happy Birthday"
        val giftOrder = GiftOrder(1, user, products, user.address, expressFee, giftMessage)

        //TODO check captureOutput()
        giftOrder.displayInfo()


    }
}





















