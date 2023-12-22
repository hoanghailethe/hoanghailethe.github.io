public class _485_leetcode {
    public static void main(String[] args) throws Exception {
        int arr1[] = { 1, 0, 1, 0, 0, 1, 1, 1 };
        System.out.println(findMaxLength(arr1));
    }

    public static int findMaxLength(int[] arr) {
        int count = 0;
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count = 0;
            }
            if (arr[i] == 1) {
                count++;
                result = Math.max(count, result);
            }
        }
        return result;
    }
}
