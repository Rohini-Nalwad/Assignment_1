package com.model;

public class CalculatorMinMaxResponse {
    private double min;
    private double max;

    public CalculatorMinMaxResponse(double min, double max) {
        this.min = min;
        this.max = max;
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }
}