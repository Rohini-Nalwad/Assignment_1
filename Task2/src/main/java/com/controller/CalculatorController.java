package com.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.model.CalculatorMinMaxRequest;
import com.model.CalculatorMinMaxResponse;
import com.model.CalculatorResponse;

@RestController
@RequestMapping("/calculatorapi/v1")
public class CalculatorController {

    // Addition
    @GetMapping("/addition")
    public CalculatorResponse addition(@RequestParam double number1, @RequestParam double number2) {
        double result = number1 + number2;
        return new CalculatorResponse(result, number1 + " + " + number2 + " = " + result);
    }

    // Subtraction
    @GetMapping("/subtraction")
    public CalculatorResponse subtraction(@RequestParam double number1, @RequestParam double number2) {
        double result = number1 - number2;
        return new CalculatorResponse(result, number1 + " - " + number2 + " = " + result);
    }

    // Multiplication
    @GetMapping("/multiplication")
    public CalculatorResponse multiplication(@RequestParam double number1, @RequestParam double number2) {
        double result = number1 * number2;
        return new CalculatorResponse(result, number1 + " * " + number2 + " = " + result);
    }

    // Division
    @GetMapping("/division")
    public CalculatorResponse division(@RequestParam double number1, @RequestParam double number2) {
        if (number2 == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        double result = number1 / number2;
        return new CalculatorResponse(result, number1 + " / " + number2 + " = " + result);
    }

    // Square
    @GetMapping("/square/{number}")
    public CalculatorResponse square(@PathVariable double number) {
        double result = number * number;
        return new CalculatorResponse(result, "square of " + number + " = " + result);
    }

    // Square Root
    @GetMapping("/squareroot/{number}")
    public CalculatorResponse squareRoot(@PathVariable double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Square root is not defined for negative numbers.");
        }
        double result = Math.sqrt(number);
        return new CalculatorResponse(result, "square root of " + number + " = " + result);
    }

    // Factorial
    @GetMapping("/factorial/{number}")
    public CalculatorResponse factorial(@PathVariable int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        long result = calculateFactorial(number);
        return new CalculatorResponse(result, number + "! = " + result);
    }

    private long calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }
    
    // Min-Max (POST)
    @PostMapping("/min-max")
    public CalculatorMinMaxResponse minMax(@RequestBody CalculatorMinMaxRequest request) {
        List<Double> numbers = request.getNumbers();
        if (numbers.isEmpty()) {
            throw new IllegalArgumentException("Please provide a list of numbers in the request body.");
        }

        double min = Collections.min(numbers);
        double max = Collections.max(numbers);

        return new CalculatorMinMaxResponse(min, max);
    }
}
