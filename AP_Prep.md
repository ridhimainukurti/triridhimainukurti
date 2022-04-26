[Link to Personal Study Guide](https://github.com/ridhimainukurti/triridhimainukurti/wiki/AP-Personal-Study-Guide)

# **Week 1**

## Study Plan for Week 1

| Days | Recommended Actions |
| ------ | ----- |
| Monday | Create a Study Plan for this week and get the review ticket ready with all the stuff due at the end of Friday of this week | 
| Tuesday | Going to take the MCQ exam and make sure to get at least 50% of the questions right (goal) |
| Wednesday | Go over the MCQ corrections and review over the questions that were wrong (take note of the code Mr.M went over in class) |  
| Thursday | Going to take the FRQ 2015 version and make sure to get at least half of the questions done (goal) | 
| Friday | Check over all the required things due at 8pm and make sure to get FRQs in the repl, have study plan (units 1 - 3), and have MCQ corrections done | 

## 2015 FRQ corrections
![image](https://user-images.githubusercontent.com/45546576/165211054-234b166a-bedf-43e2-934a-2d11e1548b15.png)
![image](https://user-images.githubusercontent.com/45546576/165211089-03aa8492-5b03-48e4-a878-0e7309ff70e0.png)
![image](https://user-images.githubusercontent.com/45546576/165211113-db802360-26e6-49fc-9617-1b8302a08cb5.png)

### Repl
[Repl Link](https://replit.com/@ridhimainukurti/APCompSciFRQRepl#Main.java)

## 2015 MCQ corrections 
![image](https://user-images.githubusercontent.com/45546576/165128631-9caa239a-ad90-4d04-87cb-8ba145aebbc4.png)

### **Question 16**
* Correct Answer: E
* Why: The code has two for loops.The first for loop is for rows.The second for loop is for columns.The if check in the inner loop looks for numbers greater than 'found', which is initialized to 17.

The largest number is 69, it is in 3rd column of row 2. Index starts at zero so it returns back 2.
* Mistake: I didn't realize that the second loop is checking for the columns therfore it messed up the code that I visualized within my head leading to the wrong answer. 

### **Question 20**
* Correct Answer: E
* Why: The 'm' variable is a holder for the max number of duplicates found to date in the run of the program. It's -1 initially. It always gets set once (first pass through). It gets set again if a higher number of duplicates is found as it continues to process through the array.

The index variable holds the index of the first occurance if the number that appears most in the array

* Mistake: This I didn't carefully understand the relationship between the outer loop and the inner loop so make sure I read carefully next time (silly mistake). 

### **Question 27**
* Correct Answer: B
* Why:The outer for loop loops through the entire array comparing left to right comparing the current number (outer loop) to the next number (inner loop) Swap does not occur till inner loop completes one full iteration through the array.
* Mistake: I didn't realize that the outer loop loops through the entire array from left to right I thought it was from right to left which caused the error in my answer.  

### **Question 28**
* Correct Answer: B
* Why: Assign to temp" is done within the outer loop to switch any numbers as the inner loop as iterated through the array. The switch is only needed once for each slot or index in the array. This execute 5 times in a six slot array.
* Mistake:  I didn't realize that the outer loop switches to the numbers as the inner loop gets iterated therefore this caused me to choose E. 

### **Question 30**
* Correct Answer: B
* Why: Code chunk I does not work because every "if" statement will be checked.
* Mistake: I forgot that the if statement gets checked and read to fast on this question (silly mistake) 

### **Question 33**
* Correct Answer: E
* Why: For segment I, max is initialized to the minimum value from the Integer class. That's good. Next, the for loop iterates through the array comparing max to value where value is the current value in the array. The variable max is replaced with value when max is less than value (meaning a new max value is found).
* Mistake: I didn't realize that the variable max gets replaced when the max is less therefore I mistakingly removed this option. 

### **Question 34**
* Correct Answer: D
* Why: The "expression" code to set the sizeOfList int variable is "listOfWords.size()" This sets the sizeOfList variable to the true number of instances in the list. If there are four items in the list then it is set to four.
* Mistake: The condition code would not work with the length set that is different which is why C is wrong. 

### **Question 35**
* Correct Answer: C
* Why: Code starts out with a while loop with conditions using "start" and "end" variables. Array starts at zero and ends at last slot (data.length -1).

The variable "mid" is calculated as (1 + 8) / 2 = 3 for the first pass of the while loop.

Target is greater than value at mid slot (i.e. "4") so end = mid + 1.

Recalculate the "mid" variable as (2 + 8) / 2 = 5.

Target is equal to the value at mid slot (i.e. "8") so we have a hit on the search.

Code returns the slot where the middle variable is, which is 5.
* Mistake: I made a calculation error that resulted in me getting a value of 6

### **Question 37**
* Correct Answer: E
* Why: Option I is incorrect. It starts at the starting index and starts to build the string from there. that is incorrect as correct string must start at the end of the array and work backwards to the starting index.
* Mistake: I didn't realize that Option one started at the end of the array and worked backwards which lead to the wrong answer.

### **Question 38**
* Correct Answer: C
* Why: Adds the returned "1" to the existing value if 'k' from the underlying call in the stack. This is how the code returns the number of elements in the variable numbers array that are equal to the value of the val variable. That is why the correct answer is c.
* Mistake: I forgot to remember that the code essentially returns the number of elements in the variable numbers array that are equal to the value of the val variable so I got the wrong answer

