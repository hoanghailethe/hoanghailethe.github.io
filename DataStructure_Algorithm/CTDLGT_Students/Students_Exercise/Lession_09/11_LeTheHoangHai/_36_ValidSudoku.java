public class _36_ValidSudoku {
    public boolean isValidSudoku(char[][] board) {

        // check each cell value 81 cells
        for (int i = 0; i < 9; i++) { // x row here
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c == '.') {//skip
                } else {
                    if (!checkRow(i, j, board))
                        return false;
                    if (!checkCol(i, j, board))
                        return false;
                    if (!checkBox(i, j, board))
                        return false;
                }
            }
        }
        return true;
    }

    private static boolean checkRow(int x, int y, char[][] board) { // fixed x
        char c = board[x][y];
        for (int j = 0; j < 9; j++) {
            if (j == y)
                continue;
            if (c == board[x][j])
                return false;
        }
        return true;
    }

    private static boolean checkCol(int x, int y, char[][] board) { // fixed y
        char c = board[x][y];
        for (int j = 0; j < 9; j++) {
            if (j == x)
                continue;
            if (c == board[j][y])
                return false;
        }
        return true;
    }

    private static boolean checkBox(int x, int y, char[][] board) {
        // box1 condition
        if (x < 3 && y < 3) {
            int a = 0;
            int b = 0;
            return checkArea(a, b, board, x, y);
        }
        // box 2 condition
        if (x < 3 && y < 6) {
            int a = 0;
            int b = 3;
            return checkArea(a, b, board, x, y);
        }
        // box 3
        if (x < 3 && y < 9) {
            int a = 0;
            int b = 6;
            return checkArea(a, b, board, x, y);
        }

        // box4 condition
        if (x < 6 && y < 3) {
            int a = 3;
            int b = 0;
            return checkArea(a, b, board, x, y);
        }
        // box5 condition
        if (x < 6 && y < 6) {
            int a = 3;
            int b = 3;
            return checkArea(a, b, board, x, y);
        }
        // box 6
        if (x < 6 && y < 9) {
            int a = 3;
            int b = 6;
            return checkArea(a, b, board, x, y);
        }

        // box7 condition
        if (x < 9 && y < 3) {
            int a = 6;
            int b = 0;
            return checkArea(a, b, board, x, y);
        }
        // box8 condition
        if (x < 9 && y < 6) {
            int a = 6;
            int b = 3;
            return checkArea(a, b, board, x, y);
        }
        // box 9
        if (x < 9 && y < 9) {
            int a = 6;
            int b = 6;
            return checkArea(a, b, board, x, y);
        }
        return false;
    }

    private static boolean checkArea(int a, int b, char[][] board, int x, int y) {
        if (    board[x][y] == board[a][b]      && x!= a && y!= b      || 
                board[x][y] == board[a][b+1]    && x!= a && y!= b+1    || 
                board[x][y] == board[a][b+2]    && x!= a && y!= b+2    ||
                board[x][y] == board[a+1][b]    && x!= a+1 && y!= b    ||
                board[x][y] == board[a+1][b+1]  && x!= a+1 && y!= b+1  ||
                board[x][y] == board[a+2][b]    && x!= a+2 && y!= b    ||
                board[x][y] == board[a+2][b+1]  && x!= a+2 && y!= b+1  ||
                board[x][y] == board[a+2][b+2]  && x!= a+2 && y!= b+2
            ) {
                return false;
            } return true;     
    }



}
