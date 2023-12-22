public class _766_ToeplitzMatrix {
    public static boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] sum1 = new int[n-1];
        int[] sum2 = new int[n-1];
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < m-1; j++) {
                sum1[i] += matrix[j][i];
                sum2[i] += matrix[j+1][i+1];
            }
            if(sum1[i] != sum2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        int[][] matrix1 = {{1,2},{2,2}};
        System.out.println(isToeplitzMatrix(matrix1));
    }
}
