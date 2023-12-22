import java.util.ArrayList;
import java.util.List;

public class _442_findAllDuplicate {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> find = new ArrayList<>();
        int[] arr = new int[nums.length];
        
        for (int i =0; i< nums.length; i++) {
            int index = nums[i]-1; //use value of nums[i as an idex So just the complex = O(n)
            if(arr[index] == 0) {
                arr[index] = nums[i];
            } else {
                arr[index] *= -1;
            }         
        }

        for (int i =0; i< nums.length; i++) {
            if(arr[i] < 0) {
                find.add(arr[i]*-1);
            }     
        }

        return find;
        
    }
}
