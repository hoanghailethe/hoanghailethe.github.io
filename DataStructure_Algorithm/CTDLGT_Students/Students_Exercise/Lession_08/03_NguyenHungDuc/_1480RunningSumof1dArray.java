class _1480RunningSumof1dArray {
    public static int[] runningSum(int[] nums) {
        int result = 0;
        int[] runningSum = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result += nums[i];
            runningSum[i] = result;
        }
        
        return runningSum;
    }
    public static void main(String[] args) {
        int[] nums = { 1,1,1,1,1 };
        System.out.println(runningSum(nums));
    }
}