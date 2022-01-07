package com.gabrielmagalhaes.datastructure.recursion;

public class FactorialRecursion {

    public static void main(String[] args) {
        int number = 6;

        int result = factorialOf(number);

        System.out.println("The factorial of " + number + " is " + result);
    }

    private static int factorialOf(int number) {
        return number == 1 ? number : number * factorialOf(number - 1);
    }
}
