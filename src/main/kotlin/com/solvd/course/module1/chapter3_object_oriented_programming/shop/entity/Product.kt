package com.solvd.course.module1.chapter3_object_oriented_programming.shop.entity

/**
 * Make Product a data class with:
 * id (Int)
 * name (String)
 * price (Double)
 */
data class Product(
    val id: Int,
    val name: String,
    val price: Double
)