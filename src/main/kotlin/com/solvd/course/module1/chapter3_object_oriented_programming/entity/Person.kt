package com.solvd.course.module1.chapter3_object_oriented_programming.entity

class Person(_name: String, _age: Int) {
    var name: String
    var age: Int = 18

    init {
        name = _name
        if ((_age > 0) && (_age < 100)) {
            age = _age
        }
    }
}