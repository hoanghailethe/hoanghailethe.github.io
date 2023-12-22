public class _414_ThirdMaximumNumber {
    public static int thirdMax(int[] nums) {
        long max = Long.MIN_VALUE;
        long secondMax = max;
        long thirdMax = max;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > secondMax && nums[i] != max) {
                secondMax = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > thirdMax && nums[i] != max && nums[i] != secondMax) {
                thirdMax = nums[i];
            }
        }
        return thirdMax != Long.MIN_VALUE ? (int)thirdMax : (int)max;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,1,4};
        System.out.println(thirdMax(nums));
    }
}
