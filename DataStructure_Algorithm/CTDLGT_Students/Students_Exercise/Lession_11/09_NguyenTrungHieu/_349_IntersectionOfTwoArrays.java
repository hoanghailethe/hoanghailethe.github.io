import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _349_IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> mySet = new HashSet<>();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            mySet.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (mySet.contains(nums2[i]) && list.contains(nums2[i]) == false) {
                list.add(nums2[i]);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = { 2, 2 };
        int[] result = intersection(nums1, nums2);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
