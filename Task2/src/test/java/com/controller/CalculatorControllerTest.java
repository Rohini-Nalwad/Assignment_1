package com.controller;

import com.model.CalculatorMinMaxRequest;
import com.service.RequestResponseLogService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

class CalculatorControllerTest {

    @Mock
    private RequestResponseLogService logService;

    @InjectMocks
    private CalculatorController calculatorController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testSubtraction() {
        when(logService.subtraction(anyDouble(), anyDouble())).thenReturn(2.0);
        double result = calculatorController.subtraction(5.0, 3.0);
        assertEquals(2.0, result);
    }

    @Test
    void testMultiplication() {
        when(logService.multiplication(anyDouble(), anyDouble())).thenReturn(15.0);
        double result = calculatorController.multiplication(3.0, 5.0);
        assertEquals(15.0, result);
    }

    @Test
    void testDivision() {
        when(logService.division(anyDouble(), anyDouble())).thenReturn(2.0);
        double result = calculatorController.division(10.0, 5.0);
        assertEquals(2.0, result);
    }

    @Test
    void testSquare() {
        when(logService.square(anyDouble())).thenReturn(25.0);
        double result = calculatorController.square(5.0);
        assertEquals(25.0, result);
    }

    @Test
    void testSquareRoot() {
        when(logService.squareRoot(anyDouble())).thenReturn(4.0);
        double result = calculatorController.squareRoot(16.0);
        assertEquals(4.0, result);
    }

    @Test
    void testFactorial() {
        when(logService.factorial(anyInt())).thenReturn(120L);
        long result = calculatorController.factorial(5);
        assertEquals(120L, result);
    }

    @Test
    public void testMinMax() {
        List<Double> inputNumbers = Arrays.asList(10.0, -5.0, 7.0, 15.0, -7.0, -6.0, 16.0, 19.0, -15.0, 9.0);
        List<Double> expectedResult = Arrays.asList( -15.0,19.0);

        CalculatorMinMaxRequest request = new CalculatorMinMaxRequest();
        request.setNumbers(inputNumbers);

        when(logService.minMax(any(CalculatorMinMaxRequest.class))).thenReturn(expectedResult);
        List<Double> result = calculatorController.minMax(request);
        assertEquals(expectedResult, result);
    }
}
