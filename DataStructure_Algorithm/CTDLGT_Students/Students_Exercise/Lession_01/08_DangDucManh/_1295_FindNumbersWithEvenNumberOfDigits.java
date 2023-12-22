public class _1295_FindNumbersWithEvenNumberOfDigits {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            String str;
            str = String.valueOf(nums[i]);
            if (str.length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 111, 2332 };
        System.out.println("Out: " + findNumbers(arr));
    }
}