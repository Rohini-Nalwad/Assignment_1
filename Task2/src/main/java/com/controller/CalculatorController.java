package com.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.model.CalculatorMinMaxRequest;
import com.service.RequestResponseLogService;

@RestController
@RequestMapping("/calculatorapi/v1")
public class CalculatorController {
    private static final Logger LOGGER = LoggerFactory.getLogger(CalculatorController.class);

    private final RequestResponseLogService logService;

    public CalculatorController(RequestResponseLogService logService) {
        this.logService = logService;
    }

    @GetMapping("/addition")
    public double addition(@RequestParam double number1, @RequestParam double number2) {
        LOGGER.info("Received request for addition with numbers: {} and {}", number1, number2);
        double result = logService.addition(number1, number2);
        LOGGER.info("Sending response: {}", result);
        return result;
    }

    @GetMapping("/subtraction")
    public double subtraction(@RequestParam double number1, @RequestParam double number2) {
        LOGGER.info("Received request for subtraction with numbers: {} and {}", number1, number2);
        double result = logService.subtraction(number1, number2);
        LOGGER.info("Sending response: {}", result);
        return result;
    }

    @GetMapping("/multiplication")
    public double multiplication(@RequestParam double number1, @RequestParam double number2) {
        LOGGER.info("Received request for multiplication with numbers: {} and {}", number1, number2);
        double result = logService.multiplication(number1, number2);
        LOGGER.info("Sending response: {}", result);
        return result;
    }

    @GetMapping("/division")
    public double division(@RequestParam double number1, @RequestParam double number2) {
        LOGGER.info("Received request for division with numbers: {} and {}", number1, number2);
        double result = logService.division(number1, number2);
        LOGGER.info("Sending response: {}", result);
        return result;
    }
    
    @GetMapping("/square/{number}")
    public double square(@PathVariable double number) {
        LOGGER.info("Received request for square of number: {}", number);
        double result = logService.square(number); // Invoking the service method
        LOGGER.info("Sending response: {}", result);

        return result;
    }

    @GetMapping("/squareroot/{number}")
    public double squareRoot(@PathVariable double number) {
        LOGGER.info("Received request for square root of number: {}", number);
        double result = logService.squareRoot(number);
        LOGGER.info("Sending response: {}", result);
        return result;
    }

    @GetMapping("/factorial/{number}")
    public long factorial(@PathVariable int number) {
        LOGGER.info("Received request for factorial of number: {}", number);
        long result = logService.factorial(number);
        LOGGER.info("Sending response: {}", result);
        return result;
    }
    
    @PostMapping("/min-max")
    public List<Double> minMax(@RequestBody CalculatorMinMaxRequest request) {
        LOGGER.info("Received request for min-max calculation with numbers: {}", request.getNumbers());
        List<Double> result = logService.minMax(request);
        LOGGER.info("Sending response: {}", result);
        return result;
    }

}

