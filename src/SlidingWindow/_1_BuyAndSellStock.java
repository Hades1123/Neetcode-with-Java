package SlidingWindow;

public class _1_BuyAndSellStock {
}

// Using my brain: Time O(N) ; Space O(N)
class Solution1{
    public int maxProfit(int[] prices) {
        int[] maxValue = new int[prices.length];
        int maxNum = Integer.MIN_VALUE;
        int result = Integer.MIN_VALUE;

        for (int i = maxValue.length - 1; i >= 0; i--) {
            maxValue[i] = Math.max(maxNum, prices[i]);
            maxNum = maxValue[i];
        }

        for (int i = 0 ; i < maxValue.length ; i++) {
            result = Math.max(result, maxValue[i] - prices[i]);
        }

        return result;
    }
}

// Dynamic programing: Time O(N) ; Space O(1)
class Solution1_1{
    public int maxProfit(int[] prices) {
        int result = 0;
        int minBuy = prices[0];
        for (int price : prices) {
            result = Math.max(result, price - minBuy);
            minBuy = Math.min(minBuy, price);
        }
        return result;
    }
}