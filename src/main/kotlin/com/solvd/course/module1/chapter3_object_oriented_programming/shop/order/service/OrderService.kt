package com.solvd.course.module1.chapter3_object_oriented_programming.shop.order.service

import com.solvd.course.module1.chapter3_object_oriented_programming.shop.order.entity.Order

interface OrderService {
    fun processOrder(order: Order): Boolean
}