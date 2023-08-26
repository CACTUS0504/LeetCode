package task118;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> rows = new ArrayList<List<Integer>>(numRows);
        int prev_l = 0;
        int prev_r = 0;
        for (int i = 0; i < numRows; i++) {
            rows.add(new ArrayList<>());
            if (i == 0) {
                rows.get(0).add(1);
                continue;
            }
            for (int j = 0; j <= i; j++) {
                if (j == 0) prev_l = 0;
                else prev_l = rows.get(i - 1).get(j - 1);
                if (j == i) prev_r = 0;
                else prev_r = rows.get(i - 1).get(j);
                rows.get(i).add(prev_l + prev_r);
            }
        }
        return rows;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
    }
}
