package com.controller;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.model.CalculatorResponse;
import com.model.CalculatorMinMaxRequest;
import com.model.CalculatorMinMaxResponse;

class CalculatorControllerTest {

    private CalculatorController calculatorController = new CalculatorController();

    @Test
    void testAddition() {
        double number1 = 12;
        double number2 = 15;
        double result = 27;
        CalculatorResponse expectedResult = new CalculatorResponse(result, number1 + " + " + number2 + " = " + result);
        CalculatorResponse actualResult = calculatorController.addition(number1, number2);
        assertThat(expectedResult.getResult()).isEqualTo(actualResult.getResult());
    }

    @Test
    void testSubtraction() {
        double number1 = 12;
        double number2 = 15;
        double result = -3;
        CalculatorResponse expectedResult = new CalculatorResponse(result, number1 + " - " + number2 + " = " + result);
        CalculatorResponse actualResult = calculatorController.subtraction(number1, number2);
        assertThat(expectedResult.getResult()).isEqualTo(actualResult.getResult());
    }

    @Test
    void testMultiplication() {
        double number1 = 12;
        double number2 = 15;
        double result = 180;
        CalculatorResponse expectedResult = new CalculatorResponse(result, number1 + " * " + number2 + " = " + result);
        CalculatorResponse actualResult = calculatorController.multiplication(number1, number2);
        assertThat(expectedResult.getResult()).isEqualTo(actualResult.getResult());
    }

    @Test
    void testDivision() {
        double number1 = 12;
        double number2 = 15;
        double result = 0.8;
        CalculatorResponse expectedResult = new CalculatorResponse(result, number1 + " / " + number2 + " = " + result);
        CalculatorResponse actualResult = calculatorController.division(number1, number2);
        assertThat(expectedResult.getResult()).isEqualTo(actualResult.getResult());
    }

    @Test
    void testSquare() {
        double number1 = 5;
        double result = 25;
        CalculatorResponse expectedResult = new CalculatorResponse(result, "square of " + number1 + " = " + result);
        CalculatorResponse actualResult = calculatorController.square(number1);
        assertThat(expectedResult.getResult()).isEqualTo(actualResult.getResult());
    }

    @Test
    void testSquareRoot() {
        double number1 = 225;
        double result = 15;
        CalculatorResponse expectedResult = new CalculatorResponse(result, "square root of " + number1 + " = " + result);
        CalculatorResponse actualResult = calculatorController.squareRoot(number1);
        assertThat(expectedResult.getResult()).isEqualTo(actualResult.getResult());
    }

    @Test
   
    void testFactorial() {
        int number1 = 5;
        long result = 120;
        CalculatorResponse expectedResult = new CalculatorResponse(result, number1 + "! = " + result);
        CalculatorResponse actualResult = calculatorController.factorial(number1);
        assertThat(expectedResult.getResult()).isEqualTo(actualResult.getResult()); 
    }

    @Test
    void testCalculateMinMax() {
        Double[] array = {10.0, -5.0, 7.0, 15.0, -7.0, -6.0, 16.0, 19.0, -15.0, 9.0};
        List<Double> list = Arrays.asList(array);
        double min = -15.0;
        double max = 19.0;
        CalculatorMinMaxRequest request = new CalculatorMinMaxRequest();
        request.setNumbers(list);
        CalculatorMinMaxResponse expectedResult = new CalculatorMinMaxResponse(min, max);
        CalculatorMinMaxResponse actualResult = calculatorController.minMax(request);
        assertThat(expectedResult.getMin()).isEqualTo(actualResult.getMin());
        assertThat(expectedResult.getMax()).isEqualTo(actualResult.getMax());
    }
}
