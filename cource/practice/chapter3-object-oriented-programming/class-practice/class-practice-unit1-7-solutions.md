# Solutions & Explanations — Class Practice Tasks (Units 1-7)

---

## Task 1: Social Media User

### Class definition

```kotlin
class User(val name: String, age: Int) {
    var age: Int = age
        set(value) {
            if (value in 13..120) field = value
        }

    fun sendMessage() {
        println("Hello from $name!")
    }

    val isTeen: Boolean
        get() = age in 13..19
}
```

### Main usage

```kotlin
fun main() {
    val user1 = User("Alice", 15)
    val user2 = User("Bob", 25)

    user1.sendMessage() // Hello from Alice!
    user2.sendMessage() // Hello from Bob!

    println("Is ${user1.name} a teen? ${user1.isTeen}") // true
    println("Is ${user2.name} a teen? ${user2.isTeen}") // false

    user2.age = 10 // Won't change
    println("${user2.name}'s age: ${user2.age}") // 25
}
```

---

## Task 2: Employee Access Control

### Class definition

```kotlin
class Employee(val name: String, private var salary: Double) {

    fun showInfo() {
        println("Employee: $name, Salary: $salary")
    }

    fun giveRaise(amount: Double) {
        if (amount > 0) salary += amount
    }
}
```

### Main usage

```kotlin
fun main() {
    val emp = Employee("Jane", 50000.0)

    emp.showInfo() // Employee: Jane, Salary: 50000.0
    emp.giveRaise(5000.0)
    emp.showInfo() // Employee: Jane, Salary: 55000.0

    // println(emp.salary) // Error! salary is private
    // emp.salary = 100000.0 // Error! salary is private
}
```

---

## Task 3: Student Grades with Inheritance

### Class definitions

```kotlin
open class Student(val name: String, protected var grade: Int) {
    fun showGrade() {
        println("$name's grade: $grade")
    }
}

class HonorsStudent(name: String, grade: Int) : Student(name, grade) {
    fun boostGrade() {
        grade = minOf(grade + 5, 100)
    }
}
```

### Main usage

```kotlin
fun main() {
    val stu = Student("Max", 88)
    val honors = HonorsStudent("Lily", 95)

    stu.showGrade() // Max's grade: 88
    honors.showGrade() // Lily's grade: 95

    honors.boostGrade()
    honors.showGrade() // Lily's grade: 100

    // println(stu.grade) // Error! grade is protected
    // println(honors.grade) // Error! grade is protected
}
```

---

## Task 4: Online Orders with Inheritance & Overriding

### Class definitions

```kotlin
open class Order(val orderId: Int, val status: String) {
    open fun displayInfo() {
        println("Order #$orderId - Status: $status")
    }
}

open class ExpressOrder(
    orderId: Int,
    status: String,
    protected var expressFee: Double
) : Order(orderId, status) {
    override fun displayInfo() {
        println("Order #$orderId - Status: $status - Express Fee: $expressFee")
    }
}

class GiftOrder(
    orderId: Int,
    status: String,
    expressFee: Double,
    val giftMessage: String
) : ExpressOrder(orderId, status, expressFee) {
    override fun displayInfo() {
        println("Order #$orderId - Status: $status - Express Fee: $expressFee - Gift Message: $giftMessage")
    }
}
```

### Main usage

```kotlin
fun main() {
    val order = Order(1001, "Pending")
    order.displayInfo() // Order #1001 - Status: Pending

    val express = ExpressOrder(1002, "Shipped", 5.0)
    express.displayInfo() // Order #1002 - Status: Shipped - Express Fee: 5.0

    val gift = GiftOrder(1003, "Delivered", 7.5, "Happy Birthday!")
    gift.displayInfo() // Order #1003 - Status: Delivered - Express Fee: 7.5 - Gift Message: Happy Birthday!
}
```

---

## Summary

These tasks show how to use OOP principles in Kotlin:
- Classes, constructors, inheritance, overriding, getters/setters, and access modifiers.
- Protecting data, organizing logic, and writing safe, flexible code.

---