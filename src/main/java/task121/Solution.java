package task121;

public class Solution {
    public static int maxProfit(int[] prices) {
        int buy = 0;
        int curr_profit = 0;
        int max_profit = 0;

        for (int i = 1; i < prices.length; i++) {
            curr_profit = prices[i] - prices[buy];

            if (prices[i] < prices[buy]) {
                buy = i;
            }

            if (curr_profit > max_profit) {
                max_profit = curr_profit;
            }
        }
        return max_profit;
    }

    public static void main(String[] args) {
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(prices1));
        System.out.println(maxProfit(prices2));
    }
}
