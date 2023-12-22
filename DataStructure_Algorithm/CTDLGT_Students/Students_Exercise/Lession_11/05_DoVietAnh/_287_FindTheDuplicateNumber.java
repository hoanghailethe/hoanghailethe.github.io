package anhdv.set;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author anhdv
 */
public class _287_FindTheDuplicateNumber {
    
    static int findDuplicate(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();
        for( int i = 0; i < nums.length; i++ ) {
            int c = nums[i];
            if( !map.containsKey(c) ) {
                map.put(c, 1);
            }else {
                map.put(c, map.get(c) + 1);
            }
        }
       
        for(Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey()+"-"+entry.getValue());
            if( (int) entry.getValue() >= 2 )
                return (int) entry.getKey();
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        int[] nums = { 2,2,2,2,2 };
        System.out.println("result: " + findDuplicate(nums));
    }
}
