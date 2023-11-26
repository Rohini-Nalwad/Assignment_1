package com.algorithms;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ThirdLargestElementTest {
	@Test
	public void testLargestElement13(){
		int arr[]={2,4,1,3,5};
		int result=ThirdLargestElement.findThirdLargest(arr);
		assertEquals(3,result);
	}
	
	@Test
	public void testNotThirdLargestElement13(){
		int arr[]={1,2};
		int result=ThirdLargestElement.findThirdLargest(arr);
		assertEquals(-1,result);
	}
 }
