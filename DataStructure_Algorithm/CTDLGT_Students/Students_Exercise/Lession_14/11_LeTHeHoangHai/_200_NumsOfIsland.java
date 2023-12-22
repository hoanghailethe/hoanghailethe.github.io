import java.util.Stack;

public class _200_NumsOfIsland {
    public int numIslands(char[][] grid) {
               
        if (grid == null || grid.length == 0) return 0;
        
        int row = grid.length;
        int column = grid[0].length;
        int numIslands = 0;
                
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++) {
                if (grid[i][j] == '1') {
                    bfs(grid, i, j);
                    numIslands++;
                }
            }
        }
        return numIslands;
    }
    
    
    private void bfs(char[][]grid, int x, int y){
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(x, y));
        grid[x][y] = '0';
        
        while (!queue.isEmpty()){

            Coordinate thisPoint = queue.poll();
            
            int newX = thisPoint.x;
            int newY = thisPoint.y;
            
            if(newX > 0 && grid[newX - 1][newY] == '1'){
                queue.add(new Coordinate(newX - 1, newY));
                grid[newX - 1][newY] = '0';
            }
            
            if(newX < grid.length - 1 && grid[newX + 1][newY] == '1'){
                queue.add(new Coordinate(newX + 1, newY));
                grid[newX + 1][newY] = '0';
            }
            
            if(newY > 0 && grid[newX][newY - 1] == '1'){
                queue.add(new Coordinate(newX, newY - 1));
                grid[newX][newY - 1] = '0';
            }
            
            if(newY  < grid[0].length - 1&& grid[newX][newY + 1] == '1'){
                queue.add(new Coordinate(newX, newY + 1));
                grid[newX][newY + 1] = '0';
            }
            
        }
        
    }
}

class Coordinate {
    
    int x;
    int y;
    
    public Coordinate(int x, int y){
        this.x = x;
        this.y = y;
    }
}

