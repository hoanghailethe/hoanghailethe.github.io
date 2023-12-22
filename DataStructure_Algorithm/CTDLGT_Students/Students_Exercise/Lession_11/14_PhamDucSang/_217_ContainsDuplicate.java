package aps.leetcodes;

import java.util.HashSet;
import java.util.Set;

public class _217_ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        if (numSet.size() < nums.length) {
            return true;
        }
        return false;
    }
}
