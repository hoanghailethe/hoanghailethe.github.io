package anhdv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author anhdv
 */
class _414_ThirdMaximumNumber {

    static List<Integer> buildDistinctArray(int[] arrInput) {
        List<Integer> lst = new ArrayList<>();
        for( int i = 0; i < arrInput.length; i++ ) {
            if( !lst.contains(arrInput[i]) )
                lst.add(arrInput[i]);
        }
        return lst;
    }
    
    static int thirdMax(int[] nums) {
        List<Integer> lst = buildDistinctArray(nums);
        if( lst.size() <= 2 )
            return lst.size() == 1 ? lst.get(0) : lst.size() == 2 ? Math.max(lst.get(0), lst.get(1)) : -1;
        
        nums = new int[lst.size()];
        for( int i = 0; i < lst.size(); i++ ) {
            nums[i] = lst.get(i);
        }
        
        for( int i = 1; i < nums.length; i++ ) {
            int key = nums[i];
            int j = i - 1;
            while( j >= 0 && key > nums[j] ) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
        System.out.println("Arr sorted: " + Arrays.toString(nums));
        
        return nums[2];
    }
    
    public static void main(String[] args) {
        //int[] arr = {2, 2, 3 ,4, 5, 8};
        int[] arr = {5, 2, 2, -2, 10};
        System.out.println("third max num: " + thirdMax(arr));
    }

    
}
