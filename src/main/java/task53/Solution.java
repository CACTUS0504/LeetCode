package task53;

public class Solution {
    public static int maxSubArray(int[] nums) {
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (curr_sum < 0) {
                curr_sum = 0;
            }

            curr_sum += nums[i];

            if (curr_sum > max_sum) {
                max_sum = curr_sum;
            }
        }
        return max_sum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(arr));
    }
}
