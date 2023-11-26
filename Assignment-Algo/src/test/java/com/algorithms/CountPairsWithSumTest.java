package com.algorithms;
//29- Count pairs with given sum
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CountPairsWithSumTest {

	@Test
    public void countPairsWithSumTest() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int targetSum = 10;
        int expectedResult = 4; 

        int actualResult = CountPairsWithSum.countPairsWithSum(array, targetSum);

        assertEquals(expectedResult, actualResult);
    }
}
