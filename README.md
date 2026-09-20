# Java Mock Questions

> A compact Java practice workspace covering object-oriented programming, exception handling, collections, multithreading, synchronization, lambdas, and Stream API usage.

## Project Snapshot

This repository is arranged question-wise. Each `Q*` folder focuses on a specific Java concept through a small console-based program. The code is intentionally simple and exam/lab oriented: classes are split by responsibility, input is mostly taken through `Scanner`, and most examples print results directly to the terminal.

```text
Mock_ques/
|-- Q1   Student result management
|-- Q2   Bank account with custom exception
|-- Q3   Employee inheritance and method overriding
|-- Q4   Shape interface and runtime polymorphism
|-- Q6   Book management with custom exception
|-- Q8   Vehicle inheritance and dynamic method dispatch
|-- Q9   Calculator with exception handling
|-- Q10  Student marks validation with custom exception
|-- Q11  Employee records using ArrayList
|-- Q12  Unique roll numbers using HashSet
|-- Q13  Student marks using HashMap
|-- Q15  Thread by extending Thread
|-- Q16  Thread by implementing Runnable
|-- Q17  Synchronized counter
|-- Q18  Synchronized bank withdrawal
|-- Q19  Lambda expressions and method references
|-- Q21  Student marks processing using Stream API
|-- Q22  Employee data processing using Java 8 streams
|-- Trial Basic Employee object test
```

## Core Theory

### 1. Classes and Objects

A class is a blueprint, and an object is an instance created from that blueprint. Most questions in this repo use classes such as `Student`, `Employee`, `Book`, `Vehicle`, and `BankAccount` to model real-world entities.

Key ideas used:

- Fields store object data.
- Constructors initialize object state.
- Methods define object behavior.
- Access modifiers such as `public`, `private`, and `protected` control visibility.

Example pattern:

```java
class Employee {
    private int id;
    private String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
```

### 2. Encapsulation

Encapsulation means keeping data and behavior together while controlling direct access to sensitive fields. For example, salary and balance values are often made `private`, then accessed or updated through methods.

This is useful because validation and rules can be added inside methods instead of allowing every part of the program to change fields freely.

### 3. Inheritance

Inheritance allows one class to reuse and extend another class. In this repo, `Manager` and `Developer` extend `Employee`, while `Car` and `Bike` extend `Vehicle`.

This supports code reuse:

```java
class Manager extends Employee {
    // Manager-specific data and behavior
}
```

### 4. Method Overriding

Method overriding happens when a child class provides its own version of a parent class method. This is used in salary calculation and vehicle detail display examples.

The `@Override` annotation improves readability and lets the compiler verify that the method is actually overriding something.

### 5. Interfaces

An interface defines a contract. Any class implementing it must provide the required methods. In `Q4`, the `Shape` interface defines:

```java
double calculateArea();
double calculatePerimeter();
```

`Circle`, `Rectangle`, and `Triangle` each implement these methods differently.

### 6. Polymorphism

Polymorphism allows a parent/interface reference to point to different child objects. This repo uses runtime polymorphism in examples like:

```java
Shape circle = new Circle(radius);
Vehicle ref1 = new Car(...);
```

The actual method that runs is decided by the object type at runtime.

### 7. Exception Handling

Exception handling separates normal logic from error-handling logic. The repo uses:

- `try` for risky code.
- `catch` for handling errors.
- `finally` for cleanup or completion messages.
- Custom exceptions for domain-specific errors.

Examples include invalid marks, insufficient balance, division by zero, and already-issued books.

### 8. Collections Framework

The repo uses common collection classes:

- `ArrayList` for ordered, resizable lists.
- `HashSet` for unique values.
- `HashMap` for key-value pairs.

These are important for storing and processing groups of data without manually managing array sizes.

### 9. Multithreading

Threads allow tasks to run independently. This repo demonstrates two approaches:

- Extending `Thread`.
- Implementing `Runnable`.

It also introduces `join()` to wait for threads to finish.

### 10. Synchronization

When multiple threads access shared data, race conditions can occur. `synchronized` prevents multiple threads from entering a critical method at the same time.

This is shown through:

- A shared counter.
- Bank withdrawals from the same account.

### 11. Lambdas, Method References, and Streams

Java 8 introduced a more functional style of processing data.

- Lambda expression: `x -> x > 50`
- Method reference: `System.out::println`
- Stream pipeline: `stream().filter(...).forEach(...)`

This is used heavily in `Q19`, `Q21`, and `Q22`.

## How to Run

Open a terminal inside a question folder and compile the Java files:

```bash
javac *.java
java Main
```

Some folders use a different main class name:

