package com.solvd.course.module1.chapter5_collections

fun main() {
    val people = setOf("Tom", "Sam", "Bob", "Alice")
    val employee = listOf("Tom", "Sam", "Kate", "Mike")

    val all = people union employee
    val common = people intersect employee
    val different = employee subtract people

    println(all)
    println(common)
    println(different)



    val numbers1: HashSet<Int> = hashSetOf(5, 6, 7) //O(1)
    val numbers2: LinkedHashSet<Int> = linkedSetOf(1, 2, 3) //O(1)
    val numbers3: MutableSet<Int> = mutableSetOf(1, 2, 3) //O(log(n))
}