package task136;

public class Main {
    public static int singleNumber(int[] nums) {
        int res = 0;
        // Исключающее или делает 0 все одинаковые биты, соответственно, все повторяющиеся числа взаимоуничтожаются, оставляя только биты относящиеся к нужному числу
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }
    public static void main(String[] args) {
        int [] nums = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums));
    }
}