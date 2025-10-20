package com.solvd.course.module1.chapter5_collections.grouping

fun main() {
    //groupBy()
    val employee = listOf(
        Employee("Tom", "Microsoft"),
        Employee("Bob", "JetBrains"),
        Employee("Sam", "Google"),
        Employee("Alice", "Microsoft"),
        Employee("Kate", "Google")
    )

    val companies = employee.groupBy { it.company }
    println(companies)
    for (company in companies) {
        println(company.key)
        for (e in company.value) {
            println("-${e.name}")
        }
    }
}

class Employee(val name: String, val company: String) {
    override fun toString(): String {
        return name
    }
}