```bash
java q2
java Calculator
java StudentMarks
java EmplyeeInfo
java Mian
```

Run each question from its own folder because many folders reuse class names like `Main`, `Employee`, and `Student`.

## Question-Wise Explanation

### Q1: Student Result Management

`Q1/q1_a` creates student records with ID, name, and marks in three subjects. `Student_info` calculates total marks and percentage, while `Display` accepts multiple student records using an array of objects.

`Q1/q1_a/q1_b` extends the same idea with a `Result` interface. `Student` implements `calculateGrade()`, showing how an interface can enforce a grading behavior.

Concepts used:

- Classes and objects
- Arrays of objects
- Scanner input
- Interface implementation
- Percentage and grade calculation

### Q2: Bank Account with Exception Handling

`BankAccount` supports deposit, withdrawal, balance display, and balance access. The main class `q2` provides a menu-driven console program.

If the withdrawal amount is greater than the current balance, the program throws `InsufficientBalaneException`.

Concepts used:

- Custom exception
- Menu-driven program
- Encapsulation with balance
- `try-catch`

Note: the exception class name is spelled `InsufficientBalaneException`, and the account holder name/number are not fully initialized from user input.

### Q3: Employee Inheritance

`Employee` is the base class. `Manager` and `Developer` extend it and override `calculateSalary()`.

The program accepts details for both employee types and displays salary information with additional role-based salary values.

Concepts used:

- Inheritance
- `protected` member access
- Method overriding
- `super` keyword
- Runtime behavior through overridden methods

### Q4: Shape Interface and Runtime Polymorphism

`Shape` is an interface with two methods: `calculateArea()` and `calculatePerimeter()`.

Implemented shapes:

- `Circle`: uses `Math.PI * radius * radius`
- `Rectangle`: uses `length * breadth`
- `Triangle`: uses Heron's formula

`Main` validates user input, creates shape objects through `Shape` references, prints each shape's area and perimeter, then finds the shape with the maximum area.

Concepts used:

- Interface
- Runtime polymorphism
- Input validation
- Heron's formula
- Object comparison through calculated values

### Q6: Book Management

This question models a basic library flow. `Book` stores book ID, name, author, and availability status. `BookManagement` contains issue and return operations. `bookIssued` is a custom exception for already-issued books.

Concepts used:

- Object arrays
- Custom exception
- Basic library management logic
- Status tracking with boolean values

Note: `Main.java` currently has implementation issues such as redeclaring `Book books[i]` inside the loop and not initializing `BookManagement bm`. The intended design is clear, but the file needs small fixes before it compiles cleanly.

### Q8: Vehicle Management System

`Vehicle` is the parent class. `Car` and `Bike` extend it and override `displayDetails()`.

In `Main`, parent references point to child objects:

```java
Vehicle ref1 = new Car(...);
Vehicle ref2 = new Bike(...);
```

This demonstrates dynamic method dispatch, where Java calls the child class version of the overridden method at runtime.

Concepts used:

- Inheritance
- Method overriding
- Parent reference to child object
- Runtime polymorphism

### Q9: Calculator with Exception Handling

`Calculator` accepts two integers and performs addition, subtraction, multiplication, and division.

Division is wrapped in a `try-catch` block to handle division by zero using `ArithmeticException`. A `finally` block prints a completion message.

Concepts used:

- Arithmetic operations
- Built-in exception handling
- `try-catch-finally`

### Q10: Student Marks Validation

This question defines `InvalidMarksException` for marks outside the valid range of 0 to 100.

`Main` accepts marks, validates them, stores them in a `Student` object, and displays the grade.

Concepts used:

- Custom exception
- Data validation
- `finally` block
- Student grading logic

Note: the grade condition logic uses `||` where `&&` would usually be expected, so the first condition currently matches too broadly.

### Q11: Employee Records Using ArrayList

This question stores employees in an `ArrayList<Employee>`.

Operations performed:

- Add employees
- Display employees
- Update salary
- Search employee by ID
- Filter employees with salary greater than 50000

`Operation` separates search and filter logic from the main driver.

Concepts used:

- `ArrayList`
- Enhanced for-loop
- Object storage in collections
- Searching and filtering
- Setter/getter usage

### Q12: Unique Roll Numbers Using HashSet

`Mian` accepts roll numbers and stores them in a `HashSet<Integer>`.

Since sets do not allow duplicates, only unique roll numbers are retained. The program then searches for a roll number, removes one, and prints the final set.

Concepts used:

- `HashSet`
- Duplicate removal
- Search
- Remove operation

Note: the class name is spelled `Mian`, so run it using `java Mian`.

### Q13: Student Marks Using HashMap

