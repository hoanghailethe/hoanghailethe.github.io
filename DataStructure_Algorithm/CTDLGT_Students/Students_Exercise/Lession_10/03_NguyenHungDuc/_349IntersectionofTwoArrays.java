import java.util.*;


class _349IntersectionofTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer>mySet = new HashSet<>();
        Set<Integer>intersect = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            mySet.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (mySet.contains(nums2[i])) {
                intersect.add(nums2[i]);
            }
        }

        int[] result = new int[intersect.size()];
        int i = 0;

        for (int num : intersect) {
            result[i] = num;
            i++;
        }
        for (int j : result) {
            System.out.println(j);
        }
        return result;

    }
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = { 9, 4, 9, 8, 4 };

        intersection(nums1, nums2);

    }
}