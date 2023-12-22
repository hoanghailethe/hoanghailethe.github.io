package day05;

public class _88_MergeSortedArray {
    public static void main(String[] args) {

    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = n + m - 1;
        n--;
        m--;
        while (k >= 0) {
            int val1 = m >= 0 ? nums1[m] : Integer.MIN_VALUE;
            int val2 = n >= 0 ? nums2[n] : Integer.MIN_VALUE;
            if (val1 > val2) {
                nums1[k] = val1;
                m--;
            } else {
                nums1[k] = val2;
                n--;
            }
            k--;
        }
    }
}
