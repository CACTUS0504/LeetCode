package task377;

public class Solution {
    public static int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;

        for (int i = 1; i < target + 1; i++) {
            for (int num: nums) {
                if (num <= i) {
                    dp[i] += dp[i - num];
                }
            }
        }
        return dp[dp.length - 1];
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(combinationSum4(nums, 4));
    }

}

// 0 1 2 3 4
// 1 1 2 4 7