This question stores student roll numbers as keys and marks as values using `HashMap<Integer, Integer>`.

Operations performed:

- Add records
- Display records
- Search marks by roll number
- Update marks

Concepts used:

- `HashMap`
- Key-value storage
- `put()` and `get()`
- Iteration using `keySet()`

Note: the question comment mentions finding the highest marks, but the current implementation does not yet include that final step.

### Q15: Thread by Extending Thread

`NumberThread` extends `Thread`. Its `run()` method calculates the sum of array elements and prints even numbers.

`Main` creates the thread and starts it using `start()`.

Concepts used:

- Extending `Thread`
- Overriding `run()`
- Starting a thread
- Array processing inside a thread

### Q16: Thread by Implementing Runnable

`StudentProcessor` implements `Runnable`. It calculates average marks and prints students who scored above average.

`Main` passes the runnable object into a `Thread` object.

Concepts used:

- `Runnable`
- Thread composition
- Average calculation
- Filtering values from an array

### Q17: Synchronized Counter

`Counter` has a synchronized `increment()` method. Two `CounterThread` objects increment the same shared counter.

`join()` ensures the main thread waits until both worker threads finish before printing the final count.

Concepts used:

- Shared object
- `synchronized`
- Race condition prevention
- `join()`

### Q18: Synchronized Bank Withdrawal

`BankAccount` starts with a fixed balance. Two customer threads attempt to withdraw money from the same account.

The `withdraw()` method is synchronized, so only one thread can perform the balance check and deduction at a time. This prevents the balance from becoming negative.

Concepts used:

- Thread synchronization
- Shared resource protection
- Banking transaction simulation
- `join()`

### Q19: Lambda Expressions and Method References

This question stores integers in an `ArrayList` and processes them using `forEach`.

It prints:

- All numbers
- Even numbers
- Numbers greater than 50
- Numbers using method reference

Concepts used:

- Lambda expressions
- `forEach`
- Conditional filtering
- Method reference with `System.out::println`

### Q21: Student Marks Using Stream API

`StudentMarks` stores marks in an `ArrayList<Integer>` and processes them using streams.

It displays:

- Marks greater than 60
- Highest mark
- Lowest mark
- Average mark
- Count of students scoring more than 75

Concepts used:

- Stream API
- `filter`
- `mapToInt`
- `max`, `min`, and `average`
- `OptionalInt`
- `count`

### Q22: Employee Data Processing Using Java 8

`Employee` stores ID, name, department, and salary. `EmplyeeInfo` creates an employee list and processes it using streams.

Operations performed:

- Display all employees
- Filter IT department employees
- Filter salary greater than 50000
- Find employee with maximum salary
- Calculate average salary
- Display objects using method reference

Concepts used:

- Stream API
- Lambda filtering
- `Comparator.comparingDouble`
- `Optional`
- Method references
- Overridden `toString()`

Note: the main class is spelled `EmplyeeInfo`, so run it using `java EmplyeeInfo`.

### Trial: Basic Employee Object

The `Trial` folder is a smaller test program. It accepts employee details, creates an `Employee` object, and prints it using `toString()`.

Concepts used:

- Object creation
- Constructor
- `toString()`
- Scanner input

## Codebase Notes

- Several folders contain `.class` files generated by earlier compilation. They are not required in source control if this becomes a Git project.
- Some class/file names contain typos such as `Mian`, `EmplyeeInfo`, and `InsufficientBalaneException`.
- Some comments contain encoding artifacts where the rupee symbol appears incorrectly.
- A few questions are missing from the folder sequence, such as Q5, Q7, Q14, and Q20.
- Since many folders reuse class names like `Main` and `Employee`, compile and run one question folder at a time.

## Suggested Learning Flow

1. Start with Q1, Q3, Q4, and Q8 for OOP fundamentals.
2. Move to Q2, Q6, Q9, and Q10 for exception handling.
3. Practice Q11, Q12, and Q13 for collections.
4. Study Q15 to Q18 for threading and synchronization.
5. Finish with Q19, Q21, and Q22 for Java 8 functional programming.

## Quick Compile Examples

```bash
cd Q4
javac *.java
java Main
```

```bash
cd Q21
javac StudentMarks.java
java StudentMarks
```

```bash
cd Q22
javac *.java
java EmplyeeInfo
```

## Summary

This workspace gives a practical overview of core Java programming. It starts from simple classes and object arrays, then builds toward polymorphism, custom exceptions, collections, multithreading, synchronization, lambdas, and stream-based data processing. The examples are small enough to revise quickly but broad enough to cover the major concepts usually expected in Java practical exams and mock assignments.
