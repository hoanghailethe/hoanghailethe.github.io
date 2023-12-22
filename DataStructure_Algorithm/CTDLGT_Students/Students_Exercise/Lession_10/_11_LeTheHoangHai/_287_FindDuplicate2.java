import java.util.HashSet;
import java.util.Set;

public class _287_FindDuplicate2 {
    public int findDuplicate(int[] nums) {
        Set<Integer> numss = new HashSet<>();
        for(int num : nums) {
            if(numss.contains(num)) {
                return num;
            } else {
                numss.add(num);
            }
        }
        return 0; 
   }
}
