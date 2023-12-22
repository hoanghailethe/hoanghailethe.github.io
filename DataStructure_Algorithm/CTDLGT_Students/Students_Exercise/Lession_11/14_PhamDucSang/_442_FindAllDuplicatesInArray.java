package aps.leetcodes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _442_FindAllDuplicatesInArray {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> duplicateMap = new HashMap<>();

        for (int n : nums) {
            if (duplicateMap.containsKey(n)) {
                duplicateMap.put(n, duplicateMap.get(n) + 1);
            } else {
                duplicateMap.put(n, 1);
            }
        }

        for (Map.Entry entry : duplicateMap.entrySet()) {
            if ((int) entry.getValue() > 1) {
                result.add((int) entry.getKey());
            }
        }
        return result;
    }
}
