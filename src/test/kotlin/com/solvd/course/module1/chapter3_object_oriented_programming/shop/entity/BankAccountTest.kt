package com.solvd.course.module1.chapter3_object_oriented_programming.shop.entity

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class BankAccountTest {
    private val mockAccount = BankAccount(100.0)

    /** Test that deposit correctly adds money to the account */
    @Test
    fun testDepositAddsMoney() {
        // Deposit a valid positive amount
        val success = mockAccount.deposit(50.0)
        assertTrue(success, "Deposit should succeed for positive amount")
        assertEquals(150.0, mockAccount.getBalance())
    }

    /** Test that deposit fails for negative amounts */
    @Test
    fun testDepositFailsIfNegative() {
        // Try to deposit a negative amount
        val success = mockAccount.deposit(-5.0)
        assertFalse(success, "Deposit should fail for negative amount")
        assertEquals(100.0, mockAccount.getBalance())
    }

    /** Test that withdraw correctly removes if enough funds exist */
    @Test
    fun testWithdrawRemovesMoney() {
        // Withdraw an amount lass than balance
        val success = mockAccount.withdraw(60.0)
        assertTrue(success, "Withdraw should succeed if enough money")
        assertEquals(40.0, mockAccount.getBalance())
    }

    /** Test that withdraw fails if not enough money */
    @Test
    fun testWithdrawFailsIfNotEnoughMoney() {
        // Try to withdraw more than available
        val success = mockAccount.withdraw(110.0)
        assertFalse(success, "Withdraw should fail if not enough money")
        assertEquals(100.0, mockAccount.getBalance())
    }
}





