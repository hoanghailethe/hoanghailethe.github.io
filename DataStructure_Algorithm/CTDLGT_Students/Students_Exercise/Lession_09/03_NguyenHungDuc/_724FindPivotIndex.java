class _724FindPivotIndex {
    public static int pivotIndex(int[] nums) {
        int sum = 0;
        int sumLeft = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int sumRight = sum;
        for (int i = 0; i < nums.length; i++) {
            sumLeft += nums[i];
            sumRight -= nums[i];
            if ((sumLeft - nums[i]) == sumRight) {
                return i;
            }
        }        
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = { 1,2,3 };
        System.out.println(pivotIndex(nums));
    }
}