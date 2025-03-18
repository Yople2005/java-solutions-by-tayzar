# Cone Calculator Program

## Program Overview
This program is a simple PHP application that calculates various properties of a cone, including its radius, diameter, area, and volume. The program demonstrates basic mathematical calculations and the use of PHP's built-in mathematical constants.

## Step-by-Step Implementation

1. **Variable Initialization**
   - A radius of 5 units is defined
   - The diameter is calculated by multiplying the radius by 2
   - The area is calculated using the formula πr²
   - A height of 7 units is defined
   - The volume is calculated using the formula (πr²h)/3

2. **Output Display**
   - The program displays the calculated values using PHP's echo statements
   - Results are formatted with HTML line breaks for better presentation

## Key PHP Features and Methods Used

1. **M_PI Constant**
   - Description: A predefined PHP constant representing the mathematical value of π (pi)
   - Usage: Used in area calculation

2. **pow() Function**
   - Description: A mathematical function that raises a number to a specified power
   - Usage: Used to calculate r² in the area formula
   - Syntax: `pow(base, exponent)`

3. **Echo Statement**
   - Description: A language construct used to output strings
   - Usage: Displays the calculated values
   - Supports both double quotes and concatenation with periods

4. **String Concatenation**
   - Description: Combines strings using the dot (.) operator
   - Usage: Combines variable values with text strings for output

## Summary
This program serves as a basic introduction to PHP programming, demonstrating:
- Mathematical calculations
- Use of PHP constants
- Basic output formatting
- Variable manipulation
- String handling

It's a straightforward example that shows how PHP can be used for mathematical computations and displaying results in a web-based format.