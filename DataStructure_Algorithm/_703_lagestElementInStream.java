import java.util.Arrays;

public class _703_lagestElementInStream {

    int largestKThNum;
    int[] nums;

    public KthLargest(int k, int[] nums) {
        Arrays.sort(nums);
        this.nums = Arrays.copyOfRange(nums, nums.length-k, nums.length);
        largestKThNum = nums[nums.length-k];
    }
    
    public int add(int val) {
        if(val > this.largestKThNum) {
            //insert to nums
            int[] newNums = new int[nums.length];

            // binasearch the position to insert = > copy values to new array 
            //=> make this num become new array
            this.nums = newNums;
            //
            this.largestKThNum = this.nums[0];
        }
        return this.largestKThNum;

    }
}
