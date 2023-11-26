package com.algorithms;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

// 23- Stock buy and sell II 

public class StockBuySellIITest {
	 @Test
	    public void testMaxProfit() {
		 int[] stockPrices = {100, 180, 260, 310, 40, 535, 695};
	        StockBuySell.findBuySellDays(stockPrices); // Perform action in the main method

	        	        List<Integer> expectedResult = Arrays.asList(0, 3, 4, 6);

	        assertThat( is(equalTo(expectedResult)));
	    }

	}