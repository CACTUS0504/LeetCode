package task238;

public class Solution {
    public static int[] productExceptSelf(int[] nums) {
        int[] pre = new int[nums.length];
        int[] suf = new int[nums.length];
        int[] res = new int[nums.length];
        pre[0] = 1;
        suf[nums.length - 1] = 1;

        // Создаём массив префиксов для каждого числа
        for (int i = 1; i < nums.length; i++) {
            pre[i] = pre[i - 1] * nums[i - 1];
        }

        // Создаём массив суффиксов для каждого числа
        for (int j = nums.length - 2; j >= 0; j--) {
            suf[j] = suf[j + 1] * nums[j + 1];
        }

        // Получаем финальный массив
        for (int i = 0; i < nums.length; i++) {
            res[i] = pre[i] * suf[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        arr = productExceptSelf(arr);
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
