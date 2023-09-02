package task139;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static boolean wordBreak(String s, List<String> wordDict) {
        int db[] = new int[s.length() + 1];
        db[0] = 1;

        for (int i = 1; i < db.length; i++) {
            for (String word : wordDict) {
                if (i >= word.length()) {
                    boolean match = true;
                    for (int j = i - word.length(), cnt = 0; j < i; j++, cnt++) {
                        if (word.charAt(cnt) != s.charAt(j)){
                            match = false;
                            break;
                        }
                    }
                    if (match && db[i - word.length()] == 1) {
                        db[i] = 1;
                        break;
                    }
                }
                db[i] = 0;
            }
        }
        if (db[db.length - 1] == 1) return true;
        return false;
    }

    public static void main(String[] args) {
        List<String> wordDict1 = new ArrayList<String>();
        wordDict1.add("leet");
        wordDict1.add("code");
        List<String> wordDict2 = new ArrayList<String>();
        wordDict2.add("apple");
        wordDict2.add("pen");
        List<String> wordDict3 = new ArrayList<String>();
        wordDict3.add("cats");
        wordDict3.add("dog");
        wordDict3.add("sand");
        wordDict3.add("and");
        wordDict3.add("cat");
        System.out.println(wordBreak("leetcode", wordDict1));
        System.out.println(wordBreak("applepenapple", wordDict2));
        System.out.println(wordBreak("catsandog", wordDict3));
    }
}
