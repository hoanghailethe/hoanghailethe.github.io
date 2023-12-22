public class _1051_HeightChecker {
    public static int heightChecker(int[] heights) {
        int result = 0;
        int[] sortHeights = new int[heights.length];
        for (int i = 0; i < sortHeights.length; i++) {
            sortHeights[i] = heights[i];
        }
        for (int i = 1; i < heights.length; i++) {
            int temp = heights[i];
            int j = i - 1;
            while (j >= 0 && heights[j] > temp) {
                heights[j + 1] = heights[j];
                j = j - 1;
            }
            heights[j + 1] = temp;
        }
        for (int i = 0; i < sortHeights.length; i++) {
            if (heights[i] != sortHeights[i]) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] heights = { 2, 1, 5, 3, 4, 6 };
        System.out.println(heightChecker(heights));
    }
}
