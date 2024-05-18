# SKJI-113-SKILLRAACE-JAVA-INTERNSHIP-PHASE-1-TASKS-SKILLRAACE
SKILLRAACE JAVA INTERNSHIP. It consist of the java code for Phase 1 tasks. Phase 1 tasks are divided into two parts as TASK 1A and TASK 1B.
-------------------------------------------------------------------

************** *TASK 1A Description:* **************
**Task Description:**
The task is to write a program that calculates the smallest number of notes required to give a certain amount of change. The currency system considered in this problem has notes of seven denominations, namely, Rs. 1, Rs. 2, Rs. 5, Rs. 10, Rs. 50, Rs. 100. The program should take the amount of change as input and output the smallest number of notes required to give that change.

**Code Description:**
The code is written in Java and uses dynamic programming to solve the problem. The main function of the program takes the amount of change as input and initializes an array of integers called minNotes to store the minimum number of notes required to give each amount from 0 to the input amount. The array is initialized with the maximum integer value, which is later replaced with the actual minimum number of notes required for each amount.

The program then uses a nested loop to iterate through each amount from 1 to the input amount and each note denomination from the notes array. For each amount, the program checks if the current note denomination is less than or equal to the amount. If it is, the program calculates the minimum number of notes required for the remaining amount (i.e., the current amount minus the current note denomination) and compares it with the current minimum number of notes required for the current amount. If the new minimum number of notes is less than the current minimum, the program updates the minNotes array with the new minimum.

Finally, the program outputs the smallest number of notes required to give the input amount by printing the value of minNotes[amount].

**Features:**
The program uses dynamic programming to solve the problem, which ensures an optimal solution.
The program takes the amount of change as input and outputs the smallest number of notes required to give that change.
The program considers a currency system with notes of seven denominations, namely, Rs. 1, Rs. 2, Rs. 5, Rs. 10, Rs. 50, Rs. 100.

**Working:**
The program works by initializing an array of integers called minNotes to store the minimum number of notes required to give each amount from 0 to the input amount. The array is initialized with the maximum integer value, which is later replaced with the actual minimum number of notes required for each amount.

The program then uses a nested loop to iterate through each amount from 1 to the input amount and each note denomination from the notes array. For each amount, the program checks if the current note denomination is less than or equal to the amount. If it is, the program calculates the minimum number of notes required for the remaining amount (i.e., the current amount minus the current note denomination) and compares it with the current minimum number of notes required for the current amount. If the new minimum number of notes is less than the current minimum, the program updates the minNotes array with the new minimum.

Finally, the program outputs the smallest number of notes required to give the input amount by printing the value of minNotes[amount].

**Steps for Execution:**
Compile the code using a Java compiler.
Run the compiled code.
Enter the amount of change to be given to Pranav when prompted.
The program will output the smallest number of notes required to give that change.
**Sample Test Cases:**
Input: 1200
Output: The smallest number of notes that will combine to give is: 12
Input: 242
Output: The smallest number of notes that will combine to give is: 7


************** *TASK 1B Description:* **************
This Java program is designed to help the authorities of Fantasy Kingdom amusement park to program the kiosks to issue tickets based on people's age. The program takes an integer input representing the age of the person and checks whether they are eligible for the rides or not. If the age is less than 15 (Children) or greater than 60 (Aged), the program displays "Not Allowed" as output. Otherwise, it displays "Allowed".

**Features:**
The program takes an integer input representing the age of the person.
The program checks whether the person's age is less than 15 or greater than 60.
If the age is less than 15 or greater than 60, the program outputs "Not Allowed".
Otherwise, the program outputs "Allowed".

**Working:**
The program first takes an integer input representing the age of the person using the Scanner class. It then checks whether the age is less than 15 or greater than 60 using an if statement. If the condition is true, the program outputs "Not Allowed". Otherwise, it outputs "Allowed".

**Steps to execute the program:**
Save the code in a file named "task1b.java".
Open the terminal or command prompt and navigate to the directory where the file is saved.
Compile the program by typing "javac task1b.java" and pressing enter.
Run the program by typing "java task1b" and pressing enter.
Enter the age of the person when prompted.
The program will display "Allowed" or "Not Allowed" based on the age entered.
This program can be used to help the park authorities to ensure that only eligible individuals are allowed to ride the rides that are not suitable for children and aged people.
