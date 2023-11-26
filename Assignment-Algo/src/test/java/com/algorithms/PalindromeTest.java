package com.algorithms;
//4- Palindrome String

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {

	@Test
	void testPalindromeString() {
		String str="abba";
		int expectedResult=1;
		boolean actualResult= Palindrome.isPalindrome(str);
	    assertThat(actualResult).isEqualTo(expectedResult);
	}

	@Test
	void testNotPalindromeString() {
		String str="abbau";
		int expectedResult=0;
		boolean actualResult= Palindrome.isPalindrome(str);
	    assertThat(actualResult).isEqualTo(expectedResult);
	}
}
