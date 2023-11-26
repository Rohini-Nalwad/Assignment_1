package com.algorithms;

public class Factorial {
    public static void main(String[] args) {
        int number = 5;
        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is " + factorial);
    }

   public static long calculateFactorial(int n) {
        if (n < 0) {
            return -1; 
            } else if (n == 0 || n == 1) {
            return 1; 
        } else {
            long result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }
}
