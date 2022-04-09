public class _905_sortArrayByPair {
//     Runtime: 1 ms, faster than 95.55% of Java online submissions for Sort Array By Parity.
// Memory Usage: 47.5 MB, less than 78.76% of Java online submissions for Sort Array By Parity.
    public int[] sortArrayByParity(int[] nums) {
        int[]res = new int [nums.length];
        int bg = 0;
        int end = nums.length-1;

        for(int i =0; i < nums.length ; i++) {
            if(nums[i]%2 == 0) {
                res[bg] = nums[i]; 
                bg++;
            }
            else {
                res[end] = nums[i];
                end--;
            }
        }
        return res;
    }
}
