package task66;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class Main {
    public static int[] plusOne(int[] digits) {
        int res[] = null;
        long sum = 0;
        for (int digit : digits) {
            sum = sum * 10 + digit;
        }
        sum++;
        System.out.println(sum);
        long tmp = sum;
        int cnt = 0;
        while (sum != 0) {
            sum = sum / 10;
            cnt++;
        }
        res = new int[cnt];
        sum = tmp;
        while (cnt > 0) {
            res[cnt - 1] = (int) (sum % 10);
            sum = sum / 10;
            cnt--;
        }
        return res;
    }

    public static void main(String[] args) {
        int nums[] = {9,8,7,6,5,4,3,2,1,0};
    }
}
