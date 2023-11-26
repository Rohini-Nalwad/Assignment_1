package com.algorithms;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class PalindromeIntTest {
	@Test
	public void testWithPalindrome() {
		int number = 1221;
		int expectedResult=1;
		boolean actualResult= PalindromeInt.isPalindrome(number);
	    assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	@Test
	public void testNotPalindrome() {
		int number = 1230;
		int expectedResult=0;
		boolean actualResult= PalindromeInt.isPalindrome(number);
	    assertThat(actualResult).isEqualTo(expectedResult);
	}
}
