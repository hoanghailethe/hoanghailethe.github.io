package day10;

public class _766_ToeplitzMatrix {
    public static void main(String[] args) {
        int[][] matrix = { { 36, 59, 71, 15, 26, 82, 87 }, { 56, 36, 59, 71, 15, 26, 82 },
                { 15, 0, 36, 59, 71, 15, 26 } };
        print(matrix);
        System.out.println(isToeplitzMatrix(matrix));
    }

    public static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Duyệt theo đường chéo
    /**
     * 1 ms
     * 
     * 39.4 MB
     * 
     * 69.52%
     */
    public static boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            int num = matrix[0][i];
            for (int j = 1; j < matrix.length && i + j < matrix[0].length; j++) {
                if (num != matrix[j][i + j]) {
                    return false;
                }
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            int num = matrix[i][0];
            for (int j = 1; j < matrix[0].length && i + j < matrix.length; j++) {
                if (num != matrix[i + j][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    // Lời giải 1. Chơi duyệt lại
    /**
     * 1 ms
     * 
     * 38.7 MB
     * 
     * 69.52%
     */
    public boolean isToeplitzMatrix2(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i + 1 < matrix.length && j + 1 < matrix[0].length) {
                    if (matrix[i][j] != matrix[i + 1][j + 1]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
