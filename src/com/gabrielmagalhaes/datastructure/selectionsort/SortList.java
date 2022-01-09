package com.gabrielmagalhaes.datastructure.selectionsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortList {

    public static void main(String[] args) {
        List<Integer> unsortedNumbers = new ArrayList<>(Arrays.asList(141,234,3, 94,88,61,111));

        System.out.println(Arrays.toString(sortListOf(unsortedNumbers)));
    }

    private static int[] sortListOf(List<Integer> unsortedNumbers) {
        int[] sortedList = new int[unsortedNumbers.size()];

        int listSize = unsortedNumbers.size();

        for (int i = 0; i < listSize; i++) {
            int highestNumber = highestNumberFrom(unsortedNumbers.subList(0, unsortedNumbers.size()));

            sortedList[i] = highestNumber;

            unsortedNumbers.remove(Integer.valueOf(highestNumber));
        }

        return sortedList;
    }

    private static int highestNumberFrom(List<Integer> numbers) {
        int highNumber = numbers.get(0);

        for (int number : numbers) {
            if (highNumber < number) {
                highNumber = number;
            }
        }

        return highNumber;
    }
}
