public class _977_SquaresOfASortedArray {
   
    public static int[] sortedSquares(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        int[] result = new int[j + 1];
        for (int k = j; k >= 0; k--) {
            if (arr[i] * arr[i] < arr[j] * arr[j]) {
                result[k] = arr[j] * arr[j];
                j--;
            } else {
                result[k] = arr[i] * arr[i];
                i++;
            }
        }
        return result;
    }
}
