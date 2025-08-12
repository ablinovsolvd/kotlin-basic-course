# Unit 6: Loops
---

## What are loops?

Loops are special instructions that let your program do the same action many times.  
You can repeat an action for each item in a collection, or repeat something while a condition is true.

---

## The `for` loop

The `for` loop goes through all elements in a collection or range.  
It works like "for-each" in other programming languages.

**Basic form:**
```kotlin
for (variable in sequence) {
    // instructions to repeat
}
```

**Example: Print squares of numbers from 1 to 9**
```kotlin
for (n in 1..9) {
    print("${n * n} \t")
}
```
This will print:  
`1    4    9    16    25    36    49    64    81`

---

### Nested loops

You can put one loop inside another.  
This is called a **nested loop**.

**Example: Print a multiplication table**

```kotlin
for (i in 1..9) {
    for (j in 1..9) {
        print("${i * j} \t")
    }
    println()
}
```

**How does this work?**

- The **outer loop** (`for (i in 1..9)`) starts and sets `i` to 1.
- Then, for this `i`, the **inner loop** (`for (j in 1..9)`) starts.
- The inner loop runs 9 times, with `j` going from 1 to 9.
- On each inner loop step, the program prints the result of `i * j`.
- After the inner loop finishes (when `j` has gone through all values), the program prints a new line (`println()`).
- The outer loop then moves to the next `i` (2, 3, ..., 9), and the inner loop repeats for each new `i`.

So, for each value of `i` (from 1 to 9),  
the inner loop runs **9 times** (for `j` from 1 to 9),  
calculating and printing the multiplication results for that row.

In total, the code prints a full multiplication table for numbers 1 to 9,  
where each row shows the results for one `i`.

**Summary:**
- For every value of `i`, the inner loop goes through all values of `j`.
- So, the inner part (`print(...)`) runs 81 times in total (9 for each of 9 values of `i`).

---

## The `while` loop

The `while` loop repeats code while a condition is true.

**Example:**
```kotlin
var i = 10
while (i > 0) {
    println(i * i)
    i--
}
```
Here, as long as `i` is greater than 0, it prints the square of `i` and then decreases `i` by 1.

---

## The `do...while` loop

This loop is like `while`, but always runs the code block at least once.  
First, it does the code, then checks the condition.

**Example:**
```kotlin
var i = -1
do {
    println(i * i)
    i--
} while (i > 0)
```
Even though `i` starts at -1 (not greater than 0), the code inside `do` runs once.

---

## `continue` and `break` in loops

- `continue` skips the rest of the loop for the current item and goes to the next one.
- `break` stops the loop completely.

**Example with `continue`:**
```kotlin
for (n in 1..8) {
    if (n == 5) continue
    println(n * n)
}
```
When `n` is 5, `continue` skips the print and goes to the next number.

**Example with `break`:**
```kotlin
for (n in 1..5) {
    if (n == 5) break
    println(n * n)
}
```
When `n` is 5, `break` stops the loop.

---

## Nested loops and exiting with a label

By default, `break` only exits the loop where it is called.  
If you have loops inside loops and want to exit all of them at once, you can use a label.

**Example:**
```kotlin
fun main() {
    outerloop@ for (i in 1..3) {
        for (j in 1..3) {
            if (j == 3) break@outerloop
            println("Hello")
        }
    }
}
```
Here, when `j` is 3, `break@outerloop` will exit both loops.  
The label (`outerloop@`) is just a name you pick, ending with `@`.

---

## Summary

- Use `for` to go through all items in a range or collection.
- Use `while` to repeat code while a condition is true.
- Use `do...while` to always run code at least once, then check the condition.
- Use `continue` to skip to the next loop step.
- Use `break` to stop the loop.
- Use labels if you need to break out of several nested loops at once.

---