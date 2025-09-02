# Practice Tasks: Advanced Functional Programming Units

---

## Function Type

1. **Task 1:**  
   Create a function called `greet` that prints "Hello!" and assign it to a variable. Call the function using the variable.

2. **Task 2:**  
   Define a function called `multiply` that takes two `Int` parameters and returns their product. Assign it to a variable of function type and call it with values 4 and 5.

3. **Task 3:**  
   Write a function called `subtract` that takes two `Int` parameters and returns their difference. Create a variable that can hold either `multiply` or `subtract`, and switch between them. Show the result for both operations.

---

## High Order Functions

1. **Task 1:**  
   Write a function called `operate` that takes two `Int` numbers and a function as parameters. The function parameter should take two `Int`s and return an `Int`. Use `operate` to add, subtract, and multiply numbers.

2. **Task 2:**  
   Create a function called `chooseGreeting` that returns a function. If you pass in `true`, it should return a function that prints "Good Morning". If you pass in `false`, it should return a function that prints "Good Night". Show how to call the returned function.

3. **Task 3:**  
   Write a function called `repeatAction` that takes a function with no parameters and repeats it 3 times.

---

## Anonymous Functions

1. **Task 1:**  
   Create an anonymous function that adds two `Int` numbers. Assign it to a variable and call it with 7 and 3.

2. **Task 2:**  
   Pass an anonymous function to a function called `doMath` that multiplies two numbers. `doMath` should take two `Int`s and a function, and return the result.

3. **Task 3:**  
   Write a function called `getAnonymous` that returns an anonymous function which subtracts one number from another.

---

## Lambda Expressions

1. **Task 1:**  
   Create a lambda that prints "Hello from Lambda!" and call it.

2. **Task 2:**  
   Write a lambda that takes a `String` and prints it in upper case. Call the lambda with the word "kotlin".

3. **Task 3:**  
   Write a function called `applyOperation` that takes two `Int`s and a lambda, and returns the result. Use this function to add, subtract, and multiply numbers with different lambdas.

---