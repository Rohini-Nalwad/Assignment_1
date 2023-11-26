package com.algorithms;
//30-Maximum Product Subarray

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumProductSubarrayTest {

    @Test
    public void testMaxProductWithPositiveNumbers() {
        int[] nums = {2, 3, 5, 7};
        assertEquals(210, MaximumProductSubarray.maxProduct(nums));
    }

    @Test
    public void testMaxProductWithNegativeNumbers() {
        int[] nums = {2, 3, -2, 4, -1};
        assertEquals(48, MaximumProductSubarray.maxProduct(nums));
    }

    @Test
    public void testMaxProductWithSingleNumber() {
        int[] nums = {5};
        assertEquals(5, MaximumProductSubarray.maxProduct(nums));
    }

    @Test
    public void testMaxProductWithZero() {
        int[] nums = {2, 0, 3, -2, 4};
        assertEquals(4, MaximumProductSubarray.maxProduct(nums));
    }

    @Test
    public void testMaxProductWithEmptyArray() {
        int[] nums = {};
        assertEquals(0, MaximumProductSubarray.maxProduct(nums));
    }

    @Test
    public void testMaxProductWithNull() {
        int[] nums = null;
        assertEquals(0, MaximumProductSubarray.maxProduct(nums));
    }
}
