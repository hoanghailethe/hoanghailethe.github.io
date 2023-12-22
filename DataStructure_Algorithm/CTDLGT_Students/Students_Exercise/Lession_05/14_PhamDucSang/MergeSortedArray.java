public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int newIndex = m + n - 1;
        int index_m = m - 1;
        int index_n = n - 1;
        
        while (newIndex >= 0 && index_m >= 0 && index_n >= 0) {
            if (nums1[index_m] <= nums2[index_n]) {
                nums1[newIndex] = nums2[index_n];
                index_n--;
            } else {
                nums1[newIndex] = nums1[index_m];
                index_m--;
            }
            newIndex--;
        }

        while (index_n >= 0) {
            nums1[newIndex] = nums2[index_n];
            newIndex--;
            index_n--;
        }
    }
}
