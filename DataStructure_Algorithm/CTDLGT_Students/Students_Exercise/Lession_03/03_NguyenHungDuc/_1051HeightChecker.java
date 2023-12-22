import java.lang.reflect.Array;

class _1051HeightChecker {
    public static int heightChecker(int[] heights) {
        int[] expected = new int[heights.length];
        for (int i = 0; i < expected.length; i++) {
            expected[i] = heights[i];
        }

        for (int i = 0; i < expected.length; i++) {
            for (int j = 0; j < expected.length; j++) {
                if (expected[i] < expected[j]) {
                    int temp = expected[i];
                    expected[i] = expected[j];
                    expected[j] = temp;
                }
            }
        }

        int count = 0;

        for (int i = 0; i < expected.length; i++) {
             if (expected[i] != heights[i]) {
                 count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] heights = { 1,2,3,4,5 };
        System.out.println(heightChecker(heights));
    }
}