package com.solvd.course.module1.chapter3_object_oriented_programming

/**
 * data class User private constructor(
 *     private var _name: String,
 *     private var _login: String,
 *     private var _password: String,
 *     private var _age: Int
 * ) {
 *
 *     // name property (getter and setter with validation)
 *     var name: String
 *         get() = _name
 *         set(value) {
 *             require(value.isNotBlank()) { "Имя не может быть пустым" }
 *             _name = value
 *         }
 */

class Person (
    private var _firstName: String,
    private var _lastName: String
) {
    var firstName: String
        get() {
            return _firstName
        }
        set(value) {
            _firstName = value
        }
}

fun main() {
    val person = Person("Artyom", "Blinov")
    person.firstName = "endofholiday"
    println(person.firstName)
}













