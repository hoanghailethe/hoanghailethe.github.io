public class _200_numsISLAND_myway {
    public static int numIslands(char[][] grid) {   
        int count = 0;
        
        for (int i =0; i < grid.length; i++) {
            for(int j =0; j< grid[0].length; j++) {

                if(grid[i][j] == '1') {
                    dfs(grid, i, j);
                    count++;
                }

            }
        }

    return count;
    }

    private static void dfs(char[][] grid, int x, int y) {
        if(x == grid.length || x < 0 || y<0|| y == grid[0].length) return;

        if(grid[x][y] == '0') {
            //done
            return;
        } else {
            grid[x][y] ='0';
        }
        
        dfs(grid, x, y -1);
        dfs(grid, x-1, y);
        dfs(grid, x, y+1);
        dfs(grid, x+1, y);

    }
}
