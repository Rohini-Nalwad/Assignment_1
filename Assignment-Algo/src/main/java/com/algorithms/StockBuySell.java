package com.algorithms;
// 22- Stock buy and sell 

public class StockBuySell {

    public static int findBuySellDays(int[] prices) {
        int n = prices.length;

        if (n < 2) {
            System.out.println("Not enough days to perform stock buy and sell.");
            return 0;
        }

        int buyDay = 0; 
        int sellDay = 0; 
        boolean canSell = false;

        for (int i = 1; i < n; i++) {
            if (prices[i] > prices[i - 1]) {
                if (!canSell) {
                    buyDay = i - 1;
                    canSell = true;
                }
               sellDay = i;
            } else {
            	if (canSell) {
                    System.out.println("Buy on day " + buyDay + ", Sell on day " + sellDay);
                    canSell = false;
                }
            }
        }
        if (canSell) {
            System.out.println("Buy on day " + buyDay + ", Sell on day " + sellDay);
        }
		return sellDay;
    }

    public static void main(String[] args) {
        int[] stockPrices = {100, 180, 260, 310, 40, 535, 695};
        findBuySellDays(stockPrices);
    }

	
}
