# Class Practice Tasks — Units 1-5

---

## Task 1: "Make Your Own Social Media User"

Create a simple class called `User` that represents a person on a social media app.

- The class should have properties for the user's name and age.
- Use a constructor to set these values when creating a new user.
- Add a function `sendMessage` in the class that prints a message like: `"Hello from {name}!"`.
- Use a package called `social` for your class.
- Set up a setter for age so that only ages between 13 and 120 are allowed.
- Add a computed property called `isTeen` which returns `true` if age is between 13 and 19.

In your main function:
- Import the class and create two users with different ages and names.
- Call the `sendMessage` function for both users.
- Print if each user is a teen or not.

---

## Task 2: "Build a Simple Library System"

Make a tiny library system using classes and packages.

- Create a package called `library`.
- Make a class called `Book` with properties for `title` and `author` (set them in the constructor).
- Add a computed property `description` which returns a string like `"Book: {title} by {author}"`.
- Add a setter for `title` so that empty titles are not allowed.
- In another file, import the `Book` class, create two books, and print their descriptions.
- Try to set one book's title to an empty string and show that the title does not change.

---

## Task 3: "Employee Access Control"

Create a package called `company`.  
Inside it, make a class `Employee` with:

- A public property `name` (String).
- A private property `salary` (Double).
- A public constructor to set both values.
- A public function `showInfo()` that prints the name and salary.
- A public function `giveRaise(amount: Double)` that increases salary by `amount`.

In your main function:
- Import `Employee` and create an employee.
- Try to read and change the salary directly from main (it should not work).
- Give the employee a raise and print their info.

---

## Task 4: "Student Grades with Protected Data"

Create a package called `school`.  
Inside it, make a base class `Student` with:

- A public property `name` (String).
- A protected property `grade` (Int).
- A constructor that sets both values.
- A public function `showGrade()` that prints the student's name and grade.

Create a subclass `HonorsStudent` that inherits from `Student` and:

- Has a function `boostGrade()` that increases `grade` by 5 (but not higher than 100).

In your main function:
- Import both classes, create a `Student` and an `HonorsStudent`.
- Use `boostGrade()` on the honors student and print the grades.
- Try to access the `grade` property directly from main (should not work).

---