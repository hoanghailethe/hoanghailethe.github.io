class Solution {
    public static int thirdMax(int[] nums) {
        //Insertion sort : increasing order
        for(int i = 0; i<nums.length-1; i++){
            int a = nums[i+1];
            for(int j= i; j >= 0; j--) {
                int b = nums[j];
                if( a < b) {
                    nums[j+1] = nums[j];
                    nums[j] = a;
                } else {
                    break;
                }
                
            }
        }
        
        
     
        int count = 0;
        for (int i = nums.length-1; i > 0; i--) {
            if (nums[i] != nums[i-1]) {
                count++;
            }
            if (count == 2) {
                return nums[i-1];
            } else if( i == 1 && count <2) {
                return nums[nums.length-1];
            }
        }
        return nums[nums.length-1];
    }

    

    public static void main(String[] args) {
        int[] nums = {3,2,1};
        System.out.println(thirdMax(nums));
    }
}