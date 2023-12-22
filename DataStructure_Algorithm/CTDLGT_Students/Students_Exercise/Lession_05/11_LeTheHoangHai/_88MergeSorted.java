import java.util.Arrays;

public class _88MergeSorted {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int stop = -1;

        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[i - m];

            for (int j = i; j > stop; j--) {
                if (nums1[j] < nums1[j - 1]) {
                    int a = nums1[j];
                    nums1[j] = nums1[j - 1];
                    nums1[j - 1] = a;
                } else {
                    stop = j;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] num1 = { 0, 2, 6, 8, 0, 0, 0, 0 };
        int[] num2 = { 1, 4, 5, 7 };
        merge(num1, 4, num2, 4);
        System.out.println(Arrays.toString(num1));

    }
}
