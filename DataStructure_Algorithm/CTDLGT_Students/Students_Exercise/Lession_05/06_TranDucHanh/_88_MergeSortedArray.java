
class _88_MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] c = new int[m + n];
        int k = 0;
        int l = 0;
        int j = 0;
        while (k < m + n) {
            if (l < m && j < n) {
                if (nums1[l] <= nums2[j]) {
                    c[k] = nums1[l];
                    k++;
                    l++;
                } else {
                    c[k] = nums2[j];
                    k++;
                    j++;
                }
            } else if (l < m) {
                c[k] = nums1[l];
                k++;
                l++;
            } else if (j < n) {
                c[k] = nums2[j];
                k++;
                j++;
            }
        }
        for (int i = 0; i < m + n; i++) {
            nums1[i] = c[j];
        }

    }
}