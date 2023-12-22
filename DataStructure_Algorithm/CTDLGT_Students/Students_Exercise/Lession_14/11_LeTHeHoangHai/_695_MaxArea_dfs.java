public class _695_MaxArea_dfs {
    public static int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    int count = 0;
                    count = dfs(grid, i, j, count);
                    if (count > max)
                        max = count;
                }
            }
        }
        return max;
    }

    private static int dfs(int[][] grid, int row, int col, int counting) {
        if (row < 0 || col < 0 || row > grid.length-1 || col > grid[0].length-1) {
            return counting;
        }
        if(grid[row][col] != 1) return counting;
        grid[row][col] = 2;
        counting++;

        counting = dfs(grid, row-1, col, counting);
        counting = dfs(grid, row, col-1, counting);
        counting = dfs(grid, row, col+1, counting);
        counting = dfs(grid, row+1, col, counting);

        return counting;
    }

    public static void main(String[] args) {
        int[][] grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,1,1,0,1,0,0,0,0,0,0,0,0},{0,1,0,0,1,1,0,0,1,0,1,0,0},{0,1,0,0,1,1,0,0,1,1,1,0,0},{0,0,0,0,0,0,0,0,0,0,1,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,1,1,0,0,0,0}};
        //int[][] grid = {{1,1,0,1,1},{1,0,0,0,0},{0,0,0,0,1},{1,1,0,1,1}};
        //int[][]grid = {{0,1},{1,1}};
        System.out.println(maxAreaOfIsland(grid));
    }
}
