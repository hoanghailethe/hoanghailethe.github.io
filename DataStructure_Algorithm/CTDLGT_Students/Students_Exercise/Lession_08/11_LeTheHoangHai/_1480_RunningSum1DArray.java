public class _1480_RunningSum1DArray {
    public int[] runningSum(int[] nums) {
        int size = nums.length;
        if (size <= 1) return nums;
        for(int i = 1; i<nums.length; i++) {
            nums[i] = nums[ i-1] + nums [i];
        }
        return nums;
    }
}
