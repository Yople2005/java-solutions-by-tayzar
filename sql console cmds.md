## MySQL Console Commands

MySQL console တွင် database များကို manage လုပ်ရန် အောက်ပါများကိုအသုံးပြု

---

### 1. SHOW DATABASES
MySQL server တွင် ရှိသော database များအားလုံးကို ပြသရန် အသုံးပြုပါသည်။

Syntax:
SHOW DATABASES;

Example:
SHOW DATABASES;


MySQL server ထဲတွင် ရှိသော database များအားလုံးကို list အနေဖြင့် ပြသပေးမည်။

---

### 2. CREATE DATABASE
Database အသစ်တစ်ခု ဖန်တီးရန် အသုံးပြုပါသည်။

Syntax:
CREATE DATABASE database_name;

Example:
CREATE DATABASE school;


school အမည်ရှိ database အသစ်တစ်ခုကို ဖန်တီးပေးမည်။

---

### 3. USE DATABASE
ရွေးချယ်ထားသော database ကို အသုံးပြုရန် အသုံးပြုပါသည်။

Syntax:
USE database_name;

Example:
USE school;


school database ကို အသုံးပြုရန် ရွေးချယ်လိုက်ပါသည်။ ထို့နောက် SQL commands များကို ဤ database ထဲတွင် run နိုင်မည်။

---

### 4. SHOW TABLES
လက်ရှိ အသုံးပြုနေသော database ထဲတွင် ရှိသော tables များကို ပြသရန် အသုံးပြုပါသည်။

Syntax:
SHOW TABLES;

Example:
SHOW TABLES;


လက်ရှိ အသုံးပြုနေသော database ထဲတွင် ရှိသော tables များကို list အနေဖြင့် ပြသပေးမည်။

---

### 5. DESCRIBE TABLE
ဇယား၏ structure ကို ကြည့်ရန် အသုံးပြုပါသည်။ ဇယားထဲရှိ columns များ၊ data types များနှင့် အခြား attributes များကို ပြသပေးမည်။

Syntax:
DESCRIBE table_name;
သို့မဟုတ်
DESC table_name;

Example:
DESCRIBE students;


students ဇယား၏ structure ကို ပြသပေးမည်။ ဥပမာ - columns များ၊ data types များ၊ primary key ရှိမရှိ စသည်တို့ကို ကြည့်ရှုနိုင်မည်။

---

## Example Workflow in MySQL Console

1. Database များကို ကြည့်ရှုခြင်း:
      SHOW DATABASES;
   

2. Database အသစ်ဖန်တီးခြင်း:
      CREATE DATABASE school;
   

3. Database ကို အသုံးပြုခြင်း:
      USE school;
   

4. Table အသစ်ဖန်တီးခြင်း:
      CREATE TABLE students (
       student_id INT PRIMARY KEY,
       first_name VARCHAR(50),
       last_name VARCHAR(50),
       age INT
   );
   

5. Tables များကို ကြည့်ရှုခြင်း:
      SHOW TABLES;
   

6. Table structure ကို ကြည့်ရှုခြင်း:
      DESCRIBE students;
   

---