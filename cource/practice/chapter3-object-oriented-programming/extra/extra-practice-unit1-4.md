# Extra Practice Tasks — Units 1-4

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