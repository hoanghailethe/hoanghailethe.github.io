package day10;

public class _695_MaxAreaOfIsland {
    /**
     * 2 ms
     * 
     * 39.5 MB
     * 
     * 99.41%
     */
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    max = Math.max(DFS(grid, i, j), max);
                }
            }
        }
        return max;
    }

    public int DFS(int[][] grid, int i, int j) {
        if (i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && grid[i][j] == 1) {
            grid[i][j] = 0;
            return 1 + DFS(grid, i + 1, j) + DFS(grid, i - 1, j) + DFS(grid, i, j - 1) + DFS(grid, i, j + 1);
        }
        return 0;
    }
}
