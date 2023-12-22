package aps.leetcodes;

import java.util.HashMap;
import java.util.Map;

public class _137_SingleNumberII {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> repeatMap = new HashMap<>();
        for (int n : nums) {
            if (repeatMap.containsKey(n)) {
                repeatMap.put(n, 1);
            } else {
                repeatMap.put(n, 0);
            }
        }

        for (Map.Entry entry : repeatMap.entrySet()) {
            if ((int) entry.getValue() == 0) {
                return (int) entry.getKey();
            }
        }
        return -1;
    }
}
