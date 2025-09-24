package com.solvd.course.module1.chapter5_collections

fun main() {
    val numbers = listOf(1, 2, 3, 4) //List<Int> // immutable
    val people = listOf("Tom", "Sam", "Bob", "Alice") //List<String>

    val section = people[1]
    //println(section)

    val subPeople = people.subList(1, 3)
    //println(subPeople)

    val numbers2 = mutableListOf(1, 2, 3, 3, 2, 3)
    println(numbers2)
    //numbers2.add(1)
    //numbers2.add(0, 100)
    numbers2.remove(3)

    println(numbers2)

    val a: Iterable<Int>
    val b: MutableIterable<Int>
}