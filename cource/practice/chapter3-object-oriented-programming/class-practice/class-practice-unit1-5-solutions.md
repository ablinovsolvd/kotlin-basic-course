# Solutions and Explanations — Class Practice Tasks (Units 1-5)

---

## Task 1 Solution: "Make Your Own Social Media User"

### Package and class definition:

```kotlin
// social/User.kt
package social

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

### Main file usage:

```kotlin
// app.kt
import social.User

fun main() {
    val user1 = User("Alice", 15)
    val user2 = User("Bob", 25)

    user1.sendMessage() // Hello from Alice!
    user2.sendMessage() // Hello from Bob!

    println("Is ${user1.name} a teen? ${user1.isTeen}") // true
    println("Is ${user2.name} a teen? ${user2.isTeen}") // false

    user2.age = 10 // Won't change, age stays 25
    println("${user2.name}'s age: ${user2.age}") // 25
}
```

**Explanation:**
- The setter for `age` only allows values between 13 and 120.
- The computed property `isTeen` quickly checks if the age is between 13 and 19.
- You can’t set an invalid age.

---

## Task 2 Solution: "Build a Simple Library System"

### Package and class definition:

```kotlin
// library/Book.kt
package library

class Book(title: String, val author: String) {
    private var _title: String = title
    var title: String
        get() = _title
        set(value) {
            if (value.isNotEmpty()) _title = value
        }

    val description: String
        get() = "Book: $title by $author"
}
```

### Main file usage:

```kotlin
// app.kt
import library.Book

fun main() {
    val book1 = Book("Kotlin 101", "Jane Doe")
    val book2 = Book("Learning Programming", "Tom Smith")

    println(book1.description) // Book: Kotlin 101 by Jane Doe
    println(book2.description) // Book: Learning Programming by Tom Smith

    book2.title = ""
    println(book2.description) // Title did not change, still "Learning Programming"
}
```

**Explanation:**
- The setter for title prevents the title from being set to an empty string.
- The description property always shows correct info.

---

## Task 3 Solution: "Employee Access Control"

### Package and class definition:

```kotlin
// company/Employee.kt
package company

class Employee(val name: String, private var salary: Double) {

    fun showInfo() {
        println("Employee: $name, Salary: $salary")
    }

    fun giveRaise(amount: Double) {
        if (amount > 0) salary += amount
    }
}
```

### Main file usage:

```kotlin
// app.kt
import company.Employee

fun main() {
    val emp = Employee("Jane", 50000.0)

    emp.showInfo() // Employee: Jane, Salary: 50000.0
    emp.giveRaise(5000.0)
    emp.showInfo() // Employee: Jane, Salary: 55000.0

    // println(emp.salary) // Error! salary is private
    // emp.salary = 100000.0 // Error! salary is private
}
```

**Explanation:**
- The salary property is private, so main can't read or change it directly.
- You can only change salary using the class's `giveRaise()` method.
- This keeps sensitive info safe.

---

## Task 4 Solution: "Student Grades with Protected Data"

### Package and base/subclass definition:

```kotlin
// school/Student.kt
package school

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

### Main file usage:

```kotlin
// app.kt
import school.Student
import school.HonorsStudent

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

**Explanation:**
- The `grade` property is protected, so only the class and its children can use it.
- The main function can't access grade directly.
- The honors student can boost their grade, but not above 100.

---

## Summary

These examples show how to use classes, constructors, packages, getters/setters, and access modifiers in Kotlin.  
They help you write organized, safe, and smart code for many real-life scenarios!

---