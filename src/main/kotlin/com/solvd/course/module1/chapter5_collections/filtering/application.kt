package com.solvd.course.module1.chapter5_collections.filtering

import com.solvd.course.module1.chapter3_object_oriented_programming.abstrct.entity.Figure
import com.solvd.course.module1.chapter3_object_oriented_programming.abstrct.entity.impl.Circle
import com.solvd.course.module1.chapter3_object_oriented_programming.abstrct.entity.impl.Rectangle
import com.solvd.course.module2.entity.Square

fun main() {
    //filter()
    var people = listOf("Tom", "Sam", "Mike", "Bob", "Alice")
    people = people.filter { it.length == 3 }
    println(people)

    var employees = listOf(
        Person("Tom", 37),
        Person("Bob", 41),
        Person("Sam", 25)
    )
    employees = employees.filter { it.age > 30 }
    println(employees)

    var peopleNot = listOf("Tom", "Sam", "Mike", "Bob", "Alice")
    peopleNot = peopleNot.filterNot { it.length == 3 }
    println(peopleNot)

    //TODO: check Abstract class
    val peopleList = listOf(
        Person("Tom", 37), Student("Bob", 18),
        Person("Sam", 30), Student("Mike", 19)
    )
    val students = peopleList.filterIsInstance<Student>()
    println(students)

    var cars = listOf("Car1", null, "Car3", null)
    println(cars)
    val filteredCars = cars.filterNotNull()
    println(filteredCars)

    val square = Circle("Circle", 2F)
    val rectangle = Rectangle("Rectangle", 1F, 2F)
    val figures: List<Any> = listOf(square, rectangle, "NotFigure", 123)
    val filteredFigures = figures.filterIsInstance<String>()
    println(filteredFigures)
}

open class Person(val name: String,
                  val age: Int) {
    override fun toString(): String {
        return "$name : $age"
    }
}

class Student(name: String, age: Int): Person(name, age)









