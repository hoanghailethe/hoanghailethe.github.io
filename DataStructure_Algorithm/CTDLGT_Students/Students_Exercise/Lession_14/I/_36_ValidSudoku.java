public class _36_ValidSudoku {
    public static boolean isValidSudoku(char[][] board) {

        // row check
        for (int i = 0; i < board.length; i++) {
            int[] val = new int[9];
            for (int j = 0; j < board[0].length; j++) {

                if (board[i][j] != '.') {
                    int check = board[i][j] - '0' - 1;
                    val[check]++;
                    if (val[check] > 1)
                        return false;
                }
            }
        }

        // col check
        for (int i = 0; i < board.length; i++) {
            int[] val = new int[9];
            for (int j = 0; j < board[0].length; j++) {
                if (board[j][i] != '.') {
                    int check = board[j][i] - '0' - 1;
                    val[check]++;
                    if (val[check] > 1)
                        return false;
                }
            }
        }

        // box check
        for (int i = 0; i < board.length; i += 3) {
            for (int j = 0; j < board[0].length; j += 3) {
           
                if (!checkBox(board, i, j)) {
                    return false;
                }
              
            }
        }

        return true;
    }

    private static boolean checkBox(char[][] board, int a, int b) {
        int[] val = new int[9];
        for (int i = a; i < a + 3; i++) {
            
            for (int j = b; j < b + 3; j++) {

                if (board[i][j] != '.') {
                    int check = board[i][j] - '0' - 1;
                    val[check]++;
                    if (val[check] > 1)
                        return false;
                }

            }
        }

        return true;
    }

    public static void main(String[] args) {
        char [][] board = 
            {
                {'.','4','.','.','.','.','.','.','.'},
                {'.','.','4','.','.','.','.','.','.'},
                {'.','.','.','1','.','.','7','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','3','.','.','.','6','.'},
                {'.','.','.','.','.','6','.','9','.'},
                {'.','.','.','.','1','.','.','.','.'},
                {'.','.','.','.','.','.','2','.','.'},
                {'.','.','.','8','.','.','.','.','.'}};

    System.out.println(isValidSudoku(board));
    }
}
