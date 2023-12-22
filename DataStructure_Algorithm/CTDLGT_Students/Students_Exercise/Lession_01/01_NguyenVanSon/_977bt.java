import java.util.Arrays;

public class _977bt {
    public static void main(String[] args) {
        int[] nums1 = { 12, 345, 2, 6, 7896 };
        sortedSquares(nums1);
    }

    public static int[] sortedSquares(int[] nums) {
       
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) Math.pow(nums[i],2 ) ;
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
       return nums;
    }
}
