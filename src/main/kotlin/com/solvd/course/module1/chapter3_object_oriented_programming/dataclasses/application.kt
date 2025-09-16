package com.solvd.course.module1.chapter3_object_oriented_programming.dataclasses

fun main() {
    val student = Student("Tom", 24)
    val person = student.copy(name = "Alice")

    val (username, userage) = student
    println("Name: $username, Age: $userage")

}

/**
 * equals()
 * hashCode()
 * toString()
 * copy()
 */
data class Student(
    val name: String,
    val age: Int
)