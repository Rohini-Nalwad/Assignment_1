package com.algorithms;
// 9- Count subsets having distinct even numbers

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CountEvenSubsetsTest {

	@Test
	public void CountEvenSubsets(){
		int[] arr = {1,2,3,4,5};
        int actualResult = CountEvenSubsets.countDistinctEvenSubsets(arr);
        int expectedResult = 32;

        assertEquals(expectedResult, actualResult);
    }
}