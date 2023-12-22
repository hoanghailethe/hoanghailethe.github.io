import java.util.Arrays;

public class _1051_Height_Checker {
    public static int heightChecker(int[] heights) {
        int count = 0;
        int[] copied = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            copied[i] = heights[i];
        }
        Arrays.sort(copied);

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != copied[i]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] heights1 = {1, 1, 4, 2, 1, 3};
        int[] heights2 = {5, 1, 2, 3, 4};
        int[] heights3 = {1, 2, 3, 4, 5};
        System.out.println(heightChecker(heights1));
        System.out.println(heightChecker(heights2));
        System.out.println(heightChecker(heights3));
    }
}
