package com.model;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class CalculatorMinMaxRequestTest {

    @Test
    void testGetNumbers() {
        List<Double> numbers = Arrays.asList(10.0, -5.0, 7.0, 15.0);
        CalculatorMinMaxRequest request = new CalculatorMinMaxRequest();
        request.setNumbers(numbers);
        assertThat(request.getNumbers()).isEqualTo(numbers);
    }

    @Test
    void testSetNumbers() {
        List<Double> numbers = Arrays.asList(10.0, -5.0, 7.0, 15.0);
        CalculatorMinMaxRequest request = new CalculatorMinMaxRequest();
        request.setNumbers(numbers);
        assertThat(request.getNumbers()).isEqualTo(numbers);
    }

    @Test
    void testSetNumbersWithEmptyList() {
        List<Double> numbers = Arrays.asList();
        CalculatorMinMaxRequest request = new CalculatorMinMaxRequest();
        request.setNumbers(numbers);
        assertThat(request.getNumbers()).isEqualTo(numbers);
    }

    @Test
    void testSetNumbersNull() {
        CalculatorMinMaxRequest request = new CalculatorMinMaxRequest();
        request.setNumbers(null);
        assertThat(request.getNumbers()).isNull();
    }
}