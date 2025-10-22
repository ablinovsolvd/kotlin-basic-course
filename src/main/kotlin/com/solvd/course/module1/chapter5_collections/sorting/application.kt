package com.solvd.course.module1.chapter5_collections.sorting

fun main() {
    //sorted()
    //sortedDescending()

    val people = listOf("Tom", "Mike", "Bob", "Sam", "Alice", "Alex")
    val numbers = listOf(3, 5, 2, -4, -6, 9, 1)

    //Ascending order
    val sortedPeople = people.sorted()
    val sortedNumbers = numbers.sorted()
    //println(sortedPeople)
    //println(sortedNumbers)

    //Descending order
    //println(people.sortedDescending())
    //println(numbers.sortedDescending())

    val users = listOf(
        User("C", 41),
        User("A", 37),
        User("B", 25)
    )

    val sortedUsers = users.sorted()
    //println(sortedUsers)
    //println(users.sortedDescending())

    val students = listOf(
        Student("C", 41),
        Student("A", 37),
        Student("B", 25)
    )

    //println(students.sortedWith(studentByAgeAsc))
    //println(students.sortedWith(studentByAgeDsc))
    //println(students.sortedWith(studentByName))

    //println(students.sortedBy { it.age })

    //println(numbers.reversed())
    println(numbers.shuffled())

}

val studentByAgeAsc = Comparator { s1: Student, s2: Student -> s1.age - s2.age }
val studentByAgeDsc = Comparator { s1: Student, s2: Student -> s2.age - s1.age }
val studentByName = Comparator { s1: Student, s2: Student -> s1.name.compareTo(s2.name)  }

class Student(val name: String, val age: Int) {
    override fun toString(): String {
        return "$name ($age)"
    }
}

class User(val name: String, val age: Int): Comparable<User> {
    override fun compareTo(other: User): Int {
        return name.compareTo(other.name)
    }

    override fun toString(): String {
        return "$name ($age)"
    }
}