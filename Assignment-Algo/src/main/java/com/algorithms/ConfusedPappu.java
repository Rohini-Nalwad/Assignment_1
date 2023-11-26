package com.algorithms;

public class ConfusedPappu {
    public static int findDiff(int n) {
        int newNum = 0, i, temp = 0, reminder, number = n;
        while (n > 0) {
            i = n % 10;
            if (i == 6) {
                i = 9;
            }
            temp = temp * 10 + i;
            n = n / 10;
        }
       
        while (temp > 0) {
            reminder = temp % 10;
            newNum = newNum * 10 + reminder;
            temp = temp / 10;
        }
        System.out.println("New Number: " + newNum);
       
        int diff = newNum - number;
        System.out.println("Difference: " + diff);
        return diff;
    }

    public static void main(String[] args) {
        int inputNumber = 123456;
        int difference = findDiff(inputNumber);
        System.out.println("Difference for " + inputNumber + " is: " + difference);
    }
}
