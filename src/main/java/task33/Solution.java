package task33;

public class Solution {
    public static int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int mid = 0;

        while (l <= r) {
            mid = (int) Math.ceil((double)(l + r) / 2);
            if (nums[mid] == target) return nums[mid];
            if (nums[mid] >= nums[0]) l = mid + 1;
            else r = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
