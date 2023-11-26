package com.algorithms;
//25-Missing number in array

import java.util.Arrays;

public class MissingNumber {

    static int findMissingNumber(int[] arr) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }

        return arr.length + 1;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 7, 1, 2, 8, 4, 5};
        int missingNumber = findMissingNumber(numbers);

        System.out.println("The missing number is: " + missingNumber);
    }
}

