package edu.Bootcamp.W10D1.calc;

public class javaCalculator {
    System.out.println("\nUsing a switch-statement to run a calculation engine.\n");
    //      Just declaring some variables to work with here. This is basically our input field.
    double value1 = 100.0d;
    double value2 = 3.0d;
    double result = 0.0d;
    char opCode = 'q';

//      The first thing we do is declare this is a switch statement with the parameter of opCode.
        switch (opCode) {
//          First, in the case that the opCode is 'a', we will set the value of the result variable equal to the sum of the value1 and value2 variables, then use break to stop using the switch-statement.
        case 'a': result = value1 + value2; break;
        case 's': result = value1 - value2;
            break;
        case 'm':
            result = value1 * value2;
            break;
        case 'd':
            result = (value2 != 0) ? value1 / value2 : 0.0d; // Here we're just using a conditional statement which follows (condition) ? true-action : false-action;
            break;
        case 'q':
            result = (value1 * value1);
            break;
        default:
            System.out.println(opCode + " is an invalid input.");
            result = 0.0d;
            break;
    }

        System.out.println(result);
}
