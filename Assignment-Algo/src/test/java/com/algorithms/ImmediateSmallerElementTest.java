package com.algorithms;
//11-Immediate Smaller Element


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ImmediateSmallerElementTest {

    @Test
    public void testFindImmediateSmaller() {
        int[] inputArray = {4, 2, 1, 5, 3};
        int[] expectedOutput = {2, 1, -1, 3, -1};

        int[] actualResult = new int[inputArray.length];
        ImmediateSmallerElement immediateSmallerElement = new ImmediateSmallerElement();

        for (int i = 0; i < inputArray.length; i++) {
            actualResult[i] = immediateSmallerElement.findImmediateSmaller(inputArray, i);
        }

        assertArrayEquals(expectedOutput, actualResult);
    }
}
