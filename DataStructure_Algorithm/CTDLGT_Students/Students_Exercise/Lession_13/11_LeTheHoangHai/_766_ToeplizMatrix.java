
public class _766_ToeplizMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int a = matrix.length; // i run Row
        int b = matrix[0].length; // j run Collumn

        // Column check
        for (int j = 0; j < b - 1; j++) {
            int value = matrix[0][j];
            for (int i = 1; i < a && (i + j) < b; i++) {
                if (matrix[i][i + j] != value)
                    return false;
            }
        }

        // check ROw
        for (int i = 0; i < a - 1; i++) {
            int value = matrix[i][0];
            for (int j = 1; j < b && (i + j) < a; j++) {
                if (matrix[i + j][j] != value)
                    return false;
            }
        }
        return true;

    }
}
