package com.algorithms;
//10- Maximum Area Rectangle 

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxAreaRectangleTest {
    private final InputStream originalIn = System.in;
    private final PrintStream originalOut = System.out;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setIn(originalIn);
        System.setOut(originalOut);
    }

    @Test
    public void testMaxAreaCalculation() {
        String input = "3\n4\n5\n6\n7\n8\n9\n";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        MaxAreaRectangle.main(new String[0]);

        String expectedOutput = "Enter the number of rectangles (N): " +
                                "Enter the length of rectangle 1: " +
                                "Enter the width of rectangle 1: " +
                                "Enter the length of rectangle 2: " +
                                "Enter the width of rectangle 2: " +
                                "Enter the length of rectangle 3: " +
                                "Enter the width of rectangle 3: " +
                                "Maximum area of a rectangle among the given pairs: 63\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}
