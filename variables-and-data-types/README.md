# Variables and Data Types

This section covers one of the most fundamental concepts in programming: storing and working with data.

In Java, variables allow us to store information in memory, while data types define the kind of information that can be stored.

Understanding variables and data types is essential before moving on to operators, control flow, methods, and object-oriented programming.
## Topics

- [x] What is a Variable?
- [x] Declaring and Initializing Variables
- [x] Java Data Types
- [x] Primitive Data Types
- [x] Main Primitive Types Explained
- [x] Reference Data Types (Introduction to String)
- [x] Constants (`final` keyword)
- [X] Local Variable Type Inference (var)
- [x] Java Comments

---

## 1. What is a Variable?

A variable is a **named container** in memory used to store a **value**.
In Java, every variable has a specific data type. We use them to store, manipulate, and display information within a program.

The general syntax for declaring a variable is:

```java
dataType variableName = value;
```

For example:
```java
int age = 26;
```

In this example:
* `int` -> is the data type.
* `age` -> is the variable name.
* `26` -> is the value stored in the variable.

---

## 2. Declaring, Initializing, and Assigning Variables

A variable can be declared without assigning a value immediately:

```java
int age; // Declaration
```

Later, a value can be assigned to it:

```java
age = 26; // Initialization / Assignment
```

### 💡 Core Concepts to Remember:
1. **Declaration:** Creating the variable by defining its data type and name (allocating memory space).
2. **Initialization:** The very first time you assign a value to a declared variable.
3. **Assignment:** Giving a new value to a variable at any point in the program (overwriting the previous value).

---

## 3. Java Data Types

Java uses data types to define what kind of values a variable can store. Java data types are divided into two main categories:
* **Primitive Data Types:** Basic types built into the language that store simple values.
* **Reference Data Types:** Types that store references (memory addresses) to objects.

*(Note: We will dive deeper into objects and memory in the Object-Oriented Programming section later in the roadmap).*

---

## 4. Primitive Data Types

Java has eight primitive data types:

| Data Type   | Description                       | Example                          |
|-------------|-----------------------------------|----------------------------------|
| `byte`      | Small integer values (1 byte)     | `byte age = 25;`                 |
| `short`     | Short integer values (2 bytes)    | `short year = 2026;`             |
| `int`       | Standard integer values (4 bytes) | `int score = 100;`               |
| `long`      | Large integer values (8 bytes)    | `long population = 8000000000L;` |
| `float`     | Single-precision decimal values   | `float price = 19.99F;`          |
| `double`    | Double-precision decimal values   | `double salary = 12500.50;`      |
| `char`      | A single character                | `char grade = 'A';`              |
| `boolean`   | Logical true or false values      | `boolean isLearningJava = true;` |

### Primitive Data Types Categories

Primitive data types can be grouped into three categories:

#### Integer Types
* `byte`
* `short`
* `int` (Most commonly used)
* `long`

#### Floating-Point Types
* `float`
* `double` (Most commonly used)

#### Other Types
* `char`
* `boolean`

---

## 5. Main Primitive Types Explained

### int
The `int` data type is the standard choice to store whole numbers without decimals.

```java
int age = 26;
int score = 100;
int year = 2026;
```
*⚠️ **Rule:** An `int` cannot store decimal values. Trying to do so will cause a compilation error.*

### double
The `double` data type is the standard choice to store decimal numbers because it offers higher precision than `float`.

```java
double price = 19.99;
double height = 1.75;
double salary = 15000.50;
```

### boolean
The `boolean` data type represents logical values. A boolean variable can only hold two possible states:

```java
boolean isJavaFun = true;
boolean hasCompletedChallenge = false;
```

### char
The `char` data type stores a single character.
* ⚠️ **Rule:** Characters must always use **single quotes** (`' '`).

```java
char grade = 'A';
char initial = 'J';
```
*This is completely different from a `String`, which can store multiple characters and uses double quotes.*

---

## 6. Reference Data Types (Introduction to String)

Reference data types store references to objects rather than the raw values themselves. The most common reference data type you will use daily is `String`.

```java
String name = "Julio";
String language = "Java";
```

### 🔍 Key Differences: `char` vs `String`
* `char` uses **single quotes** (`'A'`) and can only hold **one** character.
* `String` uses **double quotes** (`"Java"`) and can hold **multiple** characters (a text sequence).

---

## 7. Variable Naming Conventions

Java follows strict naming conventions to make code clean, readable, and standard across the industry.

### 🐪 camelCase vs 📐 PascalCase

In Java, we use different casing styles depending on what we are naming:

| Casing Style   | Rule                                                                 | Used For                       | Example                                             |
|:---------------|:---------------------------------------------------------------------|:-------------------------------|:----------------------------------------------------|
| **camelCase**  | First word starts lowercase. Every subsequent word starts uppercase. | **Variables** and **Methods**  | `studentAge`, `monthlySalary`, `calculateTotal()`   |
| **PascalCase** | Every single word starts with an uppercase letter.                   | **Classes** and **Interfaces** | `FirstProgram`, `ConsoleChallenge`, `JavaDeveloper` |

