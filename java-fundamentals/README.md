# Java Fundamentals ☕

This section covers the fundamental concepts needed to start learning and developing with Java.

## Topics

- [x] What is Java?
- [x] JDK
- [x] JRE
- [x] JVM
- [x] Java Bytecode
- [x] Write Once, Run Anywhere (WORA)
- [x] First Java Program

---

## 1. What is Java?

Java is a high-level, general-purpose, object-oriented programming language designed to be portable across different platforms.

Java was created at Sun Microsystems and was officially released in 1995.

One of Java's main principles is:

> **Write Once, Run Anywhere (WORA).**

Java source code is compiled into bytecode, which can be executed by the Java Virtual Machine (JVM).

Java is widely used for backend development, enterprise applications, APIs, Android development, and many other types of software.

---

## 2. A Brief History of Java

Java was developed at Sun Microsystems in the early 1990s.

The project originally started under the name **Oak**, led by James Gosling and a team of engineers.

The language was designed with portability in mind, with the goal of allowing software to run on different devices and platforms.

Java was officially released to the public in **1995**.

One of the key ideas behind Java was:

> **Write Once, Run Anywhere.**

Instead of compiling Java source code directly into machine code for a specific operating system, Java source code is compiled into bytecode.

The bytecode can then be executed by a Java Virtual Machine (JVM) available on different platforms.

This approach helped Java become widely adopted in software development.

---

## 3. JDK, JRE and JVM

Java development involves three important concepts:

- JDK — Java Development Kit
- JRE — Java Runtime Environment
- JVM — Java Virtual Machine

### JVM — Java Virtual Machine

The JVM is the component responsible for executing Java bytecode.

It provides an environment that allows Java bytecode to run on different operating systems.

The JVM is one of the key components behind Java's portability.

### JRE — Java Runtime Environment

The JRE provides the environment required to run Java applications.

It includes the JVM and the libraries required to execute Java programs.

The JRE is focused on **running** Java applications rather than developing them.

### JDK — Java Development Kit

The JDK is the complete development kit used to develop Java applications.

It includes the tools required to compile and develop Java programs, as well as the components required to run them.

For example, the JDK includes the Java compiler, `javac`.

### Relationship between JDK, JRE and JVM

A simplified representation is:

    JDK
    └── JRE 
        └── JVM
The relationship can be summarized as:

- **JDK** → used to develop Java applications.
- **JRE** → provides the environment to run Java applications.
- **JVM** → executes Java bytecode.

---

## 4. Java Bytecode

When Java source code is compiled, it is converted into bytecode.

The bytecode is stored in `.class` files.

The JVM then executes this bytecode.

A simplified flow is:

    Java Source Code
            ↓
          javac
            ↓
        Bytecode 
        (.class)
            ↓
           JVM
            ↓
    Operating System

---

## 5. Write Once, Run Anywhere

One of Java's most well-known principles is:

> **Write Once, Run Anywhere (WORA).**

The idea is that Java source code can be compiled into platform-independent bytecode.

As long as a compatible JVM is available, that bytecode can be executed on different operating systems.

For example:

             Java Source Code
                    ↓
                  javac
                    ↓
                Bytecode
                    ↓
          ┌─────────┼─────────┐
          ↓         ↓         ↓
        JVM       JVM       JVM
       Windows    Linux     macOS

---

## 6. First Java Program

A traditional first program when learning a programming language is:

**Hello World.**

```java
public class Main {
    static void main(String[] args) {
        System.out.println("Hello World");
    }
} 
```
When executed, the program prints:

    Hello World

At this stage, the goal is simply to understand how to create and execute a basic Java program.

The structure of **public static void main(String[] args)** will be studied in more detail later.