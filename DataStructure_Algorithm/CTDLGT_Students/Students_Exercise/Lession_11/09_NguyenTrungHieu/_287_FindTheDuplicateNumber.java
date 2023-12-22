import java.util.HashSet;
import java.util.Set;

public class _287_FindTheDuplicateNumber {
    public static int findDuplicate(int[] nums) {
        Set<Integer> mySet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(mySet.contains(nums[i]) == false){
                mySet.add(nums[i]);
            } else {
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }
}
