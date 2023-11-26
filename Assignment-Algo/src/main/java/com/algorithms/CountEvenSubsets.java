package com.algorithms;
// 9- Count subsets having distinct even numbers

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountEvenSubsets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int count = countDistinctEvenSubsets(array);
        System.out.println("Number of subsets with distinct even numbers: " + count);

        scanner.close();
    }

    public static int countDistinctEvenSubsets(int[] array) {
        int n = array.length;
        int result = 0;

        Set<Integer> evenNumbers = new HashSet<>();
        for (int i = 0; i < (1 << n); i++) {
            evenNumbers.clear();

            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    if (array[j] % 2 == 0) {
                        evenNumbers.add(array[j]);
                    }
                }
            }
            if (evenNumbers.size() == evenNumbers.size()) {
                result++;
            }
        }

        return result;
    }
}
