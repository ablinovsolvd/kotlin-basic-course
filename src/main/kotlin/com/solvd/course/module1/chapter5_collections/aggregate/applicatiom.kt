package com.solvd.course.module1.chapter5_collections.aggregate

fun main() {
    //minOrNull()
    //maxOrNull()

    val people = listOf("Tom", "Mike", "Bob", "Sam", "Alice", "Alex")
    val numbers = listOf(3, 5, 2, -4, -6, 9, 1)

    //println(people.minOrNull())
    //println(people.maxOrNull())

    //println(numbers.minOrNull())
    //println(numbers.maxOrNull())

    val people1 = listOf(
        Person("Tom", 37),
        Person("Bob", 19),
        Person("Sam", 25)
    )
    val personWithMinAge = people1.minByOrNull { it.age }
    println(personWithMinAge)

    //minOfOrNull
    //maxOfOrNull
    val minAge = people1.minOfOrNull { it.age }
    println(minAge)

    val numbers1 = listOf(1, 2, 3, 4, 5)
    val avg = numbers1.average();
    val sum = numbers1.sum()
    println(avg)
    println(sum)

    val result = numbers1.reduce { a, b -> a * b }
    println(result)

}

class Person(val name: String, val age: Int) {
    override fun toString(): String {
        return "$name ($age)"
    }
}