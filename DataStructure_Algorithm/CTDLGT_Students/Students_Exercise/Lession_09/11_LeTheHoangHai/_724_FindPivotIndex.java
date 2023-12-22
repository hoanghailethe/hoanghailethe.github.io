public class _724_FindPivotIndex {
    public int pivotIndex(int[] nums) {
        if (nums.length < 2)
            return -1;

        int size = nums.length;
        int[] leftSum = new int[size];
        int sum = 0;

        for (int i = 0; i < size; i++) {
            leftSum[i] = sum;
            sum += nums[i];
        }

        for (int i = 0; i < size; i++) {
            if (leftSum[i] == (sum - leftSum[i]) - nums[i])
                return i;
        }
        return -1;
    }
}
