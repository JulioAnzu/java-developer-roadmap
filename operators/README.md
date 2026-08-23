# Java Operators

This section covers how to manipulate variables and perform operations on data.

In Java, operators are special symbols used to perform calculations, compare values, and execute logical conditions.

Understanding operators is essential before moving on to control flow statements (like loops and conditions) and building real-world application logic.

## Topics

- [x] Arithmetic Operators
- [x] String Concatenation Operator
- [x] Increment and Decrement Operators
- [x] Relational (Comparison) Operators
- [x] Logical Operators
- [x] Assignment and Compound Assignment Operators
- [x] Advanced Operators (Ternary & Bitwise)
- [x] Multiple Variable Declarations

---

## 1. Arithmetic Operators

Arithmetic operators are used to perform basic mathematical operations on numbers (`int`, `double`, etc.).

| Operator   | Name           | Description                      | Example                    |
|:----------:|:---------------|:---------------------------------|:---------------------------|
|    `+`     | Addition       | Adds two values                  | `int sum = 10 + 5; // 15`  |
|    `-`     | Subtraction    | Subtracts one value from another | `int diff = 10 - 5; // 5`  |
|    `*`     | Multiplication | Multiplies two values            | `int prod = 10 * 5; // 50` |
|    `/`     | Division       | Divides one value by another     | `int quot = 10 / 5; // 2`  |
|    `%`     | Modulus        | Returns the division remainder   | `int rem = 10 % 3; // 1`   |

### ⚠️ Crucial Rule: Integer Division
In Java, dividing two integers will always result in an integer, discarding any decimal remainder.
```java
int result = 5 / 2; // Result is 2, NOT 2.5!
double preciseResult = 5.0 / 2; // Result is 2.5 (because 5.0 is a double)
```

---

## 2. String Concatenation Operator

When the `+` operator is used with a `String`, it acts as a **concatenation** operator, joining texts and variables together.

```java
String name = "Julio";
String greeting = "Hello, " + name; // Result: "Hello, Julio"
```

### 📋 Rule of Evaluation Order
Java evaluates from left to right. If a `String` comes first, everything after it is converted into text.
```java
System.out.println("Result: " + 5 + 5); // Prints "Result: 55"
System.out.println(5 + 5 + " Result"); // Prints "10 Result"
```

---

## 3. Increment and Decrement Operators

These operators are used to increase or decrease a variable's value by exactly **1**. They are highly used in loops.

* `++` (Increment): Increases value by 1.
* `--` (Decrement): Decreases value by 1.

```java
int score = 10;
score++; // score is now 11
score--; // score goes back to 10
```

> 💡 **Advanced Note (Prefix vs Postfix):**
> * `score++` (Postfix) evaluates the variable first, then increases it.
> * `++score` (Prefix) increases the value first, then evaluates it.

---

## 4. Relational (Comparison) Operators

Relational operators are used to compare two values. The result of a comparison is always a `boolean` value (`true` or `false`).

| Operator  | Name                     | Example   | Result (if x=5, y=10)   |
|:---------:|:-------------------------|:----------|:------------------------|
|   `==`    | Equal to                 | `x == y`  | `false`                 |
|   `!=`    | Not equal to             | `x != y`  | `true`                  |
|    `>`    | Greater than             | `x > y`   | `false`                 |
|    `<`    | Less than                | `x < y`   | `true`                  |
|   `>=`    | Greater than or equal to | `x >= 5`  | `true`                  |
|   `<=`    | Less than or equal to    | `y <= 10` | `true`                  |

---

## 5. Logical Operators

Logical operators are used to combine multiple conditions or reverse a truth value. They are essential for decision-making.

### 1. Logical AND (`&&`)
Returns `true` only if **both** conditions are true.
```java
boolean hasLicense = true;
boolean isSober = true;
boolean canDrive = hasLicense && isSober; // true
```

### 2. Logical OR (`||`)
Returns `true` if **at least one** of the conditions is true.
```java
boolean hasCash = false;
boolean hasCard = true;
boolean canBuy = hasCash || hasCard; // true
```

### 3. Logical NOT (`!`)
Reverses the logical state of a boolean value.
```java
boolean isOpen = true;
boolean isClosed = !isOpen; // false
```

---

## 6. Assignment and Compound Assignment Operators

