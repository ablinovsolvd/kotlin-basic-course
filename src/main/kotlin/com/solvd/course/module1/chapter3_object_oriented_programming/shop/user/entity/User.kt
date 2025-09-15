package com.solvd.course.module1.chapter3_object_oriented_programming.shop.user.entity

import com.solvd.course.module1.chapter3_object_oriented_programming.shop.banckaccount.entity.BankAccount

class User(val name: String, val account: BankAccount) {
    fun showBalance() {
        println("$name's balance: ${account.getBalance()}")
    }
}