# Unit 5: Ranges in Kotlin
---

## What is a range?

A **range** is a set of values between a start and an end.  
You can think of it as an interval or a sequence of values.

---

## How to make a range

Use the `..` operator to create a range (from start to end, **including** both):

```kotlin
val range = 1..5    // range contains: 1, 2, 3, 4, 5
```

You can use ranges with numbers, but also with other types like characters or strings:

```kotlin
val charRange = 'a'..'d'    // a, b, c, d
val stringRange = "a".."d"  // also works, but used less often
```

---

## Ranges in reverse order

To make a range that counts **down**, use `downTo`:

```kotlin
val range1 = 1..5         // 1 2 3 4 5
val range2 = 5 downTo 1   // 5 4 3 2 1
```

---

## Ranges with step

Use `step` to skip numbers in the range:

```kotlin
val range1 = 1..10 step 2       // 1 3 5 7 9
val range2 = 10 downTo 1 step 3 // 10 7 4 1
```

---

## Ranges without the end value

Use `until` to make a range **excluding** the upper limit:

```kotlin
val range1 = 1 until 9          // 1 2 3 4 5 6 7 8 (9 not included)
val range2 = 1 until 9 step 2   // 1 3 5 7
```

---

## Checking if a value is in a range

Use `in` and `!in` to check if something is inside or outside the range:

```kotlin
val range = 1..5

val isInRange = 5 in range        // true
val notInRange = 6 !in range      // true
```

**Example:**

```kotlin
fun main() {
    val range = 1..5

    println(5 in range)   // true
    println(86 in range)  // false

    println(6 !in range)  // true
    println(3 !in range)  // false
}
```

---

## Looping through a range

You can use a `for` loop to go through every value in a range:

```kotlin
val range1 = 5 downTo 1
for (c in range1) print(c)   // prints: 54321
println()

val range2 = 'a'..'d'
for (c in range2) print(c)   // prints: abcd
println()

for (c in 1..9) print(c)     // prints: 123456789
println()

for (c in 1 until 9) print(c)    // prints: 12345678
println()

for (c in 1..9 step 2) print(c)  // prints: 13579
```

---

## Summary

- Use `..` to create a range that includes both ends.
- Use `downTo` for a decreasing range.
- Use `step` to set how much the range increases or decreases each time.
- Use `until` if you want the last value **not** to be included.
- Use `in` and `!in` to check if a value is (or isn't) in a range.
- You can loop over a range with `for`.

---