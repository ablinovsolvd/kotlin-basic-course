package com.solvd.course.module1.chapter3_object_oriented_programming.shop.banckaccount.service

import com.solvd.course.module1.chapter3_object_oriented_programming.shop.banckaccount.entity.BankAccount

interface AccountService {
    fun withdraw(account: BankAccount, amount: Double): Boolean
    fun deposit(account: BankAccount, amount: Double): Boolean
}