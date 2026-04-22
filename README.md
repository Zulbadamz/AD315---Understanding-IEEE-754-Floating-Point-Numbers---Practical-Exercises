# Understanding IEEE 754 Floating Point Numbers - Practical Exercises

## 📌 Project Overview
This project demonstrates how floating-point numbers are represented and handled using the IEEE 754 standard in Java. It includes practical experiments to show precision errors, special values, overflow/underflow, and binary representation of floating-point numbers.

---

## 🎯 Objectives
- Convert decimal numbers to IEEE 754 32-bit representation
- Understand floating-point arithmetic behavior
- Explore precision errors in real computations
- Demonstrate special values like NaN and Infinity
- Observe overflow and underflow cases

---

## 🧠 Key Concepts Covered

### 1. IEEE 754 Representation
The program converts floating-point numbers into their 32-bit binary IEEE 754 format using Java’s built-in methods.

### 2. Floating-Point Arithmetic Issues
Examples such as:
- `0.1 + 0.2`
- `1.0 / 3.0`

These demonstrate precision errors due to binary representation limitations.

---

### 3. Special Values
The program generates and tests:
- Positive Infinity
- Negative Infinity
- NaN (Not a Number)

Example:
- NaN is not equal to itself → `NaN != NaN` is `true`

---

### 4. Overflow and Underflow
- Overflow example: very large numbers result in `Infinity`
- Underflow example: extremely small numbers become `0.0`

---

## ▶️ How to Run

### 1. Compile the program

javac src/IEEE754Demo.java

### 2. Run the program
java -cp src IEEE754Demo