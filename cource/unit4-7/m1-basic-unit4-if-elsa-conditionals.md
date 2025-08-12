# Unit 4: Conditional Statement `if...else`

---

## What are conditional statements?

Conditional statements help your program decide what to do next.  
They let your code follow different paths depending on some condition.

---

## Basic `if` statement

The `if` statement checks a condition.  
If the condition is **true**, the code block inside runs.  
If it is **false**, the code block is skipped.

```kotlin
val a = 10
if (a == 10) {
    println("a equals 10")
}
```

In this code, `if` checks if `a` is equal to 10.
- If **yes**, it prints: `a equals 10`.
- If **no**, nothing happens.

---

## `if...else` statement

If you want to do something when the condition is **false**, use `else`.

```kotlin
val a = 10
if (a == 10) {
    println("a equals 10")
} else {
    println("a does NOT equal 10")
}
```

Here:
- If `a == 10`, it prints `a equals 10`.
- If not, it prints `a does NOT equal 10`.

---

## Skipping curly braces

If there is only **one line** after `if` or `else`, you can skip the curly braces `{ }` (but most people prefer to use them for clarity):

```kotlin
val a = 10
if (a == 10)
    println("a equals 10")
else
    println("a does NOT equal 10")
```

---

## Multiple options: `else if`

You can check several different conditions using `else if`.

```kotlin
val a = 10
if (a == 10) {
    println("a equals 10")
} else if (a == 9) {
    println("a equals 9")
} else if (a == 8) {
    println("a equals 8")
} else {
    println("a has an unknown value")
}
```

The program checks each condition in order.  
It runs the first block where the condition is true.

---

## Returning a value from `if`

In Kotlin, `if` is an expression, not just a statement.  
That means `if` can return a value!

**Example: Find the bigger number of two:**

```kotlin
val a = 10
val b = 20
val c = if (a > b) a else b

println(c)  // 20
```

Here, `c` will be set to the bigger value.

---

You can also use `else if` when returning values:

```kotlin
val a = 20
val b = 20
val c = if (a > b) 1 else if (a < b) -1 else 0

println(c)  // 0
```

- If `a` is bigger, `c` is 1.
- If `b` is bigger, `c` is -1.
- If they are equal, `c` is 0.

---

If you need to do more work before returning a value, use curly braces and put the value at the end of the block:

```kotlin
val a = 10
val b = 20
val c = if (a > b) {
    println("a = $a")
    a
} else {
    println("b = $b")
    b
}
```

- The last line of each block gives the value for `c`.

---

## Summary

- Use `if` to check a condition and run code only if it’s true.
- Add `else` to handle the case when the condition is false.
- Use `else if` to check more choices.
- In Kotlin, `if` can return a value and be used like an expression.

---