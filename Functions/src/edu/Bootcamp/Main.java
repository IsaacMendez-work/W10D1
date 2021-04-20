package edu.Bootcamp;
//      Functions just organize code, and enable reusable code blocks that receives and returns data.
//      Functions (also known as methods) are first named, then parameters are included in parentheses after it. Following that, statements are wrapped in curly brackets.
//      The syntax for a function is...
//          return-type name (params) { statements }
//      Both params and statements are optional, which can be useful at different times. Also, some methods may have a return type of void if there is no data to return.

public class Main {

    public static void main(String[] args) {
        System.out.println("Function example:");
        showSum(7.5f, 1.333f, 19);
    }
//      Here, we're using a function called showSum and providing the params. When we run this, Java will come to this point, then search for the location of the function, which is declared below.


//      To call a function, it needs to be declared somewhere. If you want it in the same file, it has to go inside of public class Main, but not inside of public static void main(String[] args) {...}

    static void showSum(float num1, float num2, int repeats) {
//      Here, the return type is static void, the name is showSum, the parameters are withing the (), and the statements are everything below within the {}
        float sum = num1 + num2;
        for(int i = 0; i < repeats; i++) System.out.print(sum + " ");
    }
//      What the above function does is add num1 and num2, then print out the result repeats-number of times.
}
