package task190;

import java.util.Arrays;

public class Solution {
    public static int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++){
            res <<= 1;
            res += n & 1;
            n = n >>> 1;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(reverseBits(0b11111111111111111111111111111101)));
        System.out.println(reverseBits(0b11111111111111111111111111111101));
    }
}
