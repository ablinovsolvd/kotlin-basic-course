package com.solvd.course.module1.chapter5_collections.checking_elements

fun main() {
    //all()  //every element returns true
    //any()  //any element returns true
    //none() //none of the element return true

    val people = listOf("Tom", "Sam", "Mike", "Bob", "Alice")

    //all()
    var result = people.all { it.length == 3 }
    println(result)
    result = people.all { it.length != 10 }
    println(result)

    //none()
    result = people.none { it.length == 3 }
    println(result)
    result = people.none { it.length == 2 }
    println(result)

    //any()
    result = people.any { it.length == 3 }
    println(result)
    result = people.any { it.length == 10 }
    println(result)

    println("------")
    val buffer: List<String> = listOf()
    println(buffer.any())  //false
    println(buffer.none()) //true

    println("------")
    //contains()
    println(people.contains("Sam"))  // true
    println(people.contains("Bill")) // false
    println("------")
    println(people.containsAll(listOf("Sam", "Bill")))
}