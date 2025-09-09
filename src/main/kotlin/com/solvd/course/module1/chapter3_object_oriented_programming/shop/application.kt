package com.solvd.course.module1.chapter3_object_oriented_programming.shop

import com.solvd.course.module1.chapter3_object_oriented_programming.shop.entity.ExpressOrder
import com.solvd.course.module1.chapter3_object_oriented_programming.shop.entity.GiftOrder
import com.solvd.course.module1.chapter3_object_oriented_programming.shop.entity.Order

/**
 * You are working on an online shopping system.
 *
 * - There is a class `Order` with properties like `orderId` and `status`, and a function `displayInfo()` that shows basic info about the order.
 * - Make a class `ExpressOrder` that comes from `Order` and adds the property `expressFee`.
 * - Override `displayInfo()` in `ExpressOrder` so it shows all order info plus the express fee.
 * - Make another class `GiftOrder` that comes from `ExpressOrder` and adds a property `giftMessage`.
 * - Override `displayInfo()` in `GiftOrder` so it shows all info, fee, and the gift message.
 *
 * **Extra:**
 * Use access modifiers so that `expressFee` can only be changed inside `ExpressOrder` and its subclasses, but not from outside.
 */
fun main() {
    val order = Order(1001L, "PENDING")
    order.displayInfo()

    val express = ExpressOrder(1002L, "SHIPPED", 5.0)
    express.displayInfo()

    val gift = GiftOrder(1003, "DELIVERED", 7.0, "Happy Birthday!")
    gift.displayInfo()
}