public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        int index = 0;
        long val = Long.MAX_VALUE;
        long saveMax = Long.MIN_VALUE;

        while (index < 3) {
            long max = Long.MIN_VALUE;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < val && max < nums[i]) {
                    max = nums[i];
                }
            }
            if (saveMax < max) {
                saveMax = max;
            }

            index++;
            val = max;
        }
        if (val == Long.MIN_VALUE) {
            return (int)saveMax;
        }
        return (int)val;
    }
}
