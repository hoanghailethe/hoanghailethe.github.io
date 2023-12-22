public class EvenNumberOfDigits {
    public static int findNumbers(int[] nums) {
        int index = 0;
        int evenDigitCount = 0;

        while (index < nums.length) {
            int countDigits = 1;
            while (nums[index] / 10 != 0) {
                countDigits++;
                nums[index] = nums[index] / 10;
            }
            if (countDigits % 2 == 0) {
                evenDigitCount++;
            }
            index++;
        }
        return evenDigitCount;
    }

    public static void main(String[] args) {

    }
}
