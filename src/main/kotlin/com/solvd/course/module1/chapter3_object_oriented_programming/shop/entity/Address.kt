package com.solvd.course.module1.chapter3_object_oriented_programming.shop.entity

/**
 * Make Address a data class with:
 * street (String)
 * city (String)
 * zip (String)
 * country (String)
 */
data class Address(
    val street: String,
    val city: String,
    val zip: String,
    val country: String
)