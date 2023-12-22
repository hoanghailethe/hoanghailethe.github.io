class _414ThirdMaximumNumber {
    public static int thirdMax(int[] nums) {
        long max = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                third = second;
                second = max;
                max = nums[i];
            }
            else if (nums[i] > second && nums[i] < max) {
                third = second;
                second = nums[i];
            }
            else if (nums[i] > third && nums[i] < second) {
                third = nums[i];
            }
        }
        return third == Long.MIN_VALUE ?(int) max : (int) third;
    }
    
    public static void main(String[] args) {
        int[] nums = {1,2,-2147483648};
        System.out.println(thirdMax(nums));
    }
}