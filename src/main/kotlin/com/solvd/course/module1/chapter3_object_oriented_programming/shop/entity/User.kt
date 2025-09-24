package com.solvd.course.module1.chapter3_object_oriented_programming.shop.entity

/**
 * Make User a data class with:
 * id (Int)
 * name (String)
 * email (String)
 * phone (String)
 * address (Address)
 * Private property account (BankAccount)
 * Function showBalance() to print current balance.
 */
data class User(
    val id: Int,
    val name: String,
    val email: String,
    val phone: String,
    val address: Address,
    private val account: BankAccount
) {
    fun showBalance() {
        println("$name's balance: ${account.getBalance()}")
    }

    fun getAccount(): BankAccount {
        return account;
    }
}