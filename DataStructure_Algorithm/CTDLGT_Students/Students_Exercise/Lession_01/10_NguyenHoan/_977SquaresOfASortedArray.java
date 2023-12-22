import java.util.Arrays;

public class _977SquaresOfASortedArray {
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int i = -1;
        while ((i + 1) < n && nums[i + 1] < 0) {
            i++;
        }
        int j = n;
        while ((j - 1) >= 0 && nums[j - 1] >= 0) {
            j--;
        }
        int[] A = new int[n];
        int index = 0;
        while (i >= 0 || j < n) {
            if (i >= 0 && j < n) {
                if (nums[i] * nums[i] > nums[j] * nums[j]) {
                    A[index] = nums[j] * nums[j];
                    j++;
                    index++;
                } else {
                    A[index] = nums[i] * nums[i];
                    i--;
                    index++;
                }
            }

            else if (i >= 0) {
                A[index] = nums[i] * nums[i];
                i--;
                index++;

            } else {
                A[index] = nums[j] * nums[j];
                j++;
                index++;
            }
        }
        
        return A;
    }

    public static void main(String[] args) {
        int[] a = { -4, -1, 0, 3, 10 };
        // System.out.print("Array: ");
        // for (int i = 0; i < a.length; i++) {
        //     System.out.print(a[i] + "\t");
        // }
        sortedSquares(a);
        System.out.println(Arrays.toString(sortedSquares(a)));
    }
}