package com.algorithms;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class FactorialTest {

    @Test
    public void testFactorial() {
        int number = 4;
        long expectedResult = 24;
        long actualResult = Factorial.calculateFactorial(number);
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    public void testFactorialZero() {
        int number = 0;
        long expectedResult = 1;
        long actualResult = Factorial.calculateFactorial(number);
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    public void testFactorialNegative() {
        int number = -5;
        long expectedResult = -1;
        long actualResult = Factorial.calculateFactorial(number);
        assertThat(actualResult).isEqualTo(expectedResult);
    }
}

