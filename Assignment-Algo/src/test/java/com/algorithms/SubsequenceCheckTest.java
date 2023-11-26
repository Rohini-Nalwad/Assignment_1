package com.algorithms;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SubsequenceCheckTest {
	@Test
    public void testIsSubsequence() {
        String s1 = "AXY";
        String s2 = "YADXCP";
        boolean isSubsequence = SubsequenceCheck.isSubsequence(s1, s2);
        assertEquals(true, isSubsequence);
    }

    @Test
    public void testIsNotSubsequence() {
        String s1 = "gksrek";
        String s2 = "geeksforgeeks";
        boolean isSubsequence = SubsequenceCheck.isSubsequence(s1, s2);
        assertEquals(false, isSubsequence);
    }
}
