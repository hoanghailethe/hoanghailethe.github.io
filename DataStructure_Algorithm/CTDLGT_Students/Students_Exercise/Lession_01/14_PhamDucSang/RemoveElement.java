public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        int count = 0;
        if (nums.length == 0) {
            return 0;
        }else if (nums[nums.length - 1] == val) {
            nums[nums.length-1] = val+1;
            count++;
        }
        while (index < nums.length && index >= 0) {
            if (nums[index] == val) {
                for (int i = index + 1; i < nums.length; i++) {
                    nums[i-1] = nums[i];
                }
                index--;
                count++;
            }
            index++;
        }
        return (nums.length - count);
    }
}
