public class _1295_leetcode {
    public static void main(String[] args) throws Exception {
        int arr1[] = { 210, 10, 31, 212 };
        System.out.println(findEvenNumberDigits(arr1));
    }

    public static int findEvenNumberDigits(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (String.valueOf(arr[i]).length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
