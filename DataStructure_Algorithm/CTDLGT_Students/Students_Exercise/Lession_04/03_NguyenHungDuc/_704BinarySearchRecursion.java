class _704BinarySearchRecursion {
    
    public static int search(int[] nums, int target) {
        return recursion(nums, target, 0, nums.length);
    }

    public static int recursion(int[]nums,int target, int start, int end) {
        int middle = (start + end) / 2;

        if (target == nums[middle]) {
            return middle;
        } 
        else if (target < nums[middle]) {
            if (end == middle) {
                return -1;
            }
        
            return recursion(nums, target, start, middle);
        }
    
        
        else{
            if (target == nums[middle]) {
            return middle;
        } 
        else if (target > nums[middle]) {
            if (middle == start) {
                return -1;
            }
        }
    }
        return recursion(nums, target, middle, end);

    }

        
    
    public static void main(String[] args) {
        int[] nums = { -1, 0, 3, 5, 9, 12 };
        System.out.println("index số target là: "+ search(nums, 12));
        
    }
}