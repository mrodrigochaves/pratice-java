package edu.marciorodrigo.pratice;

public class Calculator {

    public static void sum(double number1, double number2) {

        double result = number1 + number2;

        System.out.println("The sum of " + number1 + " more " + number2 + " is " + result);
    }

    public static void subtraction(double number1, double number2) {

        double result = number1 - number2;

        System.out.println("The subtraction of " + number1 + " less " + number2 + " is " + result);
    }

    public static void multiplication(double number1, double number2) {

        double result = number1 * number2;

        System.out.println("The multiplication of " + number1 + " times " + number2 + " is " + result);
    }

    public static void  division(double number1, double number2) {

        double result = number1 / number2;

        System.out.println("The division of " + number1 + " for " + number2 + " is " + result);
    }

}