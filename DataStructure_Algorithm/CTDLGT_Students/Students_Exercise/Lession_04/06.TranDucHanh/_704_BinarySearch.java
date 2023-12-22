public class _704_BinarySearch {
    public static int search(int[] nums, int start, int end, int target) {
        if (start > end) {
            return -1;
        }

        int mid = (start + end) / 2;

        if (nums[mid] == target) {
            return mid;
        }
        if (nums[mid] > target) {
            return search(nums, start, mid - 1, target);
        }
        return search(nums, mid + 1, end, target);

    }

    public static void main(String[] args) {
        int[] nums = { -1, 0, 3, 5, 9, 12 };
        System.out.println(search(nums, 0, nums.length, 9));
    }
}
