package com.algorithms;
//18- First and last occurrences of X
import java.util.HashMap;
import java.util.Map;

public class FirstLastOccurrences {

    public static Map<String, Integer> firstAndLast(int[] arr, int sizeOfArray, int x) {
        Map<String, Integer> map = new HashMap<>();
        int firstOccurrence = -1, lastOccurrence = -1;

        for (int i = 0; i < sizeOfArray; i++) {
            if (x == arr[i]) {
                firstOccurrence = i;
                break;
            }
        }

        for (int i = sizeOfArray - 1; i >= 0; i--) {
            if (x == arr[i]) {
                lastOccurrence = i;
                break;
            }
        }

        map.put("First Occurrence", firstOccurrence);
        map.put("Last Occurrence", lastOccurrence);
        return map;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 5, 9, 5, 3, 5};
        int x = 5; 

        Map<String, Integer> occurrences = firstAndLast(array, array.length, x);

        int firstOccurrence = occurrences.get("First Occurrence");
        int lastOccurrence = occurrences.get("Last Occurrence");

        if (firstOccurrence != -1 && lastOccurrence != -1) {
            System.out.println("First occurrence of " + x + " is at index: " + firstOccurrence);
            System.out.println("Last occurrence of " + x + " is at index: " + lastOccurrence);
        } else {
            System.out.println("Element " + x + " not found in the array.");
        }
    }
}
