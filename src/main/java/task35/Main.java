package task35;

class Solution {
    public static int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int mid;
        while (l <= r){
            mid = (l + r) / 2;
            if (target > nums[mid]) {
                l = mid + 1;
            } else{
                r = mid - 1;
            }
        }
        return  l;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 7;
        System.out.println(searchInsert(nums, target));
    }
}