package com.algorithms;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class ConfusedPappuTest {
   
	@Test
	void testConfusedPappu() {
		int  inputNumber = 123459;
		int Difference = 3;
		int actualDifference= ConfusedPappu.findDiff(inputNumber);
	    assertThat(actualDifference).isEqualTo(Difference);
	}
}
