package com.algorithms;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class SmallestAndSecondSmallestTest {
	@Test
	public void smallestAndSecondSmallest() {

		int[] arr1 = {5, 2, 4, 3, 6};
        int[] expectedResult1 = {2, 3};
        assertArrayEquals(expectedResult1, SmallestAndSecondSmallest.findSmallestAndSecondSmallest(arr1));
	}
}