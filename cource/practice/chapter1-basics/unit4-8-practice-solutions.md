# Practice: Kotlin Basics — Answers & Explanations

Here are the answers with explanations for each task about  
**if/else, when, loops, ranges, arrays**.

---

## 1. Conditional Statements (`if/else`)

**Task 1:**  
Write a program that checks if a number is positive, negative, or zero.  
Print a message for each case.

```kotlin
val number = -3

if (number > 0) {
    println("Number is positive")
} else if (number < 0) {
    println("Number is negative")
} else {
    println("Number is zero")
}
// Explanation: We check if the number is greater than 0, less than 0, or exactly zero, printing different messages for each case.
```

**Task 2:**  
Check if a number is even or odd. Print the result.

```kotlin
val number = 7

if (number % 2 == 0) {
    println("Number is even")
} else {
    println("Number is odd")
}
// Explanation: If number divided by 2 leaves no remainder, it is even; otherwise, odd.
```

---

## 2. `when` Expression

**Task 1:**  
Write a program that takes a variable `grade` (Int) from 1 to 5 and prints:
- "Excellent" for 5
- "Good" for 4
- "Okay" for 3
- "Bad" for 2
- "Terrible" for 1

```kotlin
val grade = 4

when (grade) {
    5 -> println("Excellent")
    4 -> println("Good")
    3 -> println("Okay")
    2 -> println("Bad")
    1 -> println("Terrible")
    else -> println("Unknown grade")
}
// Explanation: `when` checks the value of grade and prints the matching message. We can add `else` for unexpected values.
```

**Task 2:**  
Take a variable `month` (Int) from 1 to 12 and print the season ("Winter", "Spring", "Summer", "Autumn").  
Use `when` and ranges.

```kotlin
val month = 7

when (month) {
    in 12..12, in 1..2 -> println("Winter")
    in 3..5 -> println("Spring")
    in 6..8 -> println("Summer")
    in 9..11 -> println("Autumn")
    else -> println("Unknown month")
}
// Explanation: We use ranges to group months into seasons. Notice December (12) is grouped with January and February as Winter.
```

---

## 3. Loops and `for` Loops

**Task 1:**  
Print all numbers from 1 to 10 using a `for` loop.

```kotlin
for (i in 1..10) {
    println(i)
}
// Explanation: The loop goes from 1 to 10, printing each number.
```

**Task 2:**  
Print the multiplication table for 5 (from 1 to 10):

```kotlin
for (i in 1..10) {
    println("5 x $i = ${5 * i}")
}
// Explanation: For each i from 1 to 10, we print "5 x i = result".
```

---

## 4. Ranges

**Task 1:**  
Print all even numbers from 2 to 20 using a range and a loop.

```kotlin
for (i in 2..20 step 2) {
    println(i)
}
// Explanation: The range starts at 2, goes to 20, and increases by 2 each time, so only even numbers are printed.
```

**Task 2:**  
Print numbers from 10 down to 1 using a reversed range.

```kotlin
for (i in 10 downTo 1) {
    println(i)
}
// Explanation: The range starts at 10 and counts down to 1.
```

---

## 5. Arrays

**Task 1:**  
Create an array of names (`"Tom"`, `"Sam"`, `"Bob"`).  
Print each name on a new line using a loop.

```kotlin
val names = arrayOf("Tom", "Sam", "Bob")
for (name in names) {
    println(name)
}
// Explanation: We loop through the array and print each name.
```

**Task 2:**  
Create an array of 5 numbers.  
Print the sum of all numbers in the array.

```kotlin
val numbers = arrayOf(2, 4, 6, 8, 10)
var sum = 0
for (num in numbers) {
    sum += num
}
println("Sum: $sum")
// Explanation: We go through each number, add it to sum, and print the final result.
```

---

Great job!  
Each answer shows how the concept works in practice.  
Try to change the values and see what happens!