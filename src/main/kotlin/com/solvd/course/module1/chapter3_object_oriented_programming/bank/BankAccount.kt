package com.solvd.course.module1.chapter3_object_oriented_programming.bank

/**
 * Task 1: Safe Bank Account
 *
 * Create a class BankAccount with the following:
 *
 * A private property balance (Double) that stores the account balance.
 * A public function deposit(amount: Double) that adds money to the balance.
 * A public function getBalance() that returns the current balance.
 * Try to access the balance directly from outside the class and see what happens.
 */

class BankAccount {
    private var balance: Double = 0.0

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
        }
    }

    fun getBalanceFun(): Double {
        return balance
    }
}

fun main() {
    val bankAccount = BankAccount()
    var balance = bankAccount.getBalanceFun()
    println("Before: $balance")
    bankAccount.deposit(150.0)
    balance = bankAccount.getBalanceFun()
    println("After: $balance")
}