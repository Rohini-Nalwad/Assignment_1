//package com.model;
//
//import org.junit.jupiter.api.Test;
//import static org.assertj.core.api.Assertions.assertThat;
//
//public class CalculatorMinMaxResponseTest {
//
//    @Test
//    void testGetMin() {
//        double min = -5.0;
//        double max = 10.0;
//        CalculatorMinMaxResponse response = new CalculatorMinMaxResponse(min, max);
//        assertThat(response.getMin()).isEqualTo(min);
//    }
//
//    @Test
//    void testGetMax() {
//        double min = -5.0;
//        double max = 10.0;
//        CalculatorMinMaxResponse response = new CalculatorMinMaxResponse(min, max);
//        assertThat(response.getMax()).isEqualTo(max);
//    }
//
//    @Test
//    void testMinAndMaxInitialization() {
//        double min = 0.0;
//        double max = 0.0;
//        CalculatorMinMaxResponse response = new CalculatorMinMaxResponse(min, max);
//        assertThat(response.getMin()).isEqualTo(min);
//        assertThat(response.getMax()).isEqualTo(max);
//    }
//}
