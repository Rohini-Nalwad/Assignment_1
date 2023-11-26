package com.algorithms;
//29- Count pairs with given sum
import java.util.HashMap;
import java.util.Map;

public class CountPairsWithSum {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int targetSum = 10;

        int count = countPairsWithSum(array, targetSum);

        System.out.println("Number of pairs with sum " + targetSum + ": " + count);
    }

   static int countPairsWithSum(int[] array, int targetSum) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int count = 0;

        for (int num : array) {
            int complement = targetSum - num;

            if (frequencyMap.containsKey(complement)) {
                count += frequencyMap.get(complement);
            }

            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        return count;
    }
}

