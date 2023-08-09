package task70;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int helper(int curr, Map<Integer, Integer> checked) {
        if (curr == 0 || curr == 1) {
            return 1;
        }
        if (!checked.containsKey(curr)) {
            checked.put(curr, helper(curr - 1, checked) + helper(curr - 2, checked));
        }
        return checked.get(curr);
    }

    public static int climbStairs(int n) {
        Map<Integer, Integer> checked = new HashMap<>();
        return helper(n, checked);
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }
}
