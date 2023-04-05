package com.isvaso;

/**
 * You are given an integer array prices where prices[i] is the price
 * of a given stock on the ith day.
 * <br><br>
 * On each day, you may decide to buy and/or sell the stock.
 * <br><br>
 * You can only hold at most one share of the stock at any time.
 * However, you can buy it then immediately sell it on the same day.
 * <br><br>
 * Find and return the maximum profit you can achieve.
 */
public class BestTimeToBuyAndSellStockII {

    public int maxProfit(int[] prices) {
        int i = 0;
        int sum = 0;

        if (prices.length == 0) return 0;

        for (int j = 1; j < prices.length; j++) {
            if (prices[j] > prices[i]) {
                sum = sum + prices[j] - prices[i];
            }
            i = j;
        }

        return sum;
    }
}
