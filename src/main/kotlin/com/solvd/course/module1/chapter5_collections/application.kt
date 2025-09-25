package com.solvd.course.module1.chapter5_collections

fun main() {
    val people = setOf("Tom", "Sam", "Bob", "Alice")
    val employee = listOf("Tom", "Sam", "Kate", "Mike")

    val all = people union employee
    val common = people intersect employee
    val different = employee subtract people

    //println(all)
    //println(common)
    //println(different)


    //Set
    val numbers1: HashSet<Int> = hashSetOf(5, 6, 7) //O(1)
    val numbers2: LinkedHashSet<Int> = linkedSetOf(1, 2, 3) //O(1)
    val numbers3: MutableSet<Int> = mutableSetOf(1, 2, 3) //O(log(n))

    //Map
    val students: Map<Int, String> = mapOf(101 to "Tom", 102 to "Sam", 91 to "Bob") //Map<Int, String>
    for (student in students) {
        val key = student.key
        val value = student.value
        //println("$key-$value")
    }
    //println(students)

    val dictionary = mapOf("red" to "czerwony", "blue" to "niebeski", "green" to "zielony")
    val blue = dictionary["blue"]
    //println(blue)

    val yellow = dictionary.getOrDefault("yellow", "Not found")
    //val yellow = dictionary.getOrElse("yellow") {"Not found"}
    //println(yellow)

    //println("keys of dictionary: ${dictionary.keys}")
    //println("values of dictionary: ${dictionary.values}")

    val workers = mutableMapOf(1 to "Tom", 2 to "Sam", 3 to "Bob")
    val hashMap = hashMapOf("a" to "A", "b" to "B")

    workers.put(5, "Alice")
    workers[4] = "Bob"

    workers.set(11, "Dima")
    workers[10] = "Tomas"
    println(workers)

    workers.remove(11, "Dima")
    println(workers)

}