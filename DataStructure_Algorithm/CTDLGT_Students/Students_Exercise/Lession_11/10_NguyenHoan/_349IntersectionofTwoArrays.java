import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _349IntersectionofTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        // Set<Integer> set = new HashSet<>();
        // for (int i = 0; i < nums1.length; i++) {
        // for (int j = 0; j < nums2.length; j++) {
        // if (nums2[j] == nums1[i]) {
        // set.add(nums2[j]);
        // }
        // }
        // }
        // int[] result = new int[set.size()];
        // int i = 0;
        // for (Integer x : set) {
        // result[i++] = x;
        // }
        // return result;

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        List<Integer> set3 = new ArrayList<>();

        for (Integer x1 : nums1) {
            set1.add(x1);
        }
        for (Integer x2 : nums2) {
            set2.add(x2);
        }
        for (Integer x1 : set1) {
            if (set2.contains(x1)) {
                set3.add(x1);
            }
        }
        int[] result = new int[set3.size()];
        int i = 0;
        for (Integer x : set3) {
            result[i++] = x;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = { 2, 2 };
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
}
