package task169;

import java.util.HashMap;

public class Main {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> counts = new HashMap<>();
        int old;
        for (int num : nums) {
            if (counts.get(num) == null) {
                counts.put(num, 1);
            } else {
                old = counts.get(num);
                counts.put(num, ++old);
            }
        }
        int maxKey = 0;
        int maxVal = 0;
        for (int i : counts.keySet()) {
            if (counts.get(i) > maxVal){ maxKey = i; maxVal = counts.get(i);};
        }
        return maxKey;
    }

    public static void main(String[] args) {
        int [] nums = {47,47,72,47,72,47,79,47,12,92,13,47,47,83,33,15,18,47,47,47,47,64,47,65,47,47,47,47,70,47,47,55,47,15,60,47,47,47,47,47,46,30,58,59,47,47,47,47,47,90,64,37,20,47,100,84,47,47,47,47,47,89,47,36,47,60,47,18,47,34,47,47,47,47,47,22,47,54,30,11,47,47,86,47,55,40,49,34,19,67,16,47,36,47,41,19,80,47,47,27};
        System.out.println(majorityElement(nums));
    }
}
