package com.algorithms;
//5- Nth Fibonacci Number
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {

	 @Test
	    public void testFindNthFibonacci() {
	        int input1 = 5;
	        long expected1 = 5;
	        long result1 = Fibonacci.findNthFibonacci(input1);
	        assertEquals(expected1, result1);
}
}
