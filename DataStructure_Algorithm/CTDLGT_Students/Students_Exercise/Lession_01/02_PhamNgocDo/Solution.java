class Solution {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int dem = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                dem++;
                if(dem>max) max =dem;
            } else {
                dem = 0;

            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[] { 0,0,0,0,0,1 }));
    }
}