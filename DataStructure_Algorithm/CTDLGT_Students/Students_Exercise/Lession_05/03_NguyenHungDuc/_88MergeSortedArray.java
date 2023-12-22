import java.util.Arrays;

class _88MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {


        for (int i = 0; i < nums2.length; i++) {
            nums1[i + m] = nums2[i];
        }

        Arrays.sort(nums1);

    }
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6 };

        merge(nums1, 3, nums2, 3);
        
    }
}