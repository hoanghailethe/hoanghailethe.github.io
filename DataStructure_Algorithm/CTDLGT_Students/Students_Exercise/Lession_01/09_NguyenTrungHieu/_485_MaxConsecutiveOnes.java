public class _485_MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1){
                count++;
            } else {
                if (max < count){
                max = count;
                }
                if(count > 0){
                    count = 0;
                }
            }
        }
        return max < count ? count : max;
    }

    public static void main(String[] args) throws Exception {
        int[] arr = {1,1,1,0,1,0,1,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
}
