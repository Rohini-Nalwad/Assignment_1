package com.algorithms;
//17-Check for subsequence
import java.util.Scanner;

public class SubsequenceCheck {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        System.out.print("Enter the potential subsequence: ");
        String subsequence = scanner.nextLine();

        if (isSubsequence(mainString, subsequence)) {
            System.out.println("'" + subsequence + "' is a subsequence of '" + mainString + "'.");
        } else {
            System.out.println("'" + subsequence + "' is NOT a subsequence of '" + mainString + "'.");
        }

        scanner.close();
    }

    static boolean isSubsequence(String mainString, String subsequence) {
        int mainLength = mainString.length();
        int subLength = subsequence.length();

        int i = 0; 
        int j = 0;

        while (i < mainLength && j < subLength) {
            if (mainString.charAt(i) == subsequence.charAt(j)) {
                j++;
            }
            i++;
        }
        return (j == subLength);
    }
}
		
	        