package com.solvd.course.module1.chapter5_collections

fun main() {
    val numbers: Array<Int> = arrayOf(1, 2, 3,4 ,5)
    val people: Array<String> = arrayOf("Tom", "Sam", "Kate")
    val first = people.getOrNull(3)
    val second = people.getOrElse(3) { "Invalid index $it" }
    //println(first)
    //println(second)

    people.set(0, "Tomas")
    people[1] = "Robert"
    //println(people[0])
    //println(people[1])

    val students = arrayOfNulls<String>(3) // [null, null, null]
    //println(students.toList())

    //var i = 1
    //val numbers2 = Array(3) { i++ * 2} // [2, 4, 6]
    //println(numbers2.toList())


    /**
     * size
     * lastIndex (size - 1)
     * indices (range)
     */
    val users = arrayOf("Tom", "Sam", "Kate")
    //println(users.size) //3
    //println(users.lastIndex) //2
    //println(users.indices) //0..2
    for (user in users) {
        //println("Hello $user")
    }
    for(i in 0..users.lastIndex) {
        //println("${i + 1} - ${users[i]}")
    }

    val numberOfUsers = arrayOf(1, 2, 3, 4, 5)
    for(i in 0..numberOfUsers.lastIndex) {
        numberOfUsers[i] = numberOfUsers[i] * numberOfUsers[i]
    }
    //println(numberOfUsers.toList())

    var i = 0
    while (i in users.indices) {
        //println("User ${users[i]}")
        i++
    }

    //users.forEach { u -> println(u) }
    users.forEachIndexed { index, user -> println("$index. $user") }
}







