public class _414btt{
    public static void main(String[] args) {
        int[] num = { 1, 1, 4, 2, 1, 3 };
        thirdMax(num);
    }
    public static int thirdMax(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
                int count = nums[i];
                int j = i - 1;
                while (j >= 0 && nums[j] > count) {
                    nums[j + 1] = nums[j];
                    j = j - 1;
                }
                nums[j + 1] = count;
            }
            int count = 0;
            int count2 = 0;
            for (int i = 1; i < nums.length; i++) {
                int j = i - 1;
                if (nums[i] == nums[j]) {
                    count2++;
                }
                if (nums[i] != nums[j] && j >= 0) {
                    count++;
                    nums[count] = nums[i];
                }
    
            }
            int b;
            if (nums.length - count2 > 2) {
                b = nums[nums.length - count2 - 3];
                return b;
            }
    
            if (nums.length - count2 == 2) {
                b = Math.max(nums[0], nums[1]);
                return b;
    
            }
            if (nums.length - count2 == 1) {
                b = nums[0];
                return b;
    
            }
            return 1;
        }
}