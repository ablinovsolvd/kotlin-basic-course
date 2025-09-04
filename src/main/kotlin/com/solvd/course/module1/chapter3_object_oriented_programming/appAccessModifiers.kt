package com.solvd.course.module1.chapter3_object_oriented_programming

import com.solvd.course.module1.chapter3_object_oriented_programming.entity.Person

/**
 * public
 * private
 * protected
 * internal
 */
fun main() {
    val user = User("Tom", 3)
    user.printPerson()


}
//TODO write simple back account
class User(
    private val name: String,
    private val age: Int,
) {

    fun printPerson() {
        printName()
        printAge()
    }

    private fun printName() {
        println("Name is $name")
    }

    private fun printAge() {
        println("Age is $age")
    }
}

class Person {
    public var name = "Undefined"
    private var age = 18

    public fun printPerson() {
        println("Name: $name, age: $age")
    }
}