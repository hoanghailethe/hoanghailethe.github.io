import java.util.HashSet;
import java.util.Set;

class _217ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer>set = new HashSet<>();

        for (int i : nums) {
            if (set.contains(i) == false) {
                set.add(i);
            } else {
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        
    }
}