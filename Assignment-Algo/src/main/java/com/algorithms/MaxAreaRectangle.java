package com.algorithms;
//10- Maximum Area Rectangle 
//length × width
import java.util.Scanner;

public class MaxAreaRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rectangles (N): ");
        int N = scanner.nextInt();

        int maxArea = 0;

        for (int i = 0; i < N; i++) {
            System.out.print("Enter the length of rectangle " + (i + 1) + ": ");
            int length = scanner.nextInt();

            System.out.print("Enter the width of rectangle " + (i + 1) + ": ");
            int width = scanner.nextInt();

            int area = length * width;
            maxArea = Math.max(maxArea, area);
        }

        System.out.println("Maximum area of a rectangle among the given pairs: " + maxArea);

        scanner.close();
    }
}
