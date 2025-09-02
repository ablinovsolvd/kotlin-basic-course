# Chapter 3 — Practice Tasks

---

## Unit 1: Classes and Objects

**Task 1:**  
Create a class called `Dog` with two properties: `name` (String) and `age` (Int). Make a new object of this class and print its properties.

**Task 2:**  
Add a function to the `Dog` class called `bark()`. Make it print `"Woof! My name is {name}"`. Call this function for your object.

**Task 3:**  
Create three different objects of the `Dog` class with different names and ages. Print their properties using a function in the class.

---

## Unit 2: Constructors

**Task 1:**  
Create a class called `Book` with a primary constructor that takes two parameters: `title` (String) and `author` (String). Make an object and print the book's title and author.

**Task 2:**  
Add a secondary constructor to `Book` that only takes a `title` and sets the author to `"Unknown"`. Create an object using this constructor and print its properties.

**Task 3:**  
Add an initializer block (`init`) to the `Book` class that prints `"Book created: {title} by {author}"` when a new book is made. Test it with both constructors.

---

## Unit 3: Packages and Import

**Task 1:**  
Create a package called `mathops`. Inside it, make a function called `add(a: Int, b: Int): Int` that returns the sum of two numbers.

**Task 2:**  
In another file, import your `add` function from `mathops` and use it to add two numbers. Print the result.

**Task 3:**  
Create another package called `stringops` with a function called `concat(a: String, b: String): String` that joins two strings. Import both `add` and `concat` into a third file and use both functions.

---

## Unit 4: Getters and Setters

**Task 1:**  
Create a class called `Student` with a property `age` (Int). Add a setter that only allows age values between 5 and 100.

**Task 2:**  
Add a computed property `isAdult` (Boolean) to the `Student` class. It should return `true` if age is 18 or older, else `false`.

**Task 3:**  
Add a private field `_name` to `Student` and a public property `name` with custom getter and setter. The setter should not allow empty names. Try to set an empty name and print the result.

---