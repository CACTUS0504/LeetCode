package task242;

import java.util.HashMap;

class Solution {
    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            if (map.get(t.charAt(i)) == null) map.put(t.charAt(i), -1);
            else if (map.get(t.charAt(i)) == 1) map.remove(t.charAt(i));
            else map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
        }

        if (map.isEmpty()) return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));
    }
}