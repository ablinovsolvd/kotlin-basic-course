# Practice Assignments: Basic Syntax and Idioms

Try these short coding exercises to practice what you've learned!  
Write each solution in your own Kotlin file, run it, and check the output.

---

## Example solutions

Here’s how your solutions might look for the first three assignments:

```kotlin
// Assignment 1: Immutable Variable (val)
fun main() {
    val daysInWeek = 7
    println("There are $daysInWeek days in a week.")
}

// Assignment 2: Mutable Variable (var)
fun main() {
    var userScore = 0
    userScore += 10
    println("Final score: $userScore")
}

// Assignment 3: Arithmetic Operators
fun main() {
    val width = 5
    val height = 10
    val area = width * height
    println("The area of the rectangle is: $area")
}
```

---

### Assignment 1: Immutable Variable (`val`)
**Task:**  
Create a variable called `daysInWeek` with the value 7. Don't write the type — let Kotlin figure it out.

---

### Assignment 2: Mutable Variable (`var`)
**Task:**  
Make a variable called `userScore` with a starting value of 0. Add 10 to it and print the result.

---

### Assignment 3: Arithmetic Operators
**Task:**  
Create `width` and `height` variables. Find the area of a rectangle.

---

### Assignment 4: Explicit Type Declaration
**Task:**  
Make a variable `pi` with type `Double` and value `3.14159`.

---

### Assignment 5: Single-Line Comment
**Task:**  
Add a comment explaining a variable that stores a user's name.

---

### Assignment 6: Remainder Operator (%)
**Task:**  
Check if the number 25 is even, and store the result in `isEven`.

---

### Assignment 7: Template Strings
**Task:**  
Combine `firstName` and `lastName` into one variable called `fullName`.

---

### Assignment 8: `val` Reassignment Error
**Task:**  
Why does this code not compile? Fix it and explain in a comment.

```kotlin
// Original code with error
fun main() {
    val balance = 100
    balance = 120 // Error here
    println(balance)
}
```

---

### Assignment 9: Comparison Operators
**Task:**  
Check if `myAge` is enough to meet `requiredAge`.

---

### Assignment 10: Multi-line Comment
**Task:**  
Describe the logic of code that calculates a price with a discount.

---

### Assignment 11: Choosing the Right Data Type
**Task:**  
Store whether a user is active. Pick the best type and assign `true`.

---

### Assignment 12: Expression in a Template String
**Task:**  
Print a message about the temperature. If it's over 20, say "It is warm", otherwise say "It is cold".

---

### Assignment 13: Combination of Operators
**Task:**  
Count apples in baskets and some extra apples.

---

### Assignment 14: Logical `&&` (AND) Operator
**Task:**  
See if the door can be opened: you need both a key and the password.

---

### Assignment 15: Increment Operator
**Task:**  
Increase `messageCount` by 1 and print the result.

---

# Module 1: Quiz

Test yourself with these quick questions!

---

**1. Who is the primary developer behind Kotlin?**  
a) Google  
b) Oracle  
c) JetBrains  
d) Microsoft

---

**2. Which keyword makes a variable unchangeable after its initial assignment?**  
a) `var`  
b) `const`  
c) `let`  
d) `val`

---

**3. What is the entry point for a Kotlin application?**  
a) `function start()`  
b) `public static void main(String[] args)`  
c) `fun main()`  
d) `init()`

---

**4. What feature in Kotlin helps avoid crashes from null values?**  
a) Type Inference  
b) Null Safety  
c) Coroutines  
d) Data Classes

---

**5. How do you embed a variable called `username` in a Kotlin string?**  
a) `"Hello, " + username`  
b) `f"Hello, {username}"`  
c) `"Hello, $username"`  
d) `"Hello, %s".format(username)`

---

**6. Kotlin works perfectly with which major programming language?**  
a) Python  
b) C++  
c) Swift  
d) Java

---

**7. Which is the correct way to write a multi-line comment in Kotlin?**  
a) `// This is a comment`  
b) `# This is a comment`  
c) `/* This is a comment */`  
d) `<!-- This is a comment -->`

---

**8. In 2019, Google announced Kotlin as its preferred language for which platform?**  
a) Web Development  
b) iOS Development  
c) Android Development  
d) Data Science

---

**9. What will be the output of the following code?**
```kotlin
var count = 10
count = 12
println(count)
```
a) 10  
b) 12  
c) Compile error  
d) Runtime error

---

**10. What is "Type Inference" in Kotlin?**  
a) Automatic conversion between types  
b) Variables can change type while running  
c) Kotlin detects the type from the value, so you don't need to write it  
d) Prevents variables from being null

---