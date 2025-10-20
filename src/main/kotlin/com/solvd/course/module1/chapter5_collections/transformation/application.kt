package com.solvd.course.module1.chapter5_collections.transformation

import com.solvd.course.module1.chapter5_collections.filtering.Person

fun main() {
    //Transformation
    //map()
    //flatMap()

    val people = listOf(
        Person("Tom", 19),
        Person("Sam", 20),
        Person("Bob", 21),
        Person("Kate", 21)
    )

    //Ex 1
    val names = people.map { it.name } //get each person's name
    println(names)

    //Ex 2
    val numbers = listOf(1, 2, 3, 4, 5)
    val squares = numbers.map { it * it }
    println(squares)

    //mapIndexed()
    val namesWithIndexes = people.mapIndexed { index, person -> "${index}: ${person.name}-${person.age}" }
    println(namesWithIndexes)

    val names1 = people.mapNotNull { if (it.name.length != 3) null else it.name }
    println(names1)

    //flatten()
    val st = listOf("A", "B")
    val personal = listOf(
        listOf("Tom", "Mike", "Bob"),
        listOf("Sam", "Kate"),
        listOf("Tom", "Bill"), st
    )

    val people1 = personal.flatten()
    println(people1)
}