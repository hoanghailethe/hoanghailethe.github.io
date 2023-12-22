package anhdv.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author anhdv
 */
public class _349_IntersectionOfTwoArrays {
    
    static int[] intersection(int[] nums1, int[] nums2) {
        
        Set<Integer> set = new HashSet<>();
        for( int i = 0; i < nums1.length; i++ ) {
            for( int j = 0; j < nums2.length; j++ ) {
                if( nums1[i] == nums2[j] )
                    set.add(nums1[i]);
            }
        }
        
        int[] res = new int[set.size()];
        int i = 0;
        for( Integer val : set ) {
            res[i] = val;
            i++;
        }
       
        return res;
    }
    
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = { 2, 2 };
        System.out.println("result: " + Arrays.toString(intersection(nums1, nums2)));
    }
}
