
public class _704bt {
    public static void main(String[] args) {
        int nums[] = { -1, 0, 3, 5, 9, 12 };
        int target = 9;
        int n = nums.length;
        search(nums, target, n);
    }

    public static int search(int[] nums, int target, int n) {
        n--;
        if (nums[n] == target && n >= 0) {
            return n;
        }
        search(nums, target, n);
        return -1;
    }
}
