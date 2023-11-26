package com.algorithms;
//11-Immediate Smaller Element

import java.util.Scanner;

public class ImmediateSmallerElement {
	 public static int findImmediateSmaller(int[] array, int index) {
	      
	        if (index > 0 && index < array.length) {
	            int immediateSmaller = Integer.MIN_VALUE;
	            for (int i = 0; i < index; i++) {
	                if (array[i] < array[index] && array[i] > immediateSmaller) {
	                    immediateSmaller = array[i];
	                }
	            }
	            return (immediateSmaller == Integer.MIN_VALUE) ? -1 : immediateSmaller;
	        } else {
	            return -1;
	        }
	    }
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Immediate Smaller Elements:");
        for (int i = 0; i < size; i++) {
            int immediateSmaller = findImmediateSmaller(array, i);
            System.out.println("Element at index " + i + ": " + immediateSmaller);
        }

        scanner.close();
    }

}
