# Number Testing Program

## Program Overview
This program creates a table that analyzes numbers from 1 to 10, determining whether each number is odd/even and prime. It demonstrates the use of loops, conditional statements, and HTML table generation in PHP.

## Step-by-Step Implementation

1. **HTML Table Structure**
   - Creates a table with three columns: Number, Odd or Even, and Prime
   - Uses CSS for basic table styling with collapsed borders

2. **Number Processing Loop**
   - Implements a for loop that iterates from 1 to 10
   - For each number, performs two tests:
     - Odd/Even determination using modulo operator
     - Prime number check using switch statement

3. **Conditional Logic**
   - Odd/Even Check:
     - Uses ternary operator to check if number is divisible by 2
     - Returns "Even" if divisible, "Odd" if not
   - Prime Number Check:
     - Uses switch statement to identify prime numbers (2, 3, 5, 7)
     - All other numbers are marked as non-prime

4. **Dynamic Table Generation**
   - Uses string interpolation to create table rows
   - Each row contains the number and its test results

## Key PHP Features and Methods Used

1. **For Loop**
   - Description: Control structure for iterating a specific number of times
   - Usage: Generates numbers from 1 to 10
   - Syntax: `for (initialization; condition; increment)`

2. **Modulo Operator (%)**
   - Description: Returns remainder of division operation
   - Usage: Determines if a number is odd or even
   - Syntax: `number % 2`

3. **Ternary Operator**
   - Description: Shorthand conditional expression
   - Usage: Assigns "Odd" or "Even" based on modulo result
   - Syntax: `condition ? value_if_true : value_if_false`

4. **Switch Statement**
   - Description: Alternative to multiple if-else statements
   - Usage: Identifies prime numbers
   - Features: Case statements and default handling

5. **String Interpolation**
   - Description: Embeds variables within backtick strings
   - Usage: Generates dynamic HTML table rows
   - Syntax: Using ${variable} within backticks

## Summary
This program demonstrates:
- Basic control structures (loops and conditionals)
- HTML table generation using PHP
- Mathematical operations (modulo)
- Different ways to handle conditional logic
- Dynamic content generation

It serves as a practical example of combining PHP logic with HTML output, showing how to process and display data in a structured format.