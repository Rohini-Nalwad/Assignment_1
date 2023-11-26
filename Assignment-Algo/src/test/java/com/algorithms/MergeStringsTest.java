package com.algorithms;
//19- Merge two strings 
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeStringsTest {

    @Test
    public void testMergeStringsUsingPlusOperator() {
        String str1 = "Hello";
        String str2 = "World";
        String expectedMergedString = "Hello World";

        String mergedString = str1 + " " + str2;

        assertEquals(expectedMergedString, mergedString, "Merged strings don't match using + operator");
    }

    @Test
    public void testMergeStringsUsingConcatMethod() {
        String str1 = "Hello";
        String str2 = "World";
        String expectedMergedString = "Hello World";

        String mergedString = str1.concat(" ").concat(str2);

        assertEquals(expectedMergedString, mergedString, "Merged strings don't match using concat method");
    }
}
