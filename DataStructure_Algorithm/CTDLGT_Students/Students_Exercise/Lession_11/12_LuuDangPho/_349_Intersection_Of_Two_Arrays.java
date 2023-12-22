import java.util.HashSet;

public class _349_Intersection_Of_Two_Arrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();
        for (int num : nums1) {
            s1.add(num);
        }
        for (int num : nums2) {
            s2.add(num);
        }

        s1.retainAll(s2);

        int[] result = new int[s1.size()];
        int i = 0;
        for (Integer num : s1) {
            result[i++] = num;
        }

        return result;
    }
}
