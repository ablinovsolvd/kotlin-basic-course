# Extra Practice — Units 4–7 (If/Else, When, Loops, Ranges) — Answers & Explanations

---

## 1. If/Else Conditionals

**Task 1:**  
Given a variable `age`, print "Adult" if age is 18 or older, otherwise print "Minor".

```kotlin
val age = 17
if (age >= 18) {
    println("Adult")
} else {
    println("Minor")
}
// Output: Minor
```
**Explanation:**  
We use an `if` statement to check if the value of `age` is greater than or equal to 18.
- If this condition is true, `"Adult"` is printed.
- Otherwise, the code in `else` runs and prints `"Minor"`.
  This is a basic way to branch logic based on a numerical condition.

---

**Task 2:**  
Given two variables `a` and `b`, print the larger number.

```kotlin
val a = 15
val b = 20
if (a > b) {
    println(a)
} else {
    println(b)
}
// Output: 20
```
**Explanation:**  
The comparison `a > b` checks which value is greater.
- If `a` is greater, its value is printed.
- If not, the value of `b` is printed.
  This is a simple way to determine and output the maximum of two numbers.

---

## 2. When Expression

**Task 1:**  
Given a variable `day` (1–7), print the name of the day (1–Monday, ..., 7–Sunday).

```kotlin
val day = 3
when (day) {
    1 -> println("Monday")
    2 -> println("Tuesday")
    3 -> println("Wednesday")
    4 -> println("Thursday")
    5 -> println("Friday")
    6 -> println("Saturday")
    7 -> println("Sunday")
    else -> println("Unknown day")
}
// Output: Wednesday
```
**Explanation:**  
The `when` expression works like a switch-case in other languages.
- It matches the value of `day` to a case and prints the corresponding day name.
- The `else` branch covers any unexpected value outside 1–7.

---

**Task 2:**  
Given a variable `score` (0–100), print the grade.

```kotlin
val score = 85
when {
    score >= 90 -> println("A")
    score >= 80 -> println("B")
    score >= 70 -> println("C")
    score >= 60 -> println("D")
    else -> println("F")
}
// Output: B
```
**Explanation:**  
Here, `when` is used with boolean expressions, not specific values.
- The first matching condition executes:
    - If score >= 90, print "A".
    - If score >= 80, print "B", and so on.
- The `else` branch is for scores below 60.
  This structure makes it easy to check ranges.

---

## 3. Loops

**Task 1:**  
Print all odd numbers from 1 to 15.

```kotlin
for (i in 1..15) {
    if (i % 2 != 0) {
        println(i)
    }
}
// Output: 1 3 5 7 9 11 13 15 (each number on a new line)
```
**Explanation:**
- `for (i in 1..15)` goes through numbers 1 to 15.
- `i % 2 != 0` checks if the number is odd (remainder on division by 2 is not zero).
- We print only those numbers that meet this condition.

---

**Task 2:**  
Print the sum of all numbers from 1 to 5.

```kotlin
var sum = 0
for (i in 1..5) {
    sum += i
}
println(sum)
// Output: 15
```
**Explanation:**
- Start with `sum = 0`.
- Loop from 1 to 5, adding each value to `sum`.
- After the loop, print the result.
  This is a classic pattern for accumulating a total with a loop.

---

## 4. Ranges

**Task 1:**  
Print all numbers from 5 to 15.

```kotlin
for (i in 5..15) {
    println(i)
}
// Output: 5 6 7 8 9 10 11 12 13 14 15
```
**Explanation:**  
The range `5..15` gives all numbers from 5 to 15 (inclusive).  
The loop prints each number in order.

---

**Task 2:**  
Print all numbers from 20 down to 10.

```kotlin
for (i in 20 downTo 10) {
    println(i)
}
// Output: 20 19 18 17 16 15 14 13 12 11 10
```
**Explanation:**  
The `downTo` keyword creates a descending range.  
The loop prints numbers from 20 down to 10, one by one.

---