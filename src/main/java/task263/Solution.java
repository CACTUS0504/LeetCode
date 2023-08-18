package task263;

import java.util.ArrayList;

public class Solution {
    public static boolean isUgly(int n) {
        if(n <= 0) return false;
        for(int i = 2; i < 6; i++){
            while(n % i == 0){
                n /= i;
            }
        }
        return n == 1;
    }

    public static void main(String[] args) {
        System.out.println(isUgly(-2147483648));
        System.out.println(isUgly(6));
        System.out.println(isUgly(1));
        System.out.println(isUgly(14));
    }
}
