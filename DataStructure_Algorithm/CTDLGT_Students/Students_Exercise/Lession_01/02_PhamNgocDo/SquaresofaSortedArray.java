import java.util.Arrays;

class SquaresofaSortedArray {
    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        for (int i : sortedSquares(new int[]{-4,-1,0,3,10})) {
            System.out.print(i + " ");
        }
    }
}