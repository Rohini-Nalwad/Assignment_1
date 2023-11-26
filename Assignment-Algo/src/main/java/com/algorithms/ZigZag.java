package com.algorithms;
//12- Convert array into Zig-Zag fashion
import java.util.Arrays;

public class ZigZag {
	
	public static int convertToZigZag(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
              if ((i % 2 == 0 && arr[i] > arr[i + 1]) || (i % 2 != 0 && arr[i] < arr[i + 1])) {
                swap(arr, i, i + 1);
            }
        }
		return n;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void main(String[] args) {
        int[] array = {4, 3, 7, 8, 6, 2, 1};

        System.out.println("Original Array: " + Arrays.toString(array));

        convertToZigZag(array);

        System.out.println("Zig-Zag Array: " + Arrays.toString(array));
    }

}
