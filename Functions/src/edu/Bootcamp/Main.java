package edu.Bootcamp;

public class Main {

    public static void main(String[] args) {
//      Functions just organize code, and enable reusable code blocks that receives and returns data.
//      Functions (also known as methods) are first named, then parameters are included in parentheses after it. Following that, statements are wrapped in curly brackets.
//      The syntax for a function is...
//          return-type name (params) { statements }
//      Both params and statements are optional, which can be useful at different times. Also, some methods may have a return type of void if there is no data to return.
        System.out.println("Method/function examples:");
        void showSum(float x, float y, int count) {
            float sum = x + y;
            for(int i = 0; i < count; i++) System.out.println(sum);
        }
        showSum(7.5, 1.4, 3);
    }
}
