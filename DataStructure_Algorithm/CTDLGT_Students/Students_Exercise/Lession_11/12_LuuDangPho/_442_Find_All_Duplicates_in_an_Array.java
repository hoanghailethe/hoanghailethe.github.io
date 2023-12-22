import java.util.HashMap;
import java.util.Map;

public class _287_FindTheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        Map<Integer, Integer> duplicateMap = new HashMap<>();
        for (int n : nums) {
            if (duplicateMap.containsKey(n)) {
                duplicateMap.put(n, 1);
            } else {
                duplicateMap.put(n, 0);
            }
        }

        for (Map.Entry entry : duplicateMap.entrySet()) {
            if ((int)entry.getValue() == 1) {
                return (int)entry.getKey();
            }
        }
        return -1;
    }
}
