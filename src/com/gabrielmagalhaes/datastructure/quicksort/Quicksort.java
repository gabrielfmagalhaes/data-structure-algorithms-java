package com.gabrielmagalhaes.datastructure.quicksort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quicksort {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 9, 133, 44, 20, 1, 7);

        System.out.println("Result of the sum: " + sumOf(numbers));
        System.out.println("Result of the count: " + countTotalItemsIn(numbers));
        System.out.println("Result of the highest number: " + highestNumberFrom(numbers));
        System.out.println("Result of the sorted list: " + sortOf(numbers));
    }

    //First Algorithm
    private static int sumOf(List<Integer> numbers) {
        return numbers.size() == 1 ? numbers.get(0) : numbers.get(0) + sumOf(numbers.subList(1, numbers.size()));
    }

    //Second Algorithm
    private static int countTotalItemsIn(List<Integer> numbers) {
        return numbers.size() == 1 ? 1 : 1 + countTotalItemsIn(numbers.subList(1, numbers.size()));
    }

    //Third Algorithm
    private static int highestNumberFrom(List<Integer> numbers) {
        if (numbers.size() == 2) {
            return numbers.get(0) > numbers.get(1) ? numbers.get(0) : numbers.get(1);
        }

        int subMax = highestNumberFrom(numbers.subList(1, numbers.size()));

        return numbers.get(0) > subMax ? numbers.get(0) : subMax;

    }

    //Fourth Algorithm
    private static List<Integer> sortOf(List<Integer> numbers) {
        if (numbers.size() < 2) {
            return numbers;
        }

        int middle = numbers.get(numbers.size() / 2);

        List<Integer> firsHalf = numbers.subList(0, (numbers.size() / 2));
        List<Integer> secondHalf = numbers.subList((numbers.size() / 2) + 1, numbers.size());

        List<Integer> lowers = new ArrayList<>();
        List<Integer> highers = new ArrayList<>();

        for (int i : firsHalf) {
            if (i > middle) {
                highers.add(i);
            } else {
                lowers.add(i);
            }
        }

        for (int i : secondHalf) {
            if (i > middle) {
                highers.add(i);
            } else {
                lowers.add(i);
            }
        }

        List<Integer> result = new ArrayList<>(sortOf(lowers));
        result.add(middle);
        result.addAll(sortOf(highers));

        return result;
    }
}
