import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _442_FindAllDuplicate {
    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> result = new ArrayList<>();
        Set<Integer> numbers = new HashSet<>();
        for (int i = 0; i< nums.length; i++) {
            if (numbers.contains(nums[i])) {
                result.add(nums[i]);
            } else {
                numbers.add(nums[i]);
            }
        }
        return result;
    }
}
