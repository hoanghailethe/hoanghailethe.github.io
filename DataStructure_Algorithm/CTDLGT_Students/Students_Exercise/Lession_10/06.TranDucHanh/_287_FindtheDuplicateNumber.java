import java.util.HashSet;
import java.util.Set;

public class _287_FindtheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        Set<Integer> mySet = new HashSet<>();
        for (int i : nums) {
            if (mySet.contains(i)) {
                return i;
            } else {
                mySet.add(i);
            }
        }
        return -1;
    }
}
