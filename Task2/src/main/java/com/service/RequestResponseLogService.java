package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.model.CalculatorMinMaxRequest;
import com.model.RequestResponseLog;
import com.repositories.CalculationLogRepository;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

@Service
public class RequestResponseLogService {

    @Autowired
    private CalculationLogRepository logRepository;

    @Autowired
    private CacheManager cacheManager;

    public void saveRequestResponseLog(String request, String response) {
        RequestResponseLog log = new RequestResponseLog();
        log.setRequestData(request);
        log.setResponseData(response);
        log.setTimestamp(LocalDateTime.now());
        logRepository.save(log);
    }

     @Cacheable(value = "calculatorCache", key = "'addition:' + #number1 + ':' + #number2", unless = "#result == null")
      public double addition(double number1, double number2) {
        double result = number1 + number2;
        saveRequestResponseLog("Addition: " + number1 + " + " + number2, "Result: " + result);
        return result;
    }

     @Cacheable(value = "calculatorCache", key = "'subtraction:' + #number1 +':' + #number2", unless = "#result == null")
     public double subtraction(double number1, double number2) {
        double result = number1 - number2;
        saveRequestResponseLog("Subtraction: " + number1 + " - " + number2, "Result: " + result);
        return result;
    }

     @Cacheable(value = "calculatorCache", key = "'multiplication:' + #number1 + ':' + #number2", unless = "#result == null")
     public double multiplication(double number1, double number2) {
        double result = number1 * number2;
        saveRequestResponseLog("Multiplication: " + number1 + " * " + number2, "Result: " + result);
        return result;
    }

    @Cacheable(value = "calculatorCache", key = "'division:' + #number1 + ':' + #number2", unless = "#result == null")
    public double division(double number1, double number2) {
        if (number2 == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        double result = number1 / number2;
        saveRequestResponseLog("Division: " + number1 + " / " + number2, "Result: " + result);
        return result;
    }

    @Cacheable(value = "calculatorCache", key = "'square:' + #number", unless = "#result == null")
    public double square(double number) {
        // Check if the result is already in cache
        Cache cache = cacheManager.getCache("calculatorCache");
        Cache.ValueWrapper valueWrapper = cache.get("square:" + number);
        if (valueWrapper != null) {
            return (double) valueWrapper.get();
        }

        double result = number * number;
        saveRequestResponseLog("Square of " + number, "Result: " + result);

        // Store the result in the cache
        cache.put("square:" + number, result);

        return result;
    }
     
    @Cacheable(value = "calculatorCache", key = "'squareRoot:' + #number",unless = "#result == null")
    public double squareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Square root is not defined for negative numbers.");
        }
        double result = Math.sqrt(number);
        saveRequestResponseLog("Square root of " + number, "Result: " + result);
        return result;
    }

    @Cacheable(value = "calculatorCache", key = "'factorial:' + #number1 ", unless = "#result == null")
    public long factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        long result = calculateFactorial(number);
        saveRequestResponseLog("Factorial of " + number, "Result: " + result);
        return result;
    }

    private long calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }

  
    @Cacheable(value = "calculatorCache", key = "'minMax:' + #numbers.hashCode()", unless = "#result == null")
    public List<Double> minMax(CalculatorMinMaxRequest numbers) {
        List<Double> numList = numbers.getNumbers();

        if (numList.isEmpty()) {
            throw new IllegalArgumentException("Please provide a list of numbers.");
        }

        double min = Collections.min(numList);
        double max = Collections.max(numList);

        saveRequestResponseLog("Min-Max calculation", "Min: " + min + ", Max: " + max);
        return List.of(min, max);
    }

}

