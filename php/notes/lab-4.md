# Homing Pigeons Simulator Program

## Program Overview
This program simulates two homing pigeons finding their way back to their home position on a grid. It demonstrates random positioning, movement algorithms, and dynamic visual representation using HTML and CSS.

## Step-by-Step Implementation

1. **Initial Setup**
   - Defines a 10x10 grid map size
   - Sets up CSS styling for the map display
   - Creates classes for home position, pigeons, and empty spaces

2. **Position Generation**
   - Randomly generates positions for:
     - Home location (homeX, homeY)
     - First pigeon position (pigeon1X, pigeon1Y)
     - Second pigeon position (pigeon2X, pigeon2Y)
   - Ensures pigeons start at least half the map size away from home

3. **Movement Logic**
   - Implements movement for both pigeons:
     - Compares current X and Y coordinates with home position
     - Moves pigeons one step closer in both dimensions
     - Continues until both pigeons reach home

4. **Visual Display**
   - Creates a grid representation using HTML and CSS
   - Uses different symbols for:
     - '+' for home position
     - '%' for pigeons
     - '.' for empty spaces
   - Updates display after each movement

## Key PHP Features and Methods Used

1. **Random Number Generation**
   - Function: rand()
   - Description: Generates random integers within a specified range
   - Usage: Positioning home and pigeons initially

2. **Do-While Loops**
   - Description: Executes code block at least once before checking condition
   - Usage: Initial positioning and movement simulation

3. **Absolute Value Function**
   - Function: abs()
   - Description: Returns absolute value of a number
   - Usage: Calculating distances between positions

4. **Conditional Statements**
   - Description: Controls movement logic based on current positions
   - Usage: Determines direction of pigeon movement

5. **String Concatenation**
   - Description: Combines strings for output
   - Usage: Building the HTML display

6. **CSS Styling**
   - Description: Defines visual appearance of the map
   - Usage: Creates grid layout and styles different elements

## Summary
This program demonstrates:
- Random number generation and positioning
- Path-finding algorithm implementation
- Dynamic HTML/CSS generation
- Loop and conditional logic
- Visual representation of data

It serves as an excellent example of combining PHP logic with visual output to create an interactive simulation. The program effectively shows how to implement basic movement algorithms and represent them visually in a web browser.