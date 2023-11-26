package com.algorithms;
//6- Fibonacci Series up to Nth term
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FibonacciSeriesTest {

    @Test
    void testFibonacciWithZero() {
        assertEquals(0, FibonacciSeries.fibonacci(0));
    }

    @Test
    void testFibonacciWithOne() {
        assertEquals(1, FibonacciSeries.fibonacci(1));
    }

    @Test
    void testFibonacciWithSmallNumber() {
        assertEquals(1, FibonacciSeries.fibonacci(2));
    }

    @Test
    void testFibonacciWithLargeNumber() {
        assertEquals(55, FibonacciSeries.fibonacci(10));
    }
}
