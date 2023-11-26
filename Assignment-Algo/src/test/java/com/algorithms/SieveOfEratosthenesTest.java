package com.algorithms;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class SieveOfEratosthenesTest {

    @Test
    public void testFindPrimes() {
        boolean[] expectedResult = new boolean[] {false, false, true, true, false, true, false, true, false, false};
       
        boolean[] resultList = SieveOfEratosthenes.findPrimes(9);

        assertArrayEquals(expectedResult, resultList);
    }
}
