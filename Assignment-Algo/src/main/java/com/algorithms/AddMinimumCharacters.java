package com.algorithms;
//24- Add Minimum Characters
import java.util.Scanner;

public class AddMinimumCharacters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the input string: ");
        String str = scanner.nextLine();

        int result = addMinChar(str);

        System.out.println("Minimum characters to add: " + result);

        scanner.close();
    }

    public static int addMinChar(String str) {
        int i = 0, j = str.length() - 1;
        int trim = j, res = 0;

        while (i < j) {
            if (str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
            } else {
                res++;
                i = 0;
                j = --trim;
            }
        }

        return res;
    }
}
