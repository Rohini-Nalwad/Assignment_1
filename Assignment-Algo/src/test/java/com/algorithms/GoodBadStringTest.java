package com.algorithms;
//20-Good or Bad string
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GoodBadStringTest {

	@Test
	public void testGoodOrBad() {
		String S1 = " aeioup??";
		int actualresult = GoodBadString.isGoodOrBad(S1);
		assertEquals(1, actualresult);


	}
}
  