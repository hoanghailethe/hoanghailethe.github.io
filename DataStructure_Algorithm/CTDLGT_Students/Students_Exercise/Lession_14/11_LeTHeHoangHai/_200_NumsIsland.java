public class _200_NumsIsland {
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int noIslands = 0;
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                if (grid[i][j] == '1') {
                    noIslands++;
                    dfs(grid, i, j);
                }
            }
        }
        return noIslands;

    }

    private void dfs(char[][] grid, int row, int col) {
        if (row >= grid.length || row < 0 || col < 0 || col >= grid[0].length) {
            return;
        }
        if (grid[row][col] == '1') {
            grid[row][col] = '0';
            dfs(grid, row, col + 1);
            dfs(grid, row, col - 1);
            dfs(grid, row + 1, col);
            dfs(grid, row - 1, col);

        }
    }
}
