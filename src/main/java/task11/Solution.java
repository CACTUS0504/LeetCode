package task11;

public class Solution {
    public static int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int res = 0;

        while (l < r) {
            if (Math.min(height[l], height[r]) * (r - l) > res) res = Math.min(height[l], height[r]) * (r - l);
            if (height[l] < height[r]) l++;
            else r--;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,8,6,2,5,4,8,3,7};
        int[] arr2 = {1,1};
        System.out.println(maxArea(arr1));
        System.out.println(maxArea(arr2));
    }
}
