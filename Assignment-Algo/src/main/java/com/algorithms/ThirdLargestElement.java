package com.algorithms;
//13- Third largest element
import java.util.Arrays;
import java.util.Scanner;

public class ThirdLargestElement {
	public static int findThirdLargest(int[] arr) {
        if (arr.length < 3) {
            return -1;
        }

        Arrays.sort(arr);

        return arr[arr.length - 3];
    }
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Size of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int thirdLargest = findThirdLargest(array);

        if (thirdLargest != -1) {
            System.out.println("The third-largest element in the array is: " + thirdLargest);
        } else {
            System.out.println("Array should have at least 3 elements.");
        }

        scanner.close();
    }
 }
