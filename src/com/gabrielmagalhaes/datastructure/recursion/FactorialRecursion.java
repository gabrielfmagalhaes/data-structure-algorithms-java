package com.gabrielmagalhaes.datastructure.recursion;

public class FactorialRecursion {

    public static void main(String[] args) {
        int number = 6;

        int result = factorialOf(number);

        System.out.println("The factorial of " + number + " is " + result);
    }

    private static int factorialOf(int number) {
        if (number == 1) {
            return number;
        }

        return number * factorialOf(number - 1);
    }
}
