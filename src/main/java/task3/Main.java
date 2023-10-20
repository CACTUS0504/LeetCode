package task3;

import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        String res;

        int l = 0;
        int r = 0;

        if (s.length() == 0) return 0;

        set.add(s.charAt(l));
        res = s.substring(l, r + 1);
        while (r < s.length() - 1) {
            r++;
            if (!set.contains(s.charAt(r))) {
                set.add(s.charAt(r));
                if (s.substring(l, r + 1).length() > res.length()) res = s.substring(l, r + 1);
            } else {
                while (set.contains(s.charAt(r))) {
                    set.remove(s.charAt(l));
                    l++;
                }
                set.add(s.charAt(r));
            }
        }
        return res.length();
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.lengthOfLongestSubstring("abca"));
    }
}