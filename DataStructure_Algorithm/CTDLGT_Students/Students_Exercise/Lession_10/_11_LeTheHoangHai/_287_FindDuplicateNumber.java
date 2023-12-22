import java.util.HashMap;
import java.util.Map;

public class _287_FindDuplicateNumber {
    public int findDuplicate(int[] nums) {
        Map<Integer, Integer> time = new HashMap<>();
        
        for (int i = 0 ; i< nums.length; i++) {
            if(time.containsKey(nums[i])) {
                return nums[i];
                
            } else {
                time.put(nums[i], 1);
            }
        }
        return -1;
    }
}
