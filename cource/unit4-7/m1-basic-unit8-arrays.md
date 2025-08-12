# Unit 6: Introduction to Arrays
---

## What is an array?

An **array** is a way to store a group of values in one variable.  
All the values in an array must be of the same type.  
In Kotlin, arrays use the type `Array`.

---

## How to create an array

You can use `arrayOf()` to make an array with some values:

```kotlin
val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)
```
Or you can let Kotlin figure out the type:

```kotlin
val numbers = arrayOf(1, 2, 3, 4, 5)
```

---

## Array with repeated or calculated values

You can use the `Array` constructor to fill an array with the same value, or use a formula:

```kotlin
val numbers = Array(3) { 5 }       // [5, 5, 5]
```
Or use a formula for each element:

```kotlin
var i = 1
val numbers = Array(3) { i++ * 2 } // [2, 4, 6]
```

---

## Accessing and changing elements

- To get an element: use its index (starts from 0).
- To set an element: use its index on the left side.

```kotlin
val numbers = arrayOf(1, 2, 3, 4, 5)
val n = numbers[1]   // n = 2 (second element)
println(n)

numbers[2] = 7       // change third element to 7
println("numbers[2] = ${numbers[2]}") // numbers[2] = 7
```

---

## Getting the size of an array

Every array has a `.size` property with the number of elements:

```kotlin
val numbers = arrayOf(1, 2, 3, 4, 5)
println(numbers.size)  // 5

val people = arrayOf("Tom", "Bob", "Sam")
println(people.size)   // 3
```

---

## Looping through an array

You can use a `for` loop to go through all elements:

```kotlin
val numbers = arrayOf(1, 2, 3, 4, 5)
for (number in numbers) {
    print("$number \t")
}
```
Prints:  
`1   2   3   4   5`

You can do the same with arrays of other types:

```kotlin
val people = arrayOf("Tom", "Sam", "Bob")
for (person in people) {
    print("$person \t")
}
```
Prints:  
`Tom   Sam   Bob`

---

## Check if an element is in an array

Use `in` or `!in`:

```kotlin
val numbers = arrayOf(1, 2, 3, 4, 5)

println(4 in numbers)    // true
println(2 !in numbers)   // false
```

---

## Arrays for basic types

Kotlin has special array types for basic values, like `IntArray`, `DoubleArray`, etc.

```kotlin
val numbers: IntArray = intArrayOf(1, 2, 3, 4, 5)
val doubles: DoubleArray = doubleArrayOf(2.4, 4.5, 1.2)
```

You can also create these arrays with repeated or calculated values:

```kotlin
val numbers = IntArray(3) { 5 }         // [5, 5, 5]
val doubles = DoubleArray(3) { 1.5 }    // [1.5, 1.5, 1.5]
```

---

## Summary

- Arrays store a list of values of the same type.
- Use `arrayOf()` for any type, or `intArrayOf()`, `doubleArrayOf()` for basic types.
- Access elements by index (starting from 0).
- Use `.size` to get the number of elements.
- Use a `for` loop to go through all elements.
- Use `in` to check if a value is in the array.

---