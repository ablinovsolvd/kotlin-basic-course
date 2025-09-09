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

## Unit 5: Access Modifiers Practice Tasks

---

**Task 1: Safe Bank Account**

Create a class `BankAccount` with the following:

- A private property `balance` (Double) that stores the account balance.
- A public function `deposit(amount: Double)` that adds money to the balance.
- A public function `getBalance()` that returns the current balance.

Try to access the `balance` directly from outside the class and see what happens.

---

**Task 2: Easy Person**

Create a class `Person` with:

- A private property `lastName` (String).
- A public property `firstName` (String).
- A public function `showFullName()` that prints the full name (first and last name together).

Try to access `lastName` directly from outside the class and see what happens.

---

**Task 3: Simple Recipe**

Create a class `Recipe` with:

- A private property `ingredients` (List of String).
- A public property `name` (String).
- A public function `printIngredients()` that prints all ingredients.

In your main function, print the recipe name and call `printIngredients()`.

Try to access `ingredients` directly from outside the class and see what happens.

---

## Unit 6: Inheritance Practice Task

**Task 1: University Accounts**

Imagine you are building a system for a university.

- Create a base class `UniversityAccount` with properties: `username` (String) and `email` (String).
- Add a function `showInfo()` that prints the username and email.
- Create a class `StudentAccount` that inherits from `UniversityAccount` and adds a property `studentId` (Int).
- In `StudentAccount`, add a function `showStudentInfo()` that prints all account info plus the student ID.

---

## Unit 7: Overriding Practice Task

**Task 1: Medical Account Notifications**

Suppose you are working on a medical app.

- Create a base class `MedicalAccount` with a property `username` (String) and a function `notify()` that prints `"General medical notification for {username}"`.
- Create a class `DoctorAccount` that inherits from `MedicalAccount` and overrides the `notify()` function to print `"Doctor alert for {username}"`.
- Create a class `PatientAccount` that also inherits from `MedicalAccount` and overrides the `notify()` function to print `"Patient reminder for {username}"`.
- Create objects of each type and call their `notify()` function to see the different messages.

---