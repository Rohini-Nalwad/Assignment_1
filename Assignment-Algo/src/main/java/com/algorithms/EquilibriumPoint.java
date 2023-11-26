package com.algorithms;
//27-Equilibrium Point
 
public class EquilibriumPoint {

public static int findEquilibrium(int[] arr) {
    int n = arr.length;
    
    for (int i = 0; i < n; i++) {
        int leftSum = 0;
        int rightSum = 0;

        for (int j = 0; j < i; j++) {
            leftSum += arr[j];
        }
        for (int j = i + 1; j < n; j++) {
            rightSum += arr[j];
        }
        if (leftSum == rightSum) {
            return i; 
        }
    }
    return -1; 
}

public static void main(String[] args) {
    int[] arr = {-7, 1, 5, 2, -4, 3, 0};
    int equilibriumIndex = findEquilibrium(arr);

    if (equilibriumIndex != -1) {
        System.out.println("Equilibrium point found at index " + equilibriumIndex);
    } else {
        System.out.println("No equilibrium point found in the array");
    }
}
}