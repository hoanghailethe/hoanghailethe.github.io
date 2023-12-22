package day04;

public class _704_BinarySearch {
    public static void main(String[] args) {
        int[] nums = { -1, 0 };
        int target = 0; 
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        if(nums.length ==1) {
            return nums[0] == target ? 0 : -1;
        } 
            return search(nums, target, 0, nums.length - 1);
        }
    
        private static int search(int[] nums, int target, int l, int r) {
            if (nums[l] <= target && nums[r] >= target) {
                int val = (r - l) * (target - nums[l]) / (nums[r] - nums[l]) + l;
                if (nums[val] < target) {
                    return search(nums, target, val + 1, r);
                } else if (nums[val] > target) {
                    return search(nums, target, l, val - 1);
                } else {
                    return val;
                }
            }
            return -1;
        }
}
