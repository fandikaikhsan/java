# Problem

#### By Fandika Ikhsan

---

_Problem Set: Intro to conditional and looping_

Welcome to this problem set designed to help you practice your looping and conditional skills in programming. These exercises are designed to be deliberately challenging, and they will help you improve your problem-solving abilities as well as your ability to write clear and efficient pseudocode.

It is important to remember that the key to mastering these skills is to practice regularly and deliberately. Take the time to study each problem carefully, and try to come up with multiple solutions. Don't worry if your first attempt doesn't work - that's all part of the learning process.

Before you begin, it may be helpful to review the basic concepts of loops and conditionals in programming. Make sure you understand how to write a for loop, a while loop, and an if/else statement.

The problems in this set start off easier and gradually increase in difficulty, so don't be discouraged if you find some of them more challenging than others. The key is to keep practicing and building your skills, one step at a time. Good luck!

Sets:

1. Write a program that prints out the numbers from 1 to 10.
2. Write a program that prints out the even numbers from 1 to 20.
3. Write a program that takes value from varible ```myNumber``` and return whether the number is odd or even.
```
  Int[] myNumber = 2;
  return "even"
```

4. Write a program that takes value from 2 index array called ```myNumber```, and return out the multiplication table for that number up to 5 in array called ```multiplicationNum```.

```
 Int[] myNumber = [2, 3];
 return Int[] multiplicationNum = [2, 4, 8, 10, 3, 6, 9, 12, 15]
```

5. Write a program that takes value from 5 index array ```listNumber```, and return the sorted array.

```
 Int[] listNumber = [1, 5, 3, 2, 4]
 return Int[] sortedNumber = [1, 2, 3, 4, 5]
```

To make easier it follow this template:

```
# Fandika Ikhsan
# Problem 1

# Template comes from How to Design Programs book by Matthias Felleisen
# Use hastag to comment out your code. Computer will not processed the line with hastag

## Purpose:
# Write a program that sum 2 number, then return boolean if the answer is available on array called listNum.

## Signature:
# Int numA, Int numB, Int[] listNum -> Bool result

## Pseudocode:

# Initiate all variable needed
Int numA = 5;
Int numB = 10;
Int[] listNum = [1, 2, 3];
Bool result = false;

# Calculate sum of 2 variable
Int sum = numA + numB;

# Do for looping to check each array elements
for (int i = 0; i < listNum.length; i++) {
  # Check is sum equals to array elements?
  if (sum == listNum[i]) {
    return true;
  }
}
# return false if there is no answer in array
return false;

```

Note: <br/>
- Please write your answer in document file and export it to PDF file.
- Due in Wednesday at 23.59 WIB. 
- Sent your answer to Whatsapp group.
- Goodluck all!
