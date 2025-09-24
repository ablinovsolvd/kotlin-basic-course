package com.solvd.course.module1.chapter3_object_oriented_programming.shop.service

import com.solvd.course.module1.chapter3_object_oriented_programming.shop.entity.Order

interface OrderService {
    fun processOrder(order: Order): Boolean
    fun cancelOrder(order: Order): Boolean
}