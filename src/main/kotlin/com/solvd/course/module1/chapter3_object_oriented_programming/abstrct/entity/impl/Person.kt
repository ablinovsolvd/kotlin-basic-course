package com.solvd.course.module1.chapter3_object_oriented_programming.abstrct.entity.impl

import com.solvd.course.module1.chapter3_object_oriented_programming.abstrct.entity.Human

class Person(
    name: String,
    override var age: Int
) : Human(name) {
    override fun hello() {
        println("My name is $name")
    }
}