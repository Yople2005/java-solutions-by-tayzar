# Text Justification Program

## Program Overview
This program implements text justification functionality, taking a multi-line text input and formatting it to create justified text with a specified line length. It demonstrates advanced string manipulation, text processing, and formatting techniques in PHP.

## Step-by-Step Implementation

1. **Text Input and Configuration**
   - Uses heredoc syntax (<<<END_TEXT) for multi-line text input
   - Sets line length limit to 40 characters
   - Splits text into paragraphs using explode()

2. **Word Processing**
   - Splits each paragraph into words using preg_split()
   - Tracks current line length and word count
   - Builds lines while respecting the line length limit

3. **Line Formation**
   - Creates arrays of words that fit within line length
   - Handles word wrapping and line breaks
   - Maintains paragraph separation

4. **Justification Logic**
   - Calculates spaces needed between words
   - Handles special cases:
     - Last line of paragraph (left-aligned)
     - Single word lines
     - Regular lines (fully justified)
   - Distributes extra spaces evenly between words

## Key PHP Features and Methods Used

1. **Heredoc Syntax**
   - Description: Multi-line string declaration
   - Usage: Defines input text block
   - Syntax: <<<IDENTIFIER ... IDENTIFIER

2. **String Functions**
   - explode(): Splits string by delimiter
   - preg_split(): Splits string by regular expression
   - strlen(): Gets string length
   - str_repeat(): Repeats a string
   - implode(): Joins array elements with a string

3. **Array Functions**
   - array_sum(): Calculates sum of array values
   - array_map(): Applies callback to array elements
   - count(): Gets array length

4. **Flow Control**
   - foreach: Iterates over arrays
   - if/else: Handles different justification cases
   - for: Controls space distribution

5. **Mathematical Operations**
   - floor(): Rounds down to nearest integer
   - Modulo (%): Calculates remaining spaces

## Summary
This program demonstrates:
- Advanced text processing techniques
- Array manipulation and string handling
- Mathematical calculations for text formatting
- Complex logic implementation
- Professional text justification algorithm

It serves as an excellent example of how PHP can be used for sophisticated text formatting tasks, showing both basic and advanced programming concepts working together to achieve professional-quality text output.