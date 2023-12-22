import java.util.HashSet;
import java.util.Set;

public class _349_IntersectionofTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int s1 : nums1) {
            set1.add(s1);
        }
        for(int s2 : nums2){
            set2.add(s2);
        }
        set1.retainAll(set2);
        int[] intersection = new int[set1.size()];
        int i =0;
        for(int num : set1){
            intersection[i] = num;
            i++;
        }
        return intersection;
    }

}
