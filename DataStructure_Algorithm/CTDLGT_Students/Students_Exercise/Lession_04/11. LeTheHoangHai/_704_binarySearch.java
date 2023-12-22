public class _704_binarySearch {
    public static int search(int[] nums, int target) {
        int start_i = 0;
        int end_i = nums.length - 1;
        return searchHaft(nums, start_i, end_i, target);
    }

    private static int searchHaft(int[] nums, int start_i, int end_i, int target) {
        if (end_i < start_i) {
            return -1;
        }
        int mid_index = (end_i + start_i) / 2;
        int mid_value = nums[mid_index];
        if (target == mid_value) {
            return mid_index;
        } else if (target > mid_value) {
            start_i = mid_index + 1;
            return searchHaft(nums, start_i, end_i, target);
        } else {
            end_i = mid_index - 1;
            return searchHaft(nums, start_i, end_i, target);
        }
    }

    public static void main(String[] args) {
        int[] nums = { -1, 0, 3, 5, 9, 12 };
        int target = 9;
        System.out.println(search(nums, target));

    }
}