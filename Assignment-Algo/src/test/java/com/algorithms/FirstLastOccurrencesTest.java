package com.algorithms;
//18- First and last occurrences of X

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import java.util.Map;

public class FirstLastOccurrencesTest {

    @Test
    public void testFirstAndLastOccurrences() {
        int[] array = {1, 3, 5, 7, 5, 9, 5, 3, 5};
        int x = 5;

        Map<String, Integer> occurrences = FirstLastOccurrences.firstAndLast(array, array.length, x);

        int firstOccurrence = occurrences.get("First Occurrence");
        int lastOccurrence = occurrences.get("Last Occurrence");

        assertNotNull(occurrences);
        assertEquals(2, firstOccurrence);
        assertEquals(8, lastOccurrence);
    }
}
