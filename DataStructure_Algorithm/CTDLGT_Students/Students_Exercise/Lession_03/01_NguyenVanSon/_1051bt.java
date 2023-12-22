public class _1051bt {
    public static void main(String[] args) throws Exception {
        int[] num = { 1, 1, 4, 2, 1, 3 };
        thirdMax(num);

    }

    public static int thirdMax(int[] heights) {
        int[] nums2 = new int[heights.length];
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = heights[i];
        }
        int n = heights.length;
        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (heights[j] < heights[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int index = heights[i];
                heights[i] = heights[minIndex];
                heights[minIndex] = index;
            }

        }
        int j = 0;
        for (int i = 0; i < nums2.length; i++) {
            if (heights[i] != nums2[i]) {
                j++;
            }
        }
        return j;

    }
}