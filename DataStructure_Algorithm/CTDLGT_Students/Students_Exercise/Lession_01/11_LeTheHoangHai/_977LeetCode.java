import java.util.Arrays;

public class _977LeetCode {
    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i< nums.length; i++) {
            for(int j = i+1; j<nums.length; j++) {
                if (Math.abs(nums[i]) > Math.abs(nums[j])){
                int a = nums[i];
                nums[i] = nums[j];
                nums[j] = a;
                }
            }           
            nums[i] = nums[i]*nums[i];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }
}
