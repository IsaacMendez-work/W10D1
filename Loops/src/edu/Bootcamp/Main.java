package edu.Bootcamp;

public class Main {

    public static void main(String[] args) {
/*
Loops repeatedly execute a statement as long as the provided condition is true. There are three main kinds:
    While loops, which are basic looping
    Do-while loops, which are loops which defer to a condition check
    For loop, which are loops with simplified notation for common use case
Note: There is also a for-each loop that is covered in the arrays notes for today.
*/


/*
While loops check a condition at the start of the loop, then run the loop's statement.
While loops are structured as follows:
    while (condition-statement) loop-statement;
The loop body will only be executed if the condition is true when the code comes to it.
*/
        System.out.println("\nWhile loop example:");
//      We will find the factorial of a number (the product of all the numbers including itself down to 1).

        int someValue = 5;
        int factorial = 1;
        System.out.print(someValue + "'s factorial expression is... \nFirst ");
        while (someValue > 1) {
            factorial *= someValue;
            System.out.print(factorial + " then ");
            someValue--;
        }
        System.out.print("the expression ends");
/*
So while someValue is greater than 1, it will multiply the factorial times someValue, then subtract 1 from someValue.
An example of running through the while loop if someValue is 4:
    The loop runs the first time and sees that someValue's value of 4 is more than 1, so it runs the statement... The statement starts by taking factorial's value of 1, multiplying it times someValue's value of 4, and assigning the result (4, since 1*4=4) to factorial through the use of the multiplication assignment operator... Then, someValue's value is reduced by 1 using the postfix operator, so its value is now 3.
    The loop runs a second time and sees that someValue's value of 3 is more than 1, so it runs the statement... The statement starts by multiplying factorial's value of 4 by someValue's value of 3, then assigning the result (12, since 4*3=12) to factorial by using the multiplication assignment operator... Then, someValue's value is reduced by 1.
    The loop runs a 3rd time and sees that someValue's value of 2 is > 1, so the statement runs. factorial's value of 12 is multiplied by someValue's value of 2, then the value is reassigned to factorial (24, since 12*2=24). Then someValue's value is reduced by 1.
    The loop runs a 4th time, but someValue's value of 1 is not greater than 1, so the statement does not run, and Java moves on to the next line of code, which shows us the product of all the natural numbers up to 4.
*/


        System.out.println("\n\nDo-while loop example:");
//      The key difference between a while loop and a do-while loop is that the condition isn't checked until the end. This means do-whiles will always run at least once.
//      The structure of a do-while is: do statement; while (condition)
        int iVal = 5;
        do {
            System.out.print(iVal);
            System.out.print(" * 2 = ");
            iVal *= 2;
            System.out.println(iVal);
        } while (iVal < 25);
/*
When the program comes to the above example, it will run the do statement only as long as the iVal < 25. In this example, the loop ends when iVal < 25.
NOTE: If iVal is more than 25 when its value is first assigned, the do statement will still run once, because it's not checking any conditions until the while statement.
*/


        System.out.println("\nFor loop example:");
/*
Syntax of for loops is...
    for (condition) statement;
The loop checks the condition before running the statement, like the while loop.
The main difference is that a for loop allows for simplified notation for loop control values.
For example, initialization and updates don't need to happen before and after the loop, like with the while loop. Instead, it can all be included in the loop itself, using the following syntax...
    for (initialize; condition; update) statement;
The initialization happens once, and the update happens every pass.
To compare, here is a while loop followed by the same loop as a for loop.
        int i = 1;
        while (i < 100) {
            System.out.println(i);
            i *= 2;
        }
If we were to run this as a for loop, it would be just one line...
*/
        for ( int i = 1; i < 100; i *= 2 ) System.out.println(i);
    }
}