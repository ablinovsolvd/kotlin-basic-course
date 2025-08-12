# Unit 3: The `when` Expression

_Last updated: 2024-03-02_

---

## What is `when`?

The `when` expression helps your program choose what to do based on the value of a variable.  
It works like `switch` in other programming languages, but is more flexible.

---

## Basic `when` usage

You give `when` a value to check, and then write different options for possible values:

```kotlin
when (object) {
    value1 -> actions1
    value2 -> actions2
    valueN -> actionsN
}
```

Kotlin checks each value in order. If it finds a match, it runs the code after the arrow `->`.

**Example:**

```kotlin
fun main() {
    val isEnabled = true
    when (isEnabled) {
        false -> println("isEnabled off")
        true -> println("isEnabled on")
    }
}
```

Here, the variable `isEnabled` is checked.
- If it is `true`, it prints `isEnabled on`.
- If it is `false`, it prints `isEnabled off`.

---

## Using `else`

Sometimes you don't know all possible values, or want a "default" case.  
In this case, use `else`:

```kotlin
val a = 30
when (a) {
    10 -> println("a = 10")
    20 -> println("a = 20")
    else -> println("Unknown value")
}
```

If `a` is not 10 or 20, the `else` code runs.

---

## Multiple actions for one value

You can use curly braces `{}` to write several actions for one value:

```kotlin
var a = 10
when (a) {
    10 -> {
        println("a = 10")
        a *= 2
    }
    20 -> {
        println("a = 20")
        a *= 5
    }
    else -> {
        println("Unknown value")
    }
}
println(a)
```

---

## Grouping several values

You can match the same actions for many different values by separating them with commas:

```kotlin
val a = 10
when (a) {
    10, 20 -> println("a is 10 or 20")
    else -> println("Unknown value")
}
```

---

## Checking ranges

You can check if a value is inside a range using `in` or outside using `!in`:

```kotlin
val a = 10
when (a) {
    in 10..19 -> println("a is between 10 and 19")
    in 20..29 -> println("a is between 20 and 29")
    !in 10..20 -> println("a is NOT between 10 and 20")
    else -> println("Unknown value")
}
```

---

## Dynamic values and calculations

You can compare the checked value with results of calculations:

```kotlin
fun main() {
    val a = 10
    val b = 5
    val c = 3
    when (a) {
        b - c -> println("a = b - c")
        b + 5 -> println("a = b + 5")
        else -> println("Unknown value")
    }
}
```

You can also pass a calculation as the value to `when`:

```kotlin
fun main() {
    val a = 10
    val b = 20
    when (a + b) {
        10 -> println("a + b = 10")
        20 -> println("a + b = 20")
        30 -> println("a + b = 30")
        else -> println("Undefined")
    }
}
```

---

## Defining a variable inside `when`

You can define a new variable right inside the `when` statement and use it:

```kotlin
fun main() {
    val a = 10
    val b = 26
    when (val c = a + b) {
        10 -> println("a + b = 10")
        20 -> println("a + b = 20")
        else -> println("c = $c")
    }
}
```

---

## `when` without a value (like multiple `if`)

You can use `when` without a value to check several conditions one by one.  
This is similar to a chain of `if...else if...else`:

```kotlin
fun main() {
    val a = 15
    val b = 6
    when {
        b > 10 -> println("b is greater than 10")
        a > 10 -> println("a is greater than 10")
        else -> println("Both a and b are 10 or less")
    }
}
```

---

## Returning a value from `when`

Like `if`, the `when` expression can return a value.  
The value after `->` is the result for that case.

```kotlin
fun main() {
    val day = 2
    val dayOfWeek = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        else -> "Unknown"
    }
    println(dayOfWeek) // Tuesday
}
```

**One more example with ranges:**

```kotlin
val sum = 1000
val rate = when (sum) {
    in 100..999 -> 10
    in 1000..9999 -> 15
    else -> 20
}
println(rate) // 15
```

---

## Summary

- `when` helps you make choices based on the value or condition.
- Use `else` for a default action.
- You can check for values, ranges, or even write your own conditions.
- `when` can be used as an expression to return a value.

---