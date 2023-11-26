package com.algorithms;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ZigZagTest {
	
	@Test
	public void zigZagArray() {
		int n = 7;
		int arr[] = { 4, 3, 7, 8, 6, 2, 1 };
		int result =  ZigZag.convertToZigZag(arr);
		assertEquals(n, result);

	}

}
