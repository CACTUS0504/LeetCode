package task153;

public class Solution {
    public static int findMin(int[] nums) {
        // Если 0 ротаций, или кол-во ротаций равно длине массива, возвращаем первый элемент
        if (nums[0] < nums[nums.length - 1] || nums.length == 1) return nums[0];

        int l = 0;
        int r = nums.length - 1;
        int mid = 0;

        while (l <= r) {
            mid = (int) Math.ceil((double)(l + r) / 2);
            if (nums[mid] < nums[mid - 1]) return nums[mid];
            if (nums[mid] >= nums[0]) l = mid + 1;
            else r = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {3,4,1,2};
        int[] arr2 = {4,5,6,7,0,1,2};
        int[] arr3 = {11, 13, 15, 17};
        int[] arr4 = {2, 1};
        System.out.println(findMin(arr1));
        System.out.println(findMin(arr2));
        System.out.println(findMin(arr3));
        System.out.println(findMin(arr4));
    }
}
