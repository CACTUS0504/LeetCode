package task152;

public class Solution {
    public static int maxSubArray(int[] nums) {
        int res = nums[0];
        int pref = 1;
        int suf = 1;

        for (int i = 0; i < nums.length; i++) {
            if (pref == 0) pref = 1;

            pref *= nums[i];
            res = Math.max(res, pref);
        }

        for (int i = nums.length - 1; i > 0; i--) {
            if (suf == 0) suf = 1;

            suf *= nums[i];
            res = Math.max(res, suf);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 3, -2, 4};
        int[] arr2 = {1, -20, -20, -20, 1};
        int[] arr3 = {-2, 0, -1};
        System.out.println(maxSubArray(arr1));
        System.out.println(maxSubArray(arr2));
        System.out.println(maxSubArray(arr3));
    }
}

