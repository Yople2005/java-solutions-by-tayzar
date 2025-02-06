# Basic SQL Commands
---

## 1. SELECT
ဒေတာများကို database မှ ရွေးချယ်ရန် အသုံးပြု

**Syntax:**
```sql
SELECT column1, column2, ...
FROM table_name;
Example:
SELECT first_name, last_name 
FROM employees;

employees ဇယားမှ first_name နှင့် last_name column များကို ရွေးချယ်ပြီး ပြပေးမယ်
```
---

## 2. WHERE
ဒေတာများကို သတ်မှတ်ထားသော condition အရ filter လုပ်ရန် အသုံးပြု

**Syntax:**
```sql
SELECT column1, column2, ...
FROM table_name
WHERE condition;
Example:
SELECT * 
FROM employees 
WHERE salary > 50000;

employees ဇယားမှ salary column တွင် 50000 ထက်ကြီးသော ဒေတာများကို ရွေးချယ်ပြီးပြပေး
```
---

## 3. INSERT INTO
ဇယားထဲသို့ ဒေတာအသစ်များ ထည့်ရန် အသုံးပြု

**Syntax:**
```sql
INSERT INTO table_name (column1, column2, ...)
VALUES (value1, value2, ...);
Example:
INSERT INTO employees (first_name, last_name, salary)
VALUES ('Toke', 'Gyi', 60000);

employees ဇယားထဲသို့ first_name အတွက် 'Toke'၊ last_name အတွက် 'Gyi'၊ salary အတွက် 60000 ကို ထည့်သွင်းပေးမည်။
```
---

## 4. UPDATE
ဇယားထဲရှိ ဒေတာများကို update လုပ်ရန် အသုံးပြုပါသည်။

**Syntax:**
```sql
UPDATE table_name
SET column1 = value1, column2 = value2, ...
WHERE condition;
Example:
UPDATE employees
SET salary = 65000
WHERE first_name = 'Tokw';

employees ဇယားထဲရှိ first_name column တွင် 'Toke' ဖြစ်သော row ၏ salary ကို 65000 အဖြစ် update လုပ်ပေးမည်။
```
---

## 5. DELETE
ဇယားထဲမှ ဒေတာများကို ဖျက်ရန် အသုံးပြုပါသည်။

**Syntax:**
```sql
DELETE FROM table_name
WHERE condition;
Example:
DELETE FROM employees
WHERE last_name = 'Gyi';

employees ဇယားထဲမှ last_name column တွင် 'Gyi' ဖြစ်သော row ကို ဖျက်ပေးမည်။
```
---

## 6. CREATE TABLE
ဇယားအသစ်တစ်ခု ဖန်တီးရန် အသုံးပြုပါသည်။

**Syntax:**
```sql
CREATE TABLE table_name (
    column1 datatype,
    column2 datatype,
    ...
);
Example:
CREATE TABLE students (
    student_id INT,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    age INT
);

students အမည်ရှိ ဇယားအသစ်တစ်ခုကို ဖန်တီးပြီး student_id, first_name, last_name, age column များကို ထည့်သွင်းပေးမည်။
```
---

## 7. ALTER TABLE
ဇယား၏ structure ကို ပြင်ဆင်ရန် အသုံးပြုသည်။

**Syntax:**
```sql
ALTER TABLE table_name
ADD column_name datatype;
Example:
ALTER TABLE students

students ဇယားထဲသို့ email column အသစ်တစ်ခုကို ထည့်သွင်းပေးမည်။
```
---

## 8. DROP TABLE
ဇယားတစ်ခုလုံးကို ဖျက်ရန် အသုံးပြုပါသည်။

**Syntax:**
```sql
DROP TABLE table_name;
Example:
DROP TABLE students;

students ဇယားကို လုံးဝဖျက်ပစ်မည်။
```
---

## 9. ORDER BY
ဒေတာများကို သတ်မှတ်ထားသော column အရ ascending (ငယ်စဉ်ကြီးလိုက်) သို့မဟုတ် descending (ကြီးစဉ်ငယ်လိုက်) စီရန် အသုံးပြုပါသည်။

**Syntax:**
```sql
SELECT column1, column2, ...
FROM table_name
ORDER BY column1 ASC|DESC;
Example:
SELECT * 
FROM employees
ORDER BY salary DESC;

employees ဇယားထဲရှိ ဒေတာများကို salary column အရ ကြီးစဉ်ငယ်လိုက်စီပြီး ပြသပေးမည်။
```
---

## 10. GROUP BY
ဒေတာများကို သတ်မှတ်ထားသော column အရ group ဖွဲ့ရန် အသုံးပြုပါသည်။

**Syntax:**
```sql
SELECT column1, COUNT(*)
FROM table_name
GROUP BY column1;
Example:
SELECT department, COUNT(*)
FROM employees
GROUP BY department;

employees ဇယားထဲရှိ ဒေတာများကို department column အရ group ဖွဲ့ပြီး လူဦးရေကို ရေတွက်ပေးမည်။
```