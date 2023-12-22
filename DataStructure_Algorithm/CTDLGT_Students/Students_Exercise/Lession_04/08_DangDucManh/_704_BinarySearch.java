public class _704_BinarySearch {
    public static int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        while(l<=r){
            int m = (l+r)/2;
            if(target == nums[m]) return m;
            if(target < nums[m]){
                r = m-1;
            } else {
                l = m+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { -1, 0, 3, 5, 9, 12 };
        System.out.println(search(nums, 9));
    }
}
