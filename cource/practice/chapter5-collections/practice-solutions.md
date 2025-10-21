# Homework: Collections Practice — Solutions and Explanations

---

## Unit 1: List

### 1. Student Grades

**Solution:**
```kotlin
class Student(val name: String, val grades: List<Int>) {
    fun averageGrade(): Double {
        return if (grades.isNotEmpty()) grades.average() else 0.0
    }
}
```
**Explanation:**  
We create a `Student` class with a `name` and a list of grades.  
The `averageGrade` function uses the built-in `average()` function for lists to calculate the mean score.  
If the list is empty, we return 0.0 to avoid errors.

---

### 2. Math Utilities

**Solution:**
```kotlin
class MathUtils {
    fun sumOfEvens(numbers: List<Int>): Int {
        return numbers.filter { it % 2 == 0 }.sum()
    }
}
```
**Explanation:**  
We use `filter` to select only even numbers (`it % 2 == 0`).  
Then, we sum them using the `sum()` function.

---

## Unit 2: Set

### 1. Unique Names

**Solution:**
```kotlin
class NameCollector {
    fun uniqueNames(names: List<String>): Set<String> {
        return names.toSet()
    }
}
```
**Explanation:**  
The `toSet()` function converts a list to a set, removing any duplicate names.

---

### 2. Duplicate Checker

**Solution:**
```kotlin
class DuplicateChecker {
    fun isDuplicate(numbers: Set<Int>, number: Int): Boolean {
        return number in numbers
    }
}
```
**Explanation:**  
We use the `in` keyword to check if the number exists in the set, returning `true` or `false`.

---

## Unit 3: Map

### 1. Phone Book

**Solution:**
```kotlin
class PhoneBook {
    private val contacts = mutableMapOf<String, String>()

    fun addContact(name: String, phone: String) {
        contacts[name] = phone
    }

    fun findPhone(name: String): String? {
        return contacts[name]
    }
}
```
**Explanation:**  
We use a mutable map to store contacts.  
`addContact` adds or updates a contact.  
`findPhone` returns the phone number, or `null` if not found.

---

### 2. Frequency Counter

**Solution:**
```kotlin
class FrequencyCounter {
    fun countFrequencies(words: List<String>): Map<String, Int> {
        return words.groupingBy { it }.eachCount()
    }
}
```
**Explanation:**  
The `groupingBy` function groups words, and `eachCount()` counts how many times each word appears.

---

## Unit 4: Sequence

### 1. Even Numbers Sequence

**Solution:**
```kotlin
val evens = generateSequence(2) { it + 2 }.takeWhile { it <= 20 }
println(evens.take(5).toList()) // [2, 4, 6, 8, 10]
```
**Explanation:**  
We use `generateSequence` to create even numbers starting from 2, increasing by 2.  
`takeWhile` limits the sequence up to 20.  
`take(5)` gets the first five elements.

---

### 2. Filter Sequence

**Solution:**
```kotlin
fun filterNumbers(numbers: List<Int>): List<Int> {
    return numbers.asSequence().filter { it >= 10 }.toList()
}
```
**Explanation:**  
We convert the list to a sequence, filter out numbers less than 10, and convert back to a list.

---

## Unit 5: Array

### 1. Swap Elements

**Solution:**
```kotlin
fun swapFirstLast(arr: Array<String>) {
    if (arr.size > 1) {
        val temp = arr[0]
        arr[0] = arr[arr.lastIndex]
        arr[arr.lastIndex] = temp
    }
}
```
**Explanation:**  
We check the array size, then swap the first and last elements using a temp variable.

---

### 2. Sum Array

**Solution:**
```kotlin
fun sumArray(arr: Array<Int>): Int {
    return arr.sum()
}
```
**Explanation:**  
The `sum()` function adds up all elements in the array.

---

## Unit 6: Filtering Collections

### 1. Filter Names by Length

**Solution:**
```kotlin
fun filterNames(names: List<String>): List<String> {
    return names.filter { it.length > 4 }
}
```
**Explanation:**  
We use `filter` to select names longer than 4 characters.

---

### 2. Filter Not Nulls

**Solution:**
```kotlin
fun filterNotNulls(numbers: List<Int?>): List<Int> {
    return numbers.filterNotNull()
}
```
**Explanation:**  
The `filterNotNull()` function removes all `null` values from the list.

---

