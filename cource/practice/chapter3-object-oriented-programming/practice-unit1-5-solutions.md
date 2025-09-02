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

## Unit 5: Access Modifiers Solutions and Explanations

**Task 1 Solution: Safe Bank Account**

**Code:**
```kotlin
class BankAccount {
    private var balance: Double = 0.0

    fun deposit(amount: Double) {
        if (amount > 0) balance += amount
    }

    fun getBalance(): Double {
        return balance
    }
}

fun main() {
    val account = BankAccount()
    account.deposit(150.0)
    println("Your balance: ${account.getBalance()}") // Your balance: 150.0

    // println(account.balance) // Error! balance is private
}
```

**Explanation:**
- The `balance` property is private, so it can only be changed or read inside the class.
- You can’t access `balance` directly outside the class.
- You use `deposit()` to add money, and `getBalance()` to check your balance.
- If you try `account.balance`, the compiler will give an error — this keeps your money safe!

**Task 2 Solution: Family Members**

**Code:**
```kotlin
open class Person(protected val lastName: String) {
    var firstName: String = ""
    fun showFullName() {
        println("$firstName $lastName")
    }
}

class Child(lastName: String) : Person(lastName) {
    fun printLastName() {
        println("Child's last name is $lastName") // OK, protected is visible here
    }
}

fun main() {
    val parent = Person("Smith")
    parent.firstName = "John"
    parent.showFullName() // John Smith

    val child = Child("Smith")
    child.firstName = "Anna"
    child.showFullName() // Anna Smith
    child.printLastName() // Child's last name is Smith

    // println(parent.lastName) // Error! lastName is protected
    // println(child.lastName) // Error! lastName is protected
}
```

**Explanation:**
- `lastName` is protected: only `Person` and its children (like `Child`) can use it.
- You can use it inside the class, and inside classes that inherit from it.
- You can’t use it directly outside, so `parent.lastName` or `child.lastName` won’t work.

**Task 3 Solution: Secret Recipe**

**Code:**
```kotlin
class Recipe(internal val ingredients: List<String>, val name: String) {
    private fun printIngredients() {
        println("Ingredients:")
        for (ingredient in ingredients) {
            println("- $ingredient")
        }
    }

    fun showRecipe() {
        println("Recipe: $name")
        printIngredients()
    }
}

fun main() {
    val recipe = Recipe(listOf("Flour", "Sugar", "Eggs"), "Cake")
    recipe.showRecipe()
    // recipe.printIngredients() // Error! printIngredients is private
    // println(recipe.ingredients) // OK in this file and module
}
```

**Explanation:**
- The `ingredients` property is internal: it can be used anywhere in the same module/project, but not from outside.
- The `printIngredients()` function is private: only the `Recipe` class can use it.
- In your main function, you use `showRecipe()`, which calls the private function.
- If you try to call `printIngredients()` directly, you’ll get an error.
- If you access `ingredients` from another file in the same module, it works; but in a different module, it won’t.

---