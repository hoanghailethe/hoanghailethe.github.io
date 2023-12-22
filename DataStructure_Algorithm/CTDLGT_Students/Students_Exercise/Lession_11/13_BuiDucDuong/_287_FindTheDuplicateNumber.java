import java.util.HashSet;
import java.util.Set;

public class _287_FindTheDuplicateNumber {
    public static void main(String[] args) {

    }

    /**
     * 20 ms
     * 
     * 51.8 MB
     * 
     * 11.10%
     */
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (set.contains(n)) {
                return n;
            }
            set.add(n);
        }
        return -1;
    }
}
