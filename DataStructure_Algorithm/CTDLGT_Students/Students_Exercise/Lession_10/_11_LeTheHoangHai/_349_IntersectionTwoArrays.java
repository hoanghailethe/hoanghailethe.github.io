import java.util.HashSet;
import java.util.Set;

import org.graalvm.compiler.core.common.util.IntList;

public class _349_IntersectionTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> num_1 = new HashSet<>();
        Set<Integer> intersects = new HashSet<>();
        
        for (int num : nums1) {
            num_1.add(num);
        }

        for(int num : nums2) {
            if(num_1.contains(num)) {
                intersects.add(num);
            }
        }

        int n = intersects.size();
        int [] result = new int[n];

        int i = 0;
        for(int num : intersects) {
            result[i++] = num;
        }

        return result;
       
    }
}
