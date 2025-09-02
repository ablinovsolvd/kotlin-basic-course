# Chapter 3 — Practice Solutions and Explanations

---

## Unit 1: Classes and Objects

**Task 1 Solution:**  
We create a `Dog` class with two properties, then make an object and print the values.

```kotlin
class Dog {
    var name: String = ""
    var age: Int = 0
}

fun main() {
    val myDog = Dog()
    myDog.name = "Buddy"
    myDog.age = 3
    println("Dog's name: ${myDog.name}, age: ${myDog.age}")
}
```
*Explanation:*  
We made a class, set the properties, and printed them.

---

**Task 2 Solution:**  
Add a function `bark()` inside the class and call it.

```kotlin
class Dog {
    var name: String = ""
    var age: Int = 0
    fun bark() {
        println("Woof! My name is $name")
    }
}

fun main() {
    val myDog = Dog()
    myDog.name = "Buddy"
    myDog.bark()
}
```
*Explanation:*  
The function uses the object’s name and prints a fun message.

---

**Task 3 Solution:**  
Make three different dogs and print their info.

```kotlin
class Dog {
    var name: String = ""
    var age: Int = 0
    fun info() {
        println("Dog: $name, Age: $age")
    }
}

fun main() {
    val dog1 = Dog()
    dog1.name = "Max"
    dog1.age = 4

    val dog2 = Dog()
    dog2.name = "Bella"
    dog2.age = 2

    val dog3 = Dog()
    dog3.name = "Charlie"
    dog3.age = 7

    dog1.info()
    dog2.info()
    dog3.info()
}
```
*Explanation:*  
Each dog is different, and the `info()` function prints their details.

---

## Unit 2: Constructors

**Task 1 Solution:**  
Primary constructor for a book.

```kotlin
class Book(val title: String, val author: String)

fun main() {
    val myBook = Book("Kotlin for Beginners", "John Smith")
    println("Title: ${myBook.title}, Author: ${myBook.author}")
}
```
*Explanation:*  
The main constructor sets both properties.

---

**Task 2 Solution:**  
Secondary constructor sets author to `"Unknown"`.

```kotlin
class Book(val title: String, val author: String) {
    constructor(title: String) : this(title, "Unknown")
}

fun main() {
    val unknownBook = Book("Mystery Book")
    println("Title: ${unknownBook.title}, Author: ${unknownBook.author}")
}
```
*Explanation:*  
This constructor gives a default value for author.

---

**Task 3 Solution:**  
`init` block prints info when book is made.

```kotlin
class Book(val title: String, val author: String) {
    init {
        println("Book created: $title by $author")
    }
    constructor(title: String) : this(title, "Unknown")
}

fun main() {
    val b1 = Book("Kotlin in Action", "Jane Doe")
    val b2 = Book("Just Kotlin")
}
```
*Explanation:*  
Whenever you create a book, the message shows up.

---

## Unit 3: Packages and Import

**Task 1 Solution:**  
Package with an add function.

```kotlin
// In mathops/addition.kt
package mathops

fun add(a: Int, b: Int): Int {
    return a + b
}
```
*Explanation:*  
The function adds two numbers.

---

**Task 2 Solution:**  
Import and use the add function.

```kotlin
// In app.kt
import mathops.add

fun main() {
    val result = add(5, 7)
    println("Sum is $result")
}
```
*Explanation:*  
We import only what we need and use it.

---

**Task 3 Solution:**  
Another package and using both functions.

```kotlin
// In stringops/join.kt
package stringops

fun concat(a: String, b: String): String {
    return a + b
}
```

```kotlin
// In app.kt
import mathops.add
import stringops.concat

fun main() {
    val sum = add(2, 3)
    val text = concat("Hello, ", "World!")
    println("Sum: $sum")
    println("Text: $text")
}
```
*Explanation:*  
We use functions from two packages in one file.

---

## Unit 4: Getters and Setters

**Task 1 Solution:**  
Setter for age in Student class.

```kotlin
class Student {
    var age: Int = 0
        set(value) {
            if (value in 5..100) field = value
        }
}

fun main() {
    val student = Student()
    student.age = 20
    println(student.age) // 20
    student.age = 3
    println(student.age) // still 20, because 3 is too small
}
```
*Explanation:*  
The setter only allows ages between 5 and 100.

---

**Task 2 Solution:**  
Computed property `isAdult`.

```kotlin
class Student {
    var age: Int = 0
        set(value) {
            if (value in 5..100) field = value
        }
    val isAdult: Boolean
        get() = age >= 18
}

fun main() {
    val s = Student()
    s.age = 16
    println(s.isAdult) // false
    s.age = 18
    println(s.isAdult) // true
}
```
*Explanation:*  
`isAdult` checks age and returns true or false.

---

**Task 3 Solution:**  
Custom getter and setter for name.

```kotlin
class Student {
    private var _name = ""
    var name: String
        get() = _name
        set(value) {
            if (value.isNotEmpty()) _name = value
        }
}

fun main() {
    val s = Student()
    s.name = ""
    println("Name: ${s.name}") // Name: (empty)
    s.name = "Alice"
    println("Name: ${s.name}") // Name: Alice
}
```
*Explanation:*  
Name can't be set to an empty string.

---