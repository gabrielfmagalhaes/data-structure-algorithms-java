package com.gabrielmagalhaes.datastructure.binarytree;

import java.util.ArrayList;
import java.util.List;

public class OrderedNumbersBinaryTree {

    public static void main(String[] args) {
        int listSize = 100;
        int expectedValue = 10;

        validateResult(
                expectedValue,
                findValueInBinaryTree(fillList(listSize), expectedValue));
    }

    private static List<Integer> fillList(int listSize) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < listSize; i++) {
            numbers.add(i);
        }

        return numbers;
    }

    private static int findValueInBinaryTree(List<Integer> orderedNumbers, int expectedValue) {
        int low = 0;
        int higher = orderedNumbers.size();
        int counter = 0;

        while (low <= higher) {
            System.out.println("Attempt: " + ++counter);

            int middle = (low + higher) / 2;
            int guessNumber = orderedNumbers.get(middle);

            if (guessNumber == expectedValue) {
                return guessNumber;
            }

            if (guessNumber > expectedValue) {
                higher = middle - 1;
            } else {
                low = middle + 1;
            }
        }

        return -1;
    }

    private static void validateResult(int expectedValue, int result) {
        if (expectedValue == result) {
            System.out.println("Program found the correct value: " + result);
        } else {
            System.out.println("Program wasn't able to found the correct value: "+ result);
        }
    }
}
