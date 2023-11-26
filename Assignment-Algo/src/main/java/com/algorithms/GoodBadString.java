package com.algorithms;

public class GoodBadString {

    public static int isGoodOrBad(String S) {
        int vowels = 0, consonants = 0;
        int countVowels = 0, countConsonants = 0;
        boolean isBad = false;

        for (char ch : S.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
                countVowels++;
                countConsonants = 0;
            } else if (ch == '?') {
                vowels++;
                consonants++;
                countVowels++;
                countConsonants++;
            } else {
                consonants++;
                countConsonants++;
                countVowels = 0;
            }

            if (countVowels > 5 || countConsonants > 3) {
                isBad = true;
                break;
            }
        }

        return isBad ? 0 : 1;
    }

    public static void main(String[] args) {
        String S1 = " aeioup??";
        System.out.println("S1 is " + (isGoodOrBad(S1) == 1 ? "GOOD" : "BAD"));
    }
}
