public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int index = 0;
        int countVal = 0;

        if (nums.length == 0) {
            countVal = 0;
        }else if (nums[nums.length - 1] == 0) {
            nums[nums.length-1] = 1;
            countVal++;
        }

        while (index < nums.length && index >= 0) {
            if (nums[index] == 0) {
                for (int i = index + 1; i < nums.length; i++) {
                    nums[i-1] = nums[i];
                }
                index--;
                countVal++;
            }
            index++;
        }
        if (countVal >= 1) {
            for (int i = 1; i <= countVal; i++) {
                nums[nums.length - i] = 0;
            }
        }
    }
}
