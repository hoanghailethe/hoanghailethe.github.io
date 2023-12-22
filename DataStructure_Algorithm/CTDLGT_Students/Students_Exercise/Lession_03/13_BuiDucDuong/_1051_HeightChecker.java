import java.util.Arrays;

public class _1051_HeightChecker {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println(heightChecker(arr));

    }

    public static int heightChecker(int[] heights) {
        int[] copy = Arrays.copyOf(heights, heights.length);
        for (int i = heights.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (heights[j] > heights[j + 1]) {
                    int temp = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j + 1] = temp;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != copy[i]) {
                count++;
            }
        }

        return count;
    }
}
