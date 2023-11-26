package com.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.controller.CalculatorController;
import com.model.CalculatorMinMaxRequest;
import com.model.RequestResponseLog;
import com.repositories.CalculationLogRepository;

@SpringBootTest
public class RequestResponseLogServiceTest {

    @Autowired
    private RequestResponseLogService requestResponseLogService;
    
    @InjectMocks
    private CalculatorController calculatorController;

    @Autowired
    private CalculationLogRepository logRepository;
    
   
    @Test
    void testSaveRequestResponseLog() {
        String request = "Test request";
        String response = "Test response";

        requestResponseLogService.saveRequestResponseLog(request, response);

        List<RequestResponseLog> logs = logRepository.findAll();
        assertThat(logs).isNotEmpty();
        assertThat(logs.get(0).getRequestData()).isEqualTo(request);
        assertThat(logs.get(0).getResponseData()).isEqualTo(response);
    }
 

    @Test
    void testAddition() {
        double number1 = 12.0;
        double number2 = 15.0;
        double result = 27.0;
        double actualResult = requestResponseLogService.addition(number1, number2);
        assertThat(result).isEqualTo(actualResult);
    }
    @Test
    void testSubtraction() {
        double number1 = 15;
        double number2 = 12;
        double result = 3;
        double actualResult = requestResponseLogService.subtraction(number1, number2);
        assertThat(actualResult).isEqualTo(result);
    }

    @Test
    void testMultiplication() {
        double number1 = 12;
        double number2 = 15;
        double result = 180;
        double actualResult = requestResponseLogService.multiplication(number1, number2);
        assertThat(actualResult).isEqualTo(result);
    }

    @Test
    void testDivision() {
        double number1 = 12;
        double number2 = 3;
        double result = 4;
        double actualResult = requestResponseLogService.division(number1, number2);
        assertThat(actualResult).isEqualTo(result);
    }

    @Test
    void testSquare() {
        double number = 5;
        double result = 25;
        double actualResult = requestResponseLogService.square(number);
        assertThat(actualResult).isEqualTo(result);
    }

    @Test
    void testSquareRoot() {
        double number = 225;
        double result = 15;
        double actualResult = requestResponseLogService.squareRoot(number);
        assertThat(actualResult).isEqualTo(result);
    }

    @Test
    void testFactorial() {
        int number = 5;
        long result = 120;
        long actualResult = requestResponseLogService.factorial(number);
        assertThat(actualResult).isEqualTo(result);
    }
    
    @Test
    public void testMinMax() {
        List<Double> inputNumbers = Arrays.asList(10.0, -5.0, 7.0, 15.0, -7.0, -6.0, 16.0, 19.0, -15.0, 9.0);
        CalculatorMinMaxRequest request = new CalculatorMinMaxRequest();
        request.setNumbers(inputNumbers);

        List<Double> expectedResult = Arrays.asList(-15.0,19.0);
        List<Double> result = requestResponseLogService.minMax(request);
        assertEquals(expectedResult, result);
    }
}
    