### 💡 Best Practices for Naming Variables:
* **Be Descriptive:** Choose names that reveal intent.
    * 👍 **Good:** `int studentAge;`, `double productPrice;`
    * 👎 **Bad:** `int x;`, `double a;`
* **Language:** Always write variable names in **English** to match industry standards.

---

## 8. Constants (`final` keyword)

In Java, if you want to create a variable whose value **cannot be changed** after initialization, you must use the `final` keyword. This creates a constant.

```java
final double PI = 3.14159;
final int MAX_USERS = 100;
```

* ⚠️ **Rule:** If you try to reassign a value to a constant (e.g., `PI = 5.0;`), Java will throw a compilation error.
* 📝 **Convention:** By standard convention, constants are always written in **FULL UPPERCASE** with underscores (`_`) separating words.

---

## 9. Local Variable Type Inference (`var` keyword)

Starting from Java 10, you can use the `var` keyword to declare local variables. This features allows the Java compiler to **infer** (automatically guess) the data type based on the value you assign to it.

```java
var age = 26;           // The compiler infers this is an 'int'
var price = 19.99;       // The compiler infers this is a 'double'
var name = "Julio";      // The compiler infers this is a 'String'
var isJavaFun = true;    // The compiler infers this is a 'boolean'
```

### ⚠️ Rules and Limitations of `var`:
1. **Requires Immediate Initialization:** You *cannot* declare a `var` without assigning a value immediately. The compiler needs the value to guess the type.
   ```java
   var total; // ❌ Compilation Error!
   ```
2. **Local Variables Only:** It can only be used inside methods (like the `main` method). It cannot be used for class attributes or method parameters.
3. **Strongly Typed:** Once Java infers the type, it cannot be changed.
   ```java
   var score = 100; // Java knows it's an int
   score = "High";  // ❌ Compilation Error! You cannot change an int to a String.
   ```

## 10. Java Comments

You probably noticed that we have been using double slashes (`//`) in our previous code files! Now that we are closing this section, let's formally explain what they are and how they work.

Comments are used to explain Java code and make it more readable. The Java compiler completely ignores them, so they do not affect the program's execution at all.

Java supports two types of comments:

### 1. Single-Line Comments
Any text starting with two forward slashes (`//`) is ignored by Java. This is the most common type for short notes.

```java
// This is a single-line comment
int age = 26; // You can also put it at the end of a line
```

### 2. Multi-Line Comments
Multi-line comments start with `/*` and end with `*/`. Any text between them is ignored. This is perfect for longer explanations or temporarily disabling blocks of code.

```java
/* This is a multi-line comment.
   It can span across multiple lines 
   without any issues. */
double price = 19.99;
```
> 💡 **JAAC Note:** Inside the `examples/` directory, you will find the `VariablesExample.java` file.
> In this file, we declare, initialize, and display the most common primitive types (`int`, `double`, `boolean`, `char`) along with a `String` and a constant (`final`).
Notice how we use **camelCase** for variables and **UPPERCASE** for constants. Look at the console output to see how Java formats different data types automatically.
> Feel free to clone it, modify the values, and see how the console output changes!

---

## 🚀 Variables & Data Types Challenge

To complete the **Variables & Data Types** section, you will create a character profile for a video game.

The goal of this challenge is to practice:
* Using different primitive data types (`int`, `double`, `boolean`, `char`).
* Using reference data types (`String`).
* Creating constants (`final`).
* Utilizing type inference (`var`).
* Writing single-line and multi-line comments.

### 🎯 The Mission
Create a program that displays the statistics and settings of a video game character. You must match the spacing, empty lines, and alignment of the template below.

**Rule:** Try to solve it on your own first! Practice your spacing and alignment to match the template.

#### Requirements:
1. **Header Comment:** Add a multi-line comment (`/* ... */`) at the very top of your file with your name, the date, and a brief description of the program.
2. **Variables & Constants:** Declare a `String` for the name, an `int` for health, a `double` for shield, a `char` for rank, a `boolean` for life status, a `final` constant for max level, and a `var` for developer ID.
3. **Comments:** Use single-line comments (`//`) to separate your variable declaration from your print statements.
4. **No Concatenation:** Print all values using individual `System.out.println()` lines (do not use the `+` operator yet).

#### Expected Output:
```text
=== CHARACTER PROFILE ===
/* Note: The comments below are only to guide you, they will not be printed */
Master Chief        // String: Character Name
100                // int: Health Points
75.5               // double: Shield Power
S                  // char: Rank
true               // boolean: Is Alive
=== GAME SETTINGS ===
100                // final int: Max Level
2021072117         // var: Developer ID
```

### 📂 Exercise Solution
Try to write the code on your own first! Once you are done, or if you get stuck and want to verify your code, you can check the official solution here:

File:
`exercises/VariablesChallenge.java`
