package com.algorithms;
//14- Find the smallest and second smallest element in an array
import java.util.Scanner;

public class SmallestAndSecondSmallest {
	public static int[] findSmallestAndSecondSmallest(int[] array) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : array) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        return new int[]{smallest, secondSmallest};
    }
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int[] result = findSmallestAndSecondSmallest(array);

        System.out.println("Smallest element: " + result[0]);
        System.out.println("Second smallest element: " + result[1]);

        scanner.close();
    }
}
