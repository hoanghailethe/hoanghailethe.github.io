import java.util.Arrays;

public class Find_Numbers_with_Even_Number_of_Digits {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (String.valueOf(num).length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7896};
        findNumbers(arr);
        System.out.println(Arrays.toString(arr));
    }
}
