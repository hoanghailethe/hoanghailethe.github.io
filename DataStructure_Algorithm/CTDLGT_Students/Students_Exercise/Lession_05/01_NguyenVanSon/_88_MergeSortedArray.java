import java.util.Arrays;

public class _88_MergeSortedArray {

  public static void main(String[] args) {
    int[] nums1 = { 1, 2, 3, 0, 0, 0 };
    int[] nums2 = { 2, 5, 6 };
    int m = 3, n = 3;
    merge(nums1, m, nums2, n);

  }

  public static void mergee(int[] nums1, int m,int [] nums,int n) {
    for (int i = 0; i < m; i++) {
      if (nums1[i] != 0) {
        nums[i] = nums1[i];
      } else {
        continue;
      }
    }
  }

  public static int [] merge(int[] nums1, int m, int[] nums2, int n) {
    int[] num = new int[m];
    mergee(nums1, m, num, n);
    int i = 0;
    int j = 0;
    int k = 0;
    int[] arr = new int[m + n];
    while (i < m && j < n) {
      if (num[i] <= nums2[j]) {
        arr[k] = num[i];
        i++;
      } else {
        arr[k] = nums2[j];
        j++;
      }
      k++;
    }
    System.out.println(Arrays.toString(num));
    while (i < m) {
      arr[k] = num[i];
      i++;
      k++;
    }
    System.out.println(Arrays.toString(num));
    while (j < n) {
      arr[k] = nums2[j];
      j++;
      k++;
    }
    System.out.println(Arrays.toString(arr));
    return arr;
  }

}
