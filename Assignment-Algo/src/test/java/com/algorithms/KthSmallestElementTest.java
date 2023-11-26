package com.algorithms;
// 26- Kth smallest element
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KthSmallestElementTest {

    @Test
    public void testKthSmallest_ValidInput() {
        int[] arr = {4, 2, 7, 1, 9};
        int k = 3;
        int expected = 4; 
        int result = KthSmallestElement.kthSmallest(arr, k);
        assertEquals(expected, result);
    }

    @Test
    public void testKthSmallest_InvalidInput() {
        int[] arr = {4, 2, 7, 1, 9};
        int k = 6;
        int result = KthSmallestElement.kthSmallest(arr, k);
        assertEquals(-1, result);
    }

    @Test
    public void testKthSmallest_EmptyArray() {
        int[] arr = {};
        int k = 3;
        int result = KthSmallestElement.kthSmallest(arr, k);
        assertEquals(-1, result);
    }

    @Test
    public void testKthSmallest_SingleElementArray() {
        int[] arr = {5};
        int k = 1; 
        int result = KthSmallestElement.kthSmallest(arr, k);
        assertEquals(5, result);
    }
}
