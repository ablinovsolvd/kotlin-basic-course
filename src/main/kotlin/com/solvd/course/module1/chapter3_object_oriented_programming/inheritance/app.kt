package com.solvd.course.module1.chapter3_object_oriented_programming.inheritance


//Inheritance
fun main() {
    val tom = Person("Tom")
    tom.age = 17
    tom.description()
    println(tom.fullInfo)

    val bob = Employee("Bob", "Meta")
    bob.age = 18
    bob.description()
    println(bob.fullInfo)

    val john = Manager("John", "Meta")
    john.age = 45
    john.description()
    println(john.fullInfo)
}

open class Person(val name: String) {
    open val fullInfo: String
        get() {
            return "Person $name - $age"
        }
    open var age: Int = 1
        set(value) {
            if (value in 1 .. 100) {
                field = value
            }
        }
    open fun description() {
        println("Desc of Person($name) - Non Employee")
    }
}

open class Employee(name: String, val company: String) : Person(name) {
    override val fullInfo: String
        get() {
            return "Employee $name - $age"
        }
    override var age: Int = 18
        set(value) {
            if (value in 18 ..100) {
                field = value
            }
        }
    override fun description() {
        println("Desc of Employee($name): $company")
    }
}

open class Manager(name: String, company: String) : Employee(name, company) {
    override val fullInfo: String
        get() {
            return "Employee $name - $age"
        }
    override var age: Int = 18
        set(value) {
            if (value in 18 ..100) {
                field = value
            }
        }
    final override fun description() {
        println("Desc of Manager($name): $company, position: CTO")
    }
}


















