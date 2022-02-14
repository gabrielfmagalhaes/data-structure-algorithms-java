package com.gabrielmagalhaes.datastructure.hashtable;

import java.util.*;

public class SortList {
    public static void main(String[] args) {
        Map<String, Integer> unsortedMap = initUnsortedMap();
        Map<String, Integer> sortedMap = sortMap(unsortedMap);

        printMap(sortedMap);
    }

    private static Map<String, Integer> initUnsortedMap() {
        return new HashMap<>(){{
            put("Gorillaz", 141);
            put("Bo Burnham", 234);
            put("Lil Nas X", 94);
            put("Kendrick Lamar", 88);
            put("David Bowie", 61);
            put("Elton John", 111);
        }};
    }

    private static Map<String, Integer> sortMap(Map<String, Integer> unsortedMap) {
        List<Map.Entry<String, Integer>> list = new LinkedList<>(unsortedMap.entrySet());

        list.sort(Map.Entry.<String, Integer>comparingByValue().reversed());

        Map<String, Integer> result = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }

        return result;
    }

    private static void printMap(Map<String, Integer> map) {
        map.forEach((key, value) -> System.out.println("Artist: "+key + ", Plays: " + value));
    }
}