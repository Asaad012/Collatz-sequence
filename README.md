# Collatz-sequence
Coding math problems "Collatz sequence and its variant" and getting the time complexity of my code.  
You can test my code by cloning it in your own setup and give it the input you want to test for the numbers.

In this assignment, you will develop and experiment the complexities of two nice and nifty math problems, 
namely, the Collatz sequence and its variant. Don’t worry if are not aware of this concept – it is easily 
explained below!
Note: The actual coding part of the assignment is relatively easy. It is an assignment to help you understand 
how algorithm complexity works for large values of n.
As with Lab No. 3, you can use the following code template to obtain the execution time of your code.
 long startTime, endTime, executionTime; startTime = System.currentTimeMillis();
 //code snippet (or call to the method) here
 endTime = System.currentTimeMillis(); executionTime = endTime - startTime;
The above code will give the time for executing the code snippet in milliseconds. You can display the 
executionTime using System.out.println and/or save it for drawing the result graphs.
Program Exercise No. 1: Collatz Sequence
The Collatz sequence of a positive integer n is defined as follows:
a) Start with the integer n (the starting number).
b) If the integer is even, divide it by 2 (integer division) (that is, n←n/2)
c) If the integer is odd, multiply it by 3 and add 1. (that is, n←3n + 1)
d) Repeat the process until n becomes 1.
For example, let n = 5. Then its Collatz sequence is:
5→16→8→4→2→1
Since it takes six iterations, the length of the Collatz sequence for starting number 5 is 6.
As another example, let n = 13. Then its Collatz sequence is:
13→40→20→10→5→16→8→4→2→1
The length of the Collatz sequence for starting number 13 is 10.
Although it is not proven yet, it is thought that all Collatz sequences end in 1.
Step 1: Write a program to generate the Collatz sequence for a given positive integer n. Here is a 
sample screen dialog for the program:
Enter a positive integer: 5 
The Collatz sequence for n = 5 is 5, 16, 8, 4, 2, 1
As you may see, this is a simple program! Test your program for different values of n.
Step 2: Now modify your program to calculate which starting number less than or equal to
an input value of n produces the longest Collatz sequence. For example, if you were to find which
starting number less than or equal to 5 produces the longest sequence, the answer would be 3 and 
the length of the sequence is 8. See below:
1: 1
2: 2→1
3: 3→10→5→16→8→4→2→1
4: 4→2→1
5: 5→16→8→4→2→1
As you can see, if n=5, the starting number with the longest sequence is 3 and the length of the 
longest sequence is 8.
You can also check for yourself that if n = 6, the starting number with the longest sequence is 6, 
and the length of the longest sequence is 9.
Here’s a sample screen dialog for this modified program.
Enter a positive integer: 5 
For n=5, the starting number of the longest Collatz sequence is 3 
and the length of the longest sequence is 8.
Note that in the modified program, you are not displaying the Collatz sequences. Rather, you just 
display the starting number of the longest sequence and its length.
Test your program for different values of n.
Step 3: Next modify the program from Step 2 to calculate the time for execution of the core part 
of your code – code to determine the Collatz sequences up to n and determining the longest sequence and its starting number. 
Here’s a sample screen dialog for this step:
1000 ß this is the input to the program
1000 871 179 3 ß this is the output of the program 
The value of n is 1000, the starting number of the longest Collatz sequence is 871, the length of 
the longest sequence is 179, and it took 3 milliseconds (on my machine).
Test your modified program for different values of n.
Step 4 (Final modified program – this is what you will submit as part of the assignment):
Your program should accept input in the following format:
a) Positive integers separated by whitespace will indicate the values of n.
b) Your program should exit when passed 0 as an input.
Your program should provide output in the following format:
a) There should be one line for each value of n.
b) Each line should contain four numerical values separated by whitespace, representing 
the starting value of n, the number producing the longest sequence, the length of that sequence, the execution time in milliseconds.
Test that your program works for n values of 5, 100, 1000, 10000, 100000, 1000000, and 
10000000. Once you are sure that it is correctly identifying the longest sequences, set it up to 
time your code’s execution in milliseconds. Save the output in a text file called Exercise1.out. 
Plot a simple graph of n vs. execution time.
Here’s a sample input and output of the program:
Exercise1.in
5 100 1000 10000 100000 1000000 10000000 0
Exercise1.out
5 3 8 0
100 97 119 1
1000 871 179 3
10000 6171 262 12
100000 77031 351 54
1000000 837799 525 411
10000000 8400511 686 4685
In the above, for example, for n = 5, the longest Collatz sequence starts at 3, the length of the 
longest sequence is 8, and it takes 0 milliseconds to compute.
As another example, for n = 10000000, the longest Collatz sequence starts at 8400511, the length 
of the longest sequence is 686, and it takes 4685 milliseconds to compute.
Program Exercise No. 2: Cousin of Collatz Sequence
For this exercise, you will be writing a program in steps very similar to Exercise No. 1, except that you will 
be testing a sequence called the “Cousin of Collatz”. It is also called the 7x	±	1	problem and is defined as 
follows:
Start at a positive integer n.
If n is even, divide it by 2 (integer division) (that is n ß n/2)
If n is odd and n % 4 is 1, then multiply it by 7 and add 1 (that is, n ß 7n+1)
If n is odd and n % 4 is 3, then multiply it by 7 and subtract 1 (that is, n ß 7n -1)
Repeat until n becomes 1.
(Note: As you know from your first year, % represents the remainder of an integer division. 15%4 is 3 
whereas 17%4 is 1).
For example, if n = 5, then the 7x	±	1	sequence is:
5 à 36 à 18 à 9 à 64 à 32 à 16 à 8 à 4 à 2 à 
Once you get your basic program for generating the above sequence working, modify the program as you 
did in Step 4 of Exercise 1, except that this time your code is for the “Cousin of Collatz” sequence. 
Test your code for the following input:
5 100 1000 10000 100000 1000000 10000000 0
