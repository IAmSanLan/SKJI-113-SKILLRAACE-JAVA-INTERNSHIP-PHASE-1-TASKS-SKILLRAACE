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

