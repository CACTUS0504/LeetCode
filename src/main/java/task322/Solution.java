package task322;

import java.util.*;

public class Solution {
    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        dp[0] = 0;

        for (int i = 1; i < dp.length; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int coin : coins) {
                if (coin <= i && dp[i - coin] == -1) continue;
                if (coin <= i && dp[i - coin] + 1 < dp[i]){
                    dp[i] = dp[i - coin] + 1;
                }
            }
            if (dp[i] == Integer.MAX_VALUE) dp[i] = -1;
        }
        return dp[dp.length - 1];
    }

    public static void main(String[] args) {
        int[] coins1 = {1,2,5};
        int[] coins2 = {2};
        System.out.println(coinChange(coins1, 11));
        System.out.println(coinChange(coins2, 3));
    }
}
