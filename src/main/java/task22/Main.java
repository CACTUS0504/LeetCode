package task22;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Solution {
    static void allCombinations(List<String> arr, StringBuilder s, int n) {
        if (s.length() > n * 2) return;
        if (s.length() == n * 2) {
            if (check(s.toString())) arr.add(s.toString());
            return;
        }
        if (s.length() < n * 2) {
            allCombinations(arr, new StringBuilder(s + "("), n);
            allCombinations(arr, new StringBuilder(s + ")"), n);
        }
    }

    public static Boolean check(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '('){
               stack.add(s.charAt(i));
            } else {
                if (stack.isEmpty()) return false;
                else {
                    stack.remove();
                }
            }
        }
        return stack.isEmpty();
    }

    public static List<String> generateParenthesis(int n) {
        List<String> combs = new LinkedList<>();
        StringBuilder s = new StringBuilder();
        allCombinations(combs, s, n);
        return combs;
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
}
