import java.util.ArrayList;
import java.util.List;

public class _1260_Shift2DGrid {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        for(int i=0;i < k;i++){
            int[][] newGrid = new int [grid.length][grid[0].length]; 
            for(int row = 0; row < grid.length;row++){
                for(int col =0; col < grid[0].length-1;col++){
                    newGrid[row][col+1] = grid[row][col];
                }
            }
            for(int row = 1; row < grid.length;row++){
                newGrid[row][0] = grid[row-1][grid[0].length-1];
            }
            newGrid[0][0] = grid[grid.length-1][grid[0].length-1];
            grid = newGrid;
        }
        List<List<Integer>> result = new ArrayList<>();
        for(int[] row : grid){
            List<Integer> rowList = new ArrayList<>();
            for(int v : row ){
                rowList.add(v);
            }
            result.add(rowList);
        }
        return result;
    }
}
