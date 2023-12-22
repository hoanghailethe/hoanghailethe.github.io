package day10;

public class _922_SortArrayByParityII {
    // Lời giải tạo thêm mảng
    /**
     * 2 ms
     * 
     * 42 MB
     */
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int i = 0;
        int j = 1;
        for (int k = 0; k < res.length; k++) {
            if (nums[k] % 2 == 0) {
                res[i] = nums[k];
                i += 2;
            } else {
                res[j] = nums[k];
                j += 2;
            }
        }
        return res;
    }

    // in place

    /**
     * 2 ms
     * 
     * 40.4 MB
     * 
     * 98.93%
     */
    public int[] sortArrayByParityII2(int[] nums) {
        int chan = 0;
        int le = 1;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                if (nums[i] % 2 == 0) {
                    continue;
                }
                while (nums[le] % 2 != 0) {
                    le += 2;
                }
                int temp = nums[i];
                nums[i] = nums[le];
                nums[le] = temp;
            } else {
                if (nums[i] % 2 != 0) {
                    continue;
                }
                while (nums[chan] % 2 == 0) {
                    chan += 2;
                }
                int temp = nums[i];
                nums[i] = nums[chan];
                nums[chan] = temp;
            }
        }
        return nums;
    }

}
