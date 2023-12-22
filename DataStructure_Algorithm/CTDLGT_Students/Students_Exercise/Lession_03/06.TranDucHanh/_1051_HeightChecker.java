public class _1051_HeightChecker {
    public static int heightChecker(int[] heights) {
        int n = heights.length;
        int[] sortedArray = new int[n];
        for (int i = 0; i < n; i++) {
            sortedArray[i] = heights[i];
        }
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int temp = sortedArray[i];
            while (j >= 0 && sortedArray[j] > temp) {
                sortedArray[j + 1] = sortedArray[j];
                j--;
            }
            sortedArray[j + 1] = temp;

        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (sortedArray[i] != heights[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] heights = { 1, 2, 6, 4, 5 };
        System.out.println(heightChecker(heights));
    }
}
