package anhdv;


import java.util.Arrays;


/**
 *
 * @author Admin
 */
public class _88_MergeSortedArray {
    
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int k = 0;
        for( int i = m; i < m + n; i++ ) {
            nums1[i] = nums2[k++];
        }
        
        //Arrays.sort(nums1);
        for( int i = 0; i < nums1.length - 1; i++ ) {
            for( int j = 0; j < nums1.length - i - 1; j++ ) {
                if( nums1[j] > nums1[j+1] ) {
                    int tmp = nums1[j];
                    nums1[j] = nums1[j+1];
                    nums1[j+1] = tmp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        
//        int[] nums1 = {1};
//        int m = 1;
//        int[] nums2 = {};
//        int n = 0;
        
        merge(nums1, m, nums2, n);
        System.out.println("result: " + Arrays.toString(nums1));
    }
}
