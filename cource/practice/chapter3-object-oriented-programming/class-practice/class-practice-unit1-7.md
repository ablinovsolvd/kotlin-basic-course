# Class Practice Tasks — OOP Foundations & Inheritance

---

## Task 1: Social Media User

Create a class called `User` that represents a person in a social media app.

- The class should have properties for user's `name` and `age`.
- Use a constructor to set these properties.
- Add a function `sendMessage()` that prints `"Hello from {name}!"`.
- Age must be between 13 and 120 (set this in the setter).
- Add a computed property `isTeen` that returns `true` if age is between 13 and 19.

In your main function:
- Create two users with different names and ages.
- Call `sendMessage()` for both.
- Print whether each user is a teen.

---

## Task 2: Employee Access Control

Make a class `Employee` with these requirements:

- Public property `name` (String).
- Private property `salary` (Double).
- Public constructor to set both values.
- Function `showInfo()` to print name and salary.
- Function `giveRaise(amount: Double)` to increase salary.

In your main function:
- Create an employee.
- Try to read and change the salary directly (should not work).
- Give the employee a raise and print info.

---

## Task 3: Student Grades with Inheritance

Create a base class `Student`:

- Public property `name` (String).
- Protected property `grade` (Int).
- Constructor sets both.
- Function `showGrade()` prints name and grade.

Make a subclass `HonorsStudent`:

- Function `boostGrade()` increases `grade` by 5 (max 100).

In your main function:
- Create a `Student` and an `HonorsStudent`.
- Use `boostGrade()` on the honors student and print grades.
- Try to access `grade` directly (should not work).

---

## Task 4: Online Orders with Inheritance & Overriding

You are working on an online shopping system.

- Create a base class `Order` with properties `orderId` and `status`, and function `displayInfo()`.
- Make a class `ExpressOrder` (inherits `Order`) with property `expressFee`.
- Override `displayInfo()` in `ExpressOrder` to show all order info plus the fee.
- Make class `GiftOrder` (inherits `ExpressOrder`) with property `giftMessage`.
- Override `displayInfo()` in `GiftOrder` to show all info, fee, and message.

**Extra:**  
`expressFee` can only be changed inside `ExpressOrder` and its subclasses, but not from outside.

---

Take your time to solve these tasks! Use OOP principles: classes, constructors, inheritance, overriding, getters/setters, and access modifiers.