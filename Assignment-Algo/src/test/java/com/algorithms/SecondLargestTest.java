package com.algorithms;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SecondLargestTest {
	@Test
	public void secondLargest(){
		int arr[]={7,10,5,2,5};
		assertEquals(7, SecondLargest.findSecondLargest(arr));

	}
}