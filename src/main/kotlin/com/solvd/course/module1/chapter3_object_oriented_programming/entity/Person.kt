package com.solvd.course.module1.chapter3_object_oriented_programming.entity

//TODO
class Person(val firstName: String, val lastName: String) {
    val fullInfo: String
        get() {
            return "$firstName $lastName, age: $age"
        }
    private var _age = 1
    var age: Int
        set(value) {
            if (value in 0 .. 100) {
                _age =value
            }
        }
        get() = _age
}
