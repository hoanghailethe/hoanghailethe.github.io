public class _1051HeightChecker {

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println("");
    }

    public static int heightChecker(int[] heights) {
        int n = heights.length;
        int[] copied = new int[n];
        for (int i = 0; i < n; i++) {
            copied[i] = heights[i];
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int minIndex = i;
                if (copied[j] < copied[minIndex]) {
                    minIndex = j;
                }
                if (minIndex != i) {
                    int t = copied[i];
                    copied[i] = copied[minIndex];
                    copied[minIndex] = t;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (heights[i] != copied[i]) {
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        int[] heights = { 1, 1, 4, 2, 1, 3 };
        heightChecker(heights);
        System.out.println(heightChecker(heights));

    }
}