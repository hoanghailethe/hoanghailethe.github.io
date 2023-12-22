public class SortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
        int[] B = new int[A.length];
        int leftIndex = 0;
        int rightIndex = A.length-1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                B[leftIndex++] = A[i];
            } else {
                B[rightIndex--] = A[i];
            }
        }
        return B;
    }
}
