package com.algorithms;
//5- Nth Fibonacci Number
import java.util.Scanner;

public class Fibonacci {	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        long result = findNthFibonacci(n);

        System.out.println("The " + n + "th Fibonacci number is: " + result);

        scanner.close();
    }

    public static long findNthFibonacci(int n) {
        final int MODULO = 1000000007;

        if (n <= 1) {
            return n;
        }

        long a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = (a + b) % MODULO;
            a = b;
            b = c;
        }

        return c;
    }
}
