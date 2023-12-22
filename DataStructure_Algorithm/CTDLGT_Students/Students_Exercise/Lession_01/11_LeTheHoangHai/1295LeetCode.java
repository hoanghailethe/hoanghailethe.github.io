public class 1295LeetCode {
    
        public int findNumbers(int[] nums) {
            int count = 0;
            for (int i = 0 ; i<nums.length; i++) {
                int digit = 0;
                while(nums[i]>=1){
                    nums[i] /= 10;
                    digit++;
                }
                if(digit % 2 == 0) {
                    count++;
                }
            }
            return count;
        }
}
