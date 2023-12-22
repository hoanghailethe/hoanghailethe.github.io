public class BinarySearch {
    public static int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, target);
    }

    public static int binarySearch(int[] nums, int left, int right, int target) {
        int mid = (left + right) / 2;
        if (left > right) {
            return -1;
        }
        if (nums[mid] == target) {
            return mid;
        }

        if (nums[mid] > target) {
            return binarySearch(nums, left, mid-1, target);
        } else {
            return binarySearch(nums, mid+1, right, target);
        }
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        //System.out.println(binarySearch(nums, 0, nums.length - 1, 9));
        System.out.println(search(nums, 9));
    }
}