The basic assignment operator is `=`. However, Java provides **compound assignment operators** to shorten arithmetic expressions.

```java
int balance = 50;

balance += 10; // Equivalent to: balance = balance + 10; (Now 60)
balance -= 5;  // Equivalent to: balance = balance - 5;  (Now 55)
balance *= 2;  // Equivalent to: balance = balance * 2;  (Now 110)
balance /= 10; // Equivalent to: balance = balance / 10; (Now 11)
```

---

## 7. Advanced Operators

While less common for absolute beginners, you will encounter these operators as you grow into more advanced programming tasks.

### 1. Ternary Operator (`?:`)
A shorthand way of writing an `if-else` statement. It returns a value based on a condition.
```text
variable = (condition) ? valueIfTrue : valueIfFalse;
```
```java
int age = 20;
String status = (age >= 18) ? "Adult" : "Minor"; // Returns "Adult"
```

### 2. Bitwise Operators
These operators perform operations directly on the binary representation (bits `0` and `1`) of integers. They are rare in web development but common in game engines, hardware systems, and cryptography.
* `&` (Bitwise AND)
* `|` (Bitwise OR)
* `^` (Bitwise XOR)
* `~` (Bitwise NOT)

---

## 8. Variable Manipulation & Multiple Declarations

### Multiple Declarations
Java allows you to declare multiple variables of the **same data type** in a single line to keep the code compact.

```java
int a = 5, b = 10, result;
result = a + b; // Multi-variable workspace application (result is 15)
```

*⚠️ **Best Practice:** While allowed, avoid overusing this for different concepts. Keeping declarations on separate lines makes your code cleaner and easier to comment.*

### 📂 Operators Examples

Inside the `examples/` directory, you will find dedicated Java files to study each operator group independently, along with a master file that contains everything combined:

* `ArithmeticExample.java` -> Basic math calculations and integer division behavior.
* `ConcatenationExample.java` -> Using the `+` operator to join text and evaluate order.
* `IncrementDecrementExample.java` -> Deep dive into postfix (`lives++`) and prefix (`++lives`) execution styles.
* `RelationalExample.java` -> Numerical comparisons that output `boolean` values.
* `LogicalExample.java` -> Combining multiple conditions using `&&`, `||`, and `!`.
* `OperatorsFullExample.java` -> **[Full Extended Guide]** A master file containing all the operators above, plus compound assignments (`+=`, `-=`) and advanced tools like the ternary operator.

Feel free to clone them, modify the numbers, and analyze how Java executes each logic block!

> 💡 **JAAC Note:** If you want a quick step-by-step learning process, open the individual files first. 
> Once you feel comfortable with all concepts, check `OperatorsFullExample.java` to see how a complete real-world script integrates multiple operators simultaneously.

---

## Operators Challenge

To complete the **Operators** section, you will create a simple checkout and stats calculator for a video game store.

The goal of this challenge is to practice:
* Using basic arithmetic operators (`-`, `/`) and compound assignment (`-=`).
* Using relational (`>=`) and logical (`&&`) operators to evaluate game states.
* Deep diving into postfix increment (`++`) inside console outputs.
* Building clear, readable console reports utilizing text concatenation (`+`).

### 🎯 The Mission
Create a program that simulates a player buying a game from a digital store. It must calculate the final price after a discount, verify if the player can afford it, evaluate their remaining balance, and update their membership status.

**Rule:** Try to solve it on your own first! Practice your spacing and alignment to match the template.

#### Expected Output:
```text
=== VIDEO GAME SHOP SYSTEM ===
/* Note: The comments below are only to guide you, they will not be printed */
Final Game Price: 45      // int: Base price (60) minus discount (15) using -=
Remaining Balance: 55     // int: Initial wallet (100) minus final price (45)
Can Afford Game?: true    // boolean: walletBalance >= gamePrice
Is Wallet Empty?: false   // boolean: remainingBalance == 0
--- Membership Status ---
Current Level: 1          // int: Prints level '1' using postfix (level++)
Updated Level: 2          // int: Prints the newly updated level '2' in memory
```

### 📂 Exercise Solution
Try to write the code on your own first! Once you are done, or if you get stuck and want to verify your code, you can check the official solution here:

File:
`exercises/OperatorsChallenge.java`