## Unit 7: Checking Elements

### 1. Contains Check

**Solution:**
```kotlin
fun containsString(list: List<String>, str: String): Boolean {
    return str in list
}
```
**Explanation:**  
We use the `in` keyword to check if the string exists in the list.

---

### 2. All Positive

**Solution:**
```kotlin
fun allPositive(numbers: List<Int>): Boolean {
    return numbers.all { it > 0 }
}
```
**Explanation:**  
The `all` function returns `true` if all elements match the condition (`> 0`).

---

## Unit 8: Transformations

### 1. Uppercase All

**Solution:**
```kotlin
fun uppercaseAll(list: List<String>): List<String> {
    return list.map { it.uppercase() }
}
```
**Explanation:**  
We use `map` to transform each string to uppercase.

---

### 2. Double Numbers

**Solution:**
```kotlin
fun doubleNumbers(numbers: List<Int>): List<Int> {
    return numbers.map { it * 2 }
}
```
**Explanation:**  
We use `map` to multiply each number by 2.

---

## Unit 9: Grouping

### 1. Group by First Letter

**Solution:**
```kotlin
fun groupByFirstLetter(words: List<String>): Map<Char, List<String>> {
    return words.groupBy { it.first() }
}
```
**Explanation:**  
We use `groupBy` to group words by their first letter.

---

### 2. Group by Length

**Solution:**
```kotlin
fun groupByLength(words: List<String>): Map<Int, List<String>> {
    return words.groupBy { it.length }
}
```
**Explanation:**  
We use `groupBy` to group words by their length.

---

## Unit 10: Sorting

### 1. Sort By Length

**Solution:**
```kotlin
fun sortByLength(list: List<String>): List<String> {
    return list.sortedBy { it.length }
}
```
**Explanation:**  
We use `sortedBy` to sort strings by their length.

---

### 2. Sort Descending

**Solution:**
```kotlin
fun sortDescending(numbers: List<Int>): List<Int> {
    return numbers.sortedDescending()
}
```
**Explanation:**  
The `sortedDescending()` function sorts numbers from largest to smallest.

---

## Unit 11: Aggregate Operations

### 1. Find Max

**Solution:**
```kotlin
fun findMax(numbers: List<Int>): Int? {
    return numbers.maxOrNull()
}
```
**Explanation:**  
The `maxOrNull()` function returns the largest number or `null` if the list is empty.

---

### 2. Average Score

**Solution:**
```kotlin
fun averageScore(scores: List<Int>): Double {
    return if (scores.isNotEmpty()) scores.average() else 0.0
}
```
**Explanation:**  
The `average()` function calculates the average.  
We return 0.0 if the list is empty.

---

## Unit 12: Add, Subtract, Union

### 1. Add Elements

**Solution:**
```kotlin
fun addLists(list1: List<Int>, list2: List<Int>): List<Int> {
    return list1 + list2
}
```
**Explanation:**  
We use the `+` operator to concatenate two lists.

---

### 2. Subtract Elements

**Solution:**
```kotlin
fun subtractLists(list1: List<Int>, list2: List<Int>): List<Int> {
    return list1 - list2
}
```
**Explanation:**  
The `-` operator removes all elements in `list2` from `list1`.

---

## Unit 13: Get Part

### 1. Take First N

**Solution:**
```kotlin
fun takeFirstN(list: List<Int>, n: Int): List<Int> {
    return list.take(n)
}
```
**Explanation:**  
The `take()` function gets the first `n` elements.

---

### 2. Chunk List

**Solution:**
```kotlin
fun chunkList(list: List<Int>): List<List<Int>> {
    return list.chunked(2)
}
```
**Explanation:**  
The `chunked()` function splits the list into sublists of size 2.

---

## Unit 14: Get Individual Elements

### 1. Get by Index Safe

**Solution:**
```kotlin
fun getByIndexSafe(list: List<String>, index: Int): String {
    return list.getOrNull(index) ?: "Not found"
}
```
**Explanation:**  
`getOrNull()` returns the element or `null` if the index is out of bounds.  
We use the Elvis operator (`?:`) to return "Not found" if `null`.

---

### 2. Get Random Element

**Solution:**
```kotlin
fun getRandomElement(list: List<String>): String? {
    return list.randomOrNull()
}
```
**Explanation:**  
`randomOrNull()` returns a random element or `null` if the list is empty.
