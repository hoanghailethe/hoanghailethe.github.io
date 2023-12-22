public class _414_ThirdMaximumNumber {
    public static int thirdMax(int[] nums) {
        int max1 = nums[0];
        int max2 = -2147483648;
        int max3 = -2147483648;
        boolean isExistMax3 = false;
        for (int i = 0; i < nums.length; i++) {
            if(max1 < nums[i]){
                max1 = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(max2 < nums[i] && nums[i] != max1){
                max2 = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(max3 <= nums[i] && nums[i] != max1 && nums[i] != max2){
                max3 = nums[i];
                isExistMax3 = true;
            }
        }
        if(isExistMax3){
            return max3;
        } else {
            return max1;
        }
    }
    public static void main(String[] args) {
        int[] num = {1,2,-2147483648};
        System.out.println(thirdMax(num));
    }
}
