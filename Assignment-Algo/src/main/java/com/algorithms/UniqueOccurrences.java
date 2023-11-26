package com.algorithms;
//21- Unique Number of Occurrences
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueOccurrences {

    public static boolean isuniqueOccurrences(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        Set<Integer> occurrenceSet = new HashSet<>(countMap.values());
        return occurrenceSet.size() == countMap.size();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 1, 3, 3};
        boolean result = isuniqueOccurrences(arr);
        System.out.println("Occurrences are unique: " + result);
    }
}
