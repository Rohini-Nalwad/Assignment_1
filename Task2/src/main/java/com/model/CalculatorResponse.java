package com.model;

public class CalculatorResponse {
    private double result;
    private String detail;

    public CalculatorResponse(double result, String detail) {
        this.result = result;
        this.detail = detail;
    }

    public double getResult() {
        return result;
    }

    public String getDetail() {
        return detail;
    }

}
