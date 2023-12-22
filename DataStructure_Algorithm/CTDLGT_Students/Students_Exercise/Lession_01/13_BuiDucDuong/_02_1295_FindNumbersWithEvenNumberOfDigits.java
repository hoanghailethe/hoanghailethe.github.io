public class _1295_FindNumbersWithEvenNumberOfDigits {

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int numberOfDigits = 0;
            while (num != 0) {
                num /= 10;
                numberOfDigits++;
            }
            if (numberOfDigits % 2 == 0) {
                count++;
            }
        }
        return count;
    }

}
