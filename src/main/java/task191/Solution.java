package task191;

public class Solution {
    public static int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
            if ((n & 1) == 1) res++;
            n = n >>> 1;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(0b0000000000000000000000000000001011));
        System.out.println(hammingWeight(0b000000000000000000000000000010000000));
        System.out.println(hammingWeight(0b11111111111111111111111111111101));
    }
}
