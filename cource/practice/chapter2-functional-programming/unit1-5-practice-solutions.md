# Practice Tasks and Solutions: Chapter 2: Units 1-5

---

## Unit 1. Functions and Their Parameters

### Task 1: Write a function called `greet` that takes a name (String) as a parameter and prints "Hello, [name]!"

**Solution:**
```kotlin
fun greet(name: String) {
    println("Hello, $name!")
}
```
**Test:**
```kotlin
greet("Alice") // Output: Hello, Alice!
```
**Explanation:**  
We use a single parameter and string interpolation to include the name.

---

### Task 2: Write a function called `displayUser` that takes two parameters: a name (String) and an age (Int), and prints "Name: [name], Age: [age]".

**Solution:**
```kotlin
fun displayUser(name: String, age: Int) {
    println("Name: $name, Age: $age")
}
```
**Test:**
```kotlin
displayUser("Bob", 25) // Output: Name: Bob, Age: 25
```
**Explanation:**  
Multiple parameters are separated by commas in the function definition.

---

### Task 3: Write a function called `showMessage` that takes a message (String) and prints it. Try calling it with different messages.

**Solution:**
```kotlin
fun showMessage(message: String) {
    println(message)
}
```
**Test:**
```kotlin
showMessage("Kotlin is fun!") // Output: Kotlin is fun!
showMessage("Practice makes perfect.") // Output: Practice makes perfect.
```
**Explanation:**  
This function demonstrates passing different arguments to the same parameter.

---

## Unit 2. Vararg Parameters

### Task 1: Write a function called `printNumbers` that takes a variable number of integers and prints each one on a new line.

**Solution:**
```kotlin
fun printNumbers(vararg numbers: Int) {
    for (n in numbers)
        println(n)
}
```
**Test:**
```kotlin
printNumbers(1, 2, 3, 4) // Output: 1 2 3 4
```
**Explanation:**  
`vararg` lets you pass any number of integers to the function.

---

### Task 2: Write a function called `concatStrings` that takes a variable number of strings and prints them as a single line separated by spaces.

**Solution:**
```kotlin
fun concatStrings(vararg words: String) {
    println(words.joinToString(" "))
}
```
**Test:**
```kotlin
concatStrings("I", "love", "Kotlin") // Output: I love Kotlin
```
**Explanation:**  
`joinToString(" ")` joins the array of strings with spaces.

---

### Task 3: Write a function called `addToGroup` that takes a group name (String), any number of user names (String), and prints the group name and all users.

**Solution:**
```kotlin
fun addToGroup(group: String, vararg users: String) {
    println("Group: $group")
    for (user in users)
        println(user)
}
```
**Test:**
```kotlin
addToGroup("Developers", "Tom", "Anna", "Bob")
```
**Output:**
```
Group: Developers
Tom
Anna
Bob
```
**Explanation:**  
The group name is a regular parameter, followed by `vararg` users.

---

## Unit 3. Returning Results

### Task 1: Write a function called `multiply` that takes two Int parameters and returns their product.

**Solution:**
```kotlin
fun multiply(a: Int, b: Int): Int {
    return a * b
}
```
**Test:**
```kotlin
val result = multiply(3, 4) // result = 12
```
**Explanation:**  
The return type is specified, and the result is returned using `return`.

---

### Task 2: Write a function called `isEven` that takes an Int and returns true if the number is even, false otherwise.

**Solution:**
```kotlin
fun isEven(n: Int): Boolean {
    return n % 2 == 0
}
```
**Test:**
```kotlin
isEven(6) // true
isEven(7) // false
```
**Explanation:**  
Use `return` and a Boolean expression.

---

### Task 3: Write a function called `printIfPositive` that takes an Int and prints the number only if it is positive (use `return` to exit early).

**Solution:**
```kotlin
fun printIfPositive(n: Int) {
    if (n <= 0) return
    println(n)
}
```
**Test:**
```kotlin
printIfPositive(5) // Output: 5
printIfPositive(-3) // Output: (nothing)
```
**Explanation:**  
Early exit with `return` if the value is not positive.

---

## Unit 4. Single-Expression and Local Functions

### Task 1: Write a single-expression function called `cube` that returns the cube of a given Int.

**Solution:**
```kotlin
fun cube(x: Int) = x * x * x
```
**Test:**
```kotlin
cube(3) // 27
```
**Explanation:**  
No curly braces or `return` needed for single-expression functions.

---

### Task 2: Write a function called `checkAndPrint` that takes an Int, defines a local function `isValid` to check if the number is positive, and prints "Valid" or "Invalid".

**Solution:**
```kotlin
fun checkAndPrint(n: Int) {
    fun isValid(x: Int) = x > 0
    if (isValid(n))
        println("Valid")
    else
        println("Invalid")
}
```
**Test:**
```kotlin
checkAndPrint(5) // Output: Valid
checkAndPrint(-2) // Output: Invalid
```
**Explanation:**  
Local functions are defined inside other functions.

---

### Task 3: Write a function `compare` that takes two Ints and a local function that returns true if both are less than 10. Print "Both less than 10" or "Not both less than 10".

**Solution:**
```kotlin
fun compare(a: Int, b: Int) {
    fun bothSmall(x: Int, y: Int) = x < 10 && y < 10
    if (bothSmall(a, b))
        println("Both less than 10")
    else
        println("Not both less than 10")
}
```
**Test:**
```kotlin
compare(5, 8) // Output: Both less than 10
compare(12, 8) // Output: Not both less than 10
```
**Explanation:**  
Local single-expression functions can be used for checks inside other functions.

---

## Unit 5. Function Overloading

### Task 1: Write two functions with the same name `show` — one that takes a String and prints it, another that takes an Int and prints it.

**Solution:**
```kotlin
fun show(x: String) {
    println("String: $x")
}
fun show(x: Int) {
    println("Int: $x")
}
```
**Test:**
```kotlin
show("Hello") // Output: String: Hello
show(42)      // Output: Int: 42
```
**Explanation:**  
Function overloading by parameter type.

---

### Task 2: Write two functions called `max`: one that takes two Ints and returns the larger, another that takes two Doubles and returns the larger.

**Solution:**
```kotlin
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun max(a: Double, b: Double): Double {
    return if (a > b) a else b
}
```
**Test:**
```kotlin
max(3, 7)      // 7
max(2.5, 7.8)  // 7.8
```
**Explanation:**  
Two functions with the same name but different parameter types.

---

### Task 3: Write two functions named `sum`: one that takes two Ints, and one that takes three Ints, and both return the sum.

**Solution:**
```kotlin
fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum(a: Int, b: Int, c: Int): Int {
    return a + b + c
}
```
**Test:**
```kotlin
sum(1, 2)      // 3
sum(1, 2, 3)   // 6
```
**Explanation:**  
Function overloading by parameter count.

---