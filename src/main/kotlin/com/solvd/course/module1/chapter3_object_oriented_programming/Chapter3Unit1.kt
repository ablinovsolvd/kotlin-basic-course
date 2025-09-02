package com.solvd.course.module1.chapter3_object_oriented_programming

var age: Int = 18
    set(value) {
        if ((value > 0) and (value < 110)) {
            field = value
        }
    }
    get() {
        return field
    }

fun main() {
    var person: Person = Person("Artyom", "Blinou")
    var person2 = Person("Art","Blinou")

}