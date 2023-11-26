package com.algorithms;
// 26- Kth smallest element

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestElement {

    public static int kthSmallest(int[] arr, int k) {
        if (k > 0 && k <= arr.length) {
            Arrays.sort(arr);
            return arr[k - 1];
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the array: ");
        String[] inputArray = scanner.nextLine().split(" ");
        int[] array = Arrays.stream(inputArray).mapToInt(Integer::parseInt).toArray();

        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        int result = kthSmallest(array, k);

        if (result != -1) {
            System.out.println("The " + k + "th smallest element is: " + result);
        } else {
            System.out.println("Invalid input for k");
        }

        scanner.close();
    }
}