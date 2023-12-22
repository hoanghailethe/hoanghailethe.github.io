import java.util.Arrays;

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = Arrays.copyOf(nums, nums.length);
        Arrays.sort(arr);
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++ ) {
            for(int j = 0; j < nums.length; j++) {
                if(nums[i] == arr[j]) {
                    result[i] = j!=0 ? j : 0;
                    break;
                }
            }
        }
         return result;
    }
}