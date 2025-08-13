# Extra Practice — Units 4–7 (If/Else, When, Loops, Ranges)

## Tasks

---

### 1. If/Else Conditionals

**Task 1:**  
Given a variable `age`, print "Adult" if age is 18 or older, otherwise print "Minor".

```kotlin
val age = 17
```

**Task 2:**  
Given two variables `a` and `b`, print the larger number.

```kotlin
val a = 15
val b = 20
```

---

### 2. When Expression

**Task 1:**  
Given a variable `day` (1–7), print the name of the day (1–Monday, 2–Tuesday, ..., 7–Sunday).

```kotlin
val day = 3
```

**Task 2:**  
Given a variable `score` (0–100), print:
- "A" if score >= 90
- "B" if score >= 80
- "C" if score >= 70
- "D" if score >= 60
- "F" otherwise

```kotlin
val score = 85
```

---

### 3. Loops

**Task 1:**  
Print all odd numbers from 1 to 15.

---

**Task 2:**  
Print the sum of all numbers from 1 to 5.

---

### 4. Ranges

**Task 1:**  
Print all numbers from 5 to 15.

---

**Task 2:**  
Print all numbers from 20 down to 10.

---

## Answers

---

### 1. If/Else Conditionals

**Task 1:**
```kotlin
val age = 17
if (age >= 18) {
    println("Adult")
} else {
    println("Minor")
}
// Prints: Minor
```

**Task 2:**
```kotlin
val a = 15
val b = 20
if (a > b) {
    println(a)
} else {
    println(b)
}
// Prints: 20
```

---

### 2. When Expression

**Task 1:**
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
// Prints: Wednesday
```

**Task 2:**
```kotlin
val score = 85
when {
    score >= 90 -> println("A")
    score >= 80 -> println("B")
    score >= 70 -> println("C")
    score >= 60 -> println("D")
    else -> println("F")
}
// Prints: B
```

---

### 3. Loops

**Task 1:**
```kotlin
for (i in 1..15) {
    if (i % 2 != 0) {
        println(i)
    }
}
// Prints: 1 3 5 7 9 11 13 15 (each on a new line)
```

**Task 2:**
```kotlin
var sum = 0
for (i in 1..5) {
    sum += i
}
println(sum)
// Prints: 15
```

---

### 4. Ranges

**Task 1:**
```kotlin
for (i in 5..15) {
    println(i)
}
// Prints: 5 6 7 ... 15 (each on a new line)
```

**Task 2:**
```kotlin
for (i in 20 downTo 10) {
    println(i)
}
// Prints: 20 19 18 ... 10 (each on a new line)
```

---