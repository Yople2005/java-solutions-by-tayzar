

```markdown
# Java Package Guide

This guide explains how to include a package declaration in your Java code and how to run your Java programs with package names.

## What is a Java Package?

A package in Java is a way to group related classes and interfaces together. It helps organize your code, avoid naming conflicts, and make your project more modular.

## Steps to Include a Package Declaration

### 1. Create a Directory Structure

Create a directory structure that matches your package name. For example, if your package name is `mypackage`, create a directory called `mypackage`.

```
src/
├── mypackage/
│   ├── SumCalculation.java
│   └── CreditLimitCalculator.java
```

### 2. Add the Package Declaration

Add a package declaration at the top of your Java source files. For example:

#### SumCalculation.java

```java
package mypackage;

public class SumCalculation {
    public static void main(String[] args) {
        int sum;
        int x;

        x = 1;
        sum = 0;
        sum = sum + x;

        System.out.println("The sum is: " + sum);
    }
}
```

#### CreditLimitCalculator.java

```java
package mypackage;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = input.nextInt();

        System.out.print("Enter balance at the beginning of the month: ");
        int beginningBalance = input.nextInt();

        System.out.print("Enter total of all items charged this month: ");
        int charges = input.nextInt();

        System.out.print("Enter total of all credits this month: ");
        int credits = input.nextInt();

        System.out.print("Enter allowed credit limit: ");
        int creditLimit = input.nextInt();

        int newBalance = beginningBalance + charges - credits;

        System.out.printf("New balance: %d\n", newBalance);

        if (newBalance > creditLimit) {
            System.out.println("Credit limit exceeded");
        }
    }
}
```

### 3. Compiling the Code

Navigate to the `src` directory and use the `javac` command to compile the Java source files:

```sh
cd src
javac mypackage/*.java
```

### 4. Running the Compiled Code

Use the `java` command to run the compiled classes with the package name:

```sh
java mypackage.SumCalculation
java mypackage.CreditLimitCalculator
```
