package task338;

public class Solution {
    public static int[] countBits(int n) {
        int[] res = new int[n + 1];
        int curr_pow = 0;
        res[0] = 0;
        for (int i = 1; i <= n; i++) {
            if ((i & i-1) == 0) {
                curr_pow = i;
            }
            res[i] = res[i - curr_pow] + 1;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] res = countBits(2);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
