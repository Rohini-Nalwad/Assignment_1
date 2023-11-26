package com.algorithms;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class PrimeNumberTest {
	@Test
	public void testWithPrime() {
		int number = 37;
		int expectedResult=1;
		boolean actualResult= PrimeNumber.isPrime(number);
	    assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	@Test
	public void testNotPrime() {
		int number = 10;
		int expectedResult=0;
		boolean actualResult= PrimeNumber.isPrime(number);
	    assertThat(actualResult).isEqualTo(expectedResult);
	}
}