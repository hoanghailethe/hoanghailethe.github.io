public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int countOnes = 0;

        for (int num : nums) {
            if (num == 1) {
                countOnes++;
            } else {
                countOnes = 0;
            }

            if (max <= countOnes) {
                max = countOnes;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] testArr = {0, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(testArr));
    }
}
