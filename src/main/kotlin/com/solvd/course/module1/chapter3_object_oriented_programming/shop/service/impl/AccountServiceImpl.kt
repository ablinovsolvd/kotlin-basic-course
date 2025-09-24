package com.solvd.course.module1.chapter3_object_oriented_programming.shop.service.impl

import com.solvd.course.module1.chapter3_object_oriented_programming.shop.entity.BankAccount
import com.solvd.course.module1.chapter3_object_oriented_programming.shop.service.AccountService

class AccountServiceImpl : AccountService {
    override fun withdraw(account: BankAccount, amount: Double): Boolean {
        return account.withdraw(amount)
    }

    override fun deposit(account: BankAccount, amount: Double): Boolean {
        return account.deposit(amount)
    }
}