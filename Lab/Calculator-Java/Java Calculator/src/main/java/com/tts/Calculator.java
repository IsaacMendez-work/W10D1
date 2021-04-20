package com.tts;

public class Calculator {

    public void add(double num1, double num2) {
        double sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
    }

    public void subtract(double num1, double num2) {
        double difference = num1 - num2;
        System.out.println("The difference of " + num1 + " and " + num2 + " is " + difference);
    }

    public void multiply(double num1, double num2) {
        double product = num1 * num2;
        System.out.println("The product of " + num1 + " and " + num2 + " is " + product);
    }

    public void divide(double num1, double num2) {
        double quotient = num1 / num2;
        System.out.println("The quotient of " + num1 + " and " + num2 + " is " + quotient);
    }

    public void square(double num1) {
        double total = num1 * num1;
        System.out.println("The square of " + num1 + " is " + total);
    }
}