class _414_ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        int max = nums[0];
        int second_max = -2147483648;
        int third_max = -2147483648;
        boolean check = false;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (second_max < nums[i] && nums[i] != max) {
                second_max = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (third_max <= nums[i] && nums[i] != max && nums[i] != second_max) {
                third_max = nums[i];
                check = true;
            }
        }
        if (check) {
            return third_max;
        } else {
            return max;
        }
    }

    public static void main(String[] args) {
        _414_ThirdMaximumNumber sl = new _414_ThirdMaximumNumber();
        int[] nums = { 3, 2, 1 };
        sl.thirdMax(nums);
    }
}