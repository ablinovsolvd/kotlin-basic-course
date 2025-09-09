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

---

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
- The `balance` property is private, so only the class itself can read or change it.
- You can't use `account.balance` outside the class—this protects your money!
- You use `deposit()` to add money and `getBalance()` to see how much is in the account.
- If you try to use `account.balance`, you get a compiler error.

---

**Task 2 Solution: Easy Person**

**Code:**
```kotlin
class Person(private val lastName: String) {
    var firstName: String = ""
    fun showFullName() {
        println("$firstName $lastName")
    }
}

fun main() {
    val person = Person("Smith")
    person.firstName = "John"
    person.showFullName() // John Smith

    // println(person.lastName) // Error! lastName is private
}
```

**Explanation:**
- The `lastName` property is private, so it can only be used inside the `Person` class.
- You can't use `person.lastName` outside the class.
- To see the full name, use `showFullName()`.
- If you try to get `lastName` directly, the compiler will show an error.

---

**Task 3 Solution: Simple Recipe**

**Code:**
```kotlin
class Recipe(private val ingredients: List<String>, val name: String) {
    fun printIngredients() {
        println("Ingredients:")
        for (ingredient in ingredients) {
            println("- $ingredient")
        }
    }
}

fun main() {
    val recipe = Recipe(listOf("Flour", "Sugar", "Eggs"), "Cake")
    println("Recipe name: ${recipe.name}")
    recipe.printIngredients()
    // println(recipe.ingredients) // Error! ingredients is private
}
```

**Explanation:**
- The `ingredients` property is private, so it can only be used inside the `Recipe` class.
- You can't use `recipe.ingredients` outside the class.
- To print the ingredients, use `printIngredients()`.
- If you try to get `ingredients` directly, you will see an error.

---

## Unit 6: Inheritance Practice Solution

**Task 1 Solution: University Accounts**

We build a base class for university accounts and a child class for student accounts.

```kotlin
open class UniversityAccount(val username: String, val email: String) {
    fun showInfo() {
        println("Username: $username, Email: $email")
    }
}

class StudentAccount(username: String, email: String, val studentId: Int)
    : UniversityAccount(username, email) {

    fun showStudentInfo() {
        showInfo()
        println("Student ID: $studentId")
    }
}

fun main() {
    val student = StudentAccount("john_doe", "john@university.edu", 123456)
    student.showStudentInfo()
    // Output:
    // Username: john_doe, Email: john@university.edu
    // Student ID: 123456
}
```

**Explanation:**
- `UniversityAccount` is the parent class with common account info.
- `StudentAccount` gets everything from `UniversityAccount` and adds `studentId`.
- You can use functions from the parent and child to print all info.

---

## Unit 7: Overriding Practice Solution

**Task 1 Solution: Medical Account Notifications**

We make a base class for medical accounts and override its notification function in two child classes.

```kotlin
open class MedicalAccount(val username: String) {
    open fun notification() {
        println("General medical notification for $username")
    }
}

class DoctorAccount(username: String) : MedicalAccount(username) {
    override fun notification() {
        println("Doctor alert for $username")
    }
}

class PatientAccount(username: String) : MedicalAccount(username) {
    override fun notification() {
        println("Patient reminder for $username")
    }
}

fun main() {
    val general = MedicalAccount("alex_med")
    val doctor = DoctorAccount("dr.jones")
    val patient = PatientAccount("marta_p")

    general.notification()  // General medical notification for alex_med
    doctor.notification()   // Doctor alert for dr.jones
    patient.notification()  // Patient reminder for marta_p
}
```

**Explanation:**
- The base class has a general notification message.
- Each child class changes (`overrides`) the message to fit its role.
- Calling `notification()` on each account type prints different messages.

---