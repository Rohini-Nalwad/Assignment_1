package com.algorithms;
// 23- Stock buy and sell II 

public class StockBuySellII {

    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;

        for (int i = 1; i < n; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] stockPrices = {7, 1, 5, 3, 6, 4};
        int result = maxProfit(stockPrices);
        System.out.println("Maximum profit: " + result);
    }
}
