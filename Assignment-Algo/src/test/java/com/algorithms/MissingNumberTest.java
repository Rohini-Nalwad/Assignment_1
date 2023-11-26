package com.algorithms;
//25-Missing number in array
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MissingNumberTest {

    @Test
    public void testFindMissingNumber() {
        int[] arr1 = {2, 3, 4, 5}; 
        assertEquals(1, MissingNumber.findMissingNumber(arr1));

        
        int[] arr2 = {1, 2, 3, 4}; 
        assertEquals(5, MissingNumber.findMissingNumber(arr2));

       
        int[] arr3 = {1, 3, 4, 5}; 
        assertEquals(2, MissingNumber.findMissingNumber(arr3));

       
        int[] arr4 = {1, 2, 3, 4, 5};
        assertEquals(6, MissingNumber.findMissingNumber(arr4));
    }
}
