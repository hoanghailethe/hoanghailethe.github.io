class _1365HowManyNumbers {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int [] numsCount = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[j] < nums[i] && j != i){
                    count++;
                    numsCount[i] = count;
                }
            }
        }
        for (int i : numsCount) {
            System.out.println(i);
        }

        return numsCount;

    }
        public static void main(String[] args) {
        int [] nums = {7,7,7,7};
        smallerNumbersThanCurrent(nums);
    }
}