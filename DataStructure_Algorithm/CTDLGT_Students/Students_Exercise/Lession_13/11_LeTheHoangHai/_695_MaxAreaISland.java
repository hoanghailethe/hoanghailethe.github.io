import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _695_MaxAreaISland {
    public static int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        //Object holder
        List<int[]> landCells = new ArrayList<>();

        //index holder = 2 SET for X and for Y and ROW hole set y      
        ArrayList<Set<Integer>> rows = new ArrayList<>(grid.length);    
        Set<Integer> x = new HashSet<>();
        
        //Load INPUT
        for (int i = 0; i< grid.length; i++) {    
            Set<Integer> y = new HashSet<>();             
            for (int j = 0; j < grid[0].length; j++) {     
                 
                if (grid[i][j] == 1) {
                    int[] cell = new int [2];
                    cell[0] = i;
                    cell[1] = j;
                    landCells.add(cell); 
                    y.add(j);                   
                }
            }
            rows.add(i, y);
            if (!y.isEmpty()) x.add(i);
            System.out.println(rows);
            System.out.println("-----");
            System.out.println(x);
            System.out.println("-----");
            System.out.println(y);
            System.out.println("-----");
        }

        //take out from ArrayList
        while (!landCells.isEmpty()){
            int count = 0;
            //take the HEAD of the List
            //landCells.remove(0)
            int xAdd = landCells.get(0)[0];
            int yAdd = landCells.get(0)[1];
            
            System.out.println("NEw Teritory");
            count = takeNextXY(landCells, rows, x, xAdd, yAdd, count);
            if(count > max) max = count;
        }

        return max;
    }

    public static int takeNextXY(List<int[]> landCells, ArrayList<Set<Integer>> rows, Set<Integer> x, int xAdd, int yAdd, int count) 
            
        {
            rows.get(xAdd).remove(yAdd);
            if(rows.get(xAdd).isEmpty()) x.remove(xAdd);       
            
            //remore from the Arraylist of all the "1" cell (or represent land)            
            for(int i = 0; i < landCells.size(); i++) {
                int[]a = landCells.get(i);
                if(a[0] == xAdd && a[1] == yAdd) {
                    landCells.remove(a);
                    System.out.println("remove this cell (proccessed)");
                    System.out.println(a[0] + " , " + a[1]);
                }
            }
            
            count = count+1;
            

            //check all the Case
            if(x.contains(xAdd-1) && rows.get(xAdd-1).contains(yAdd)){
                count = takeNextXY(landCells, rows, x, xAdd -1, yAdd, count);
            }
            if(x.contains(xAdd) && rows.get(xAdd).contains(yAdd-1)){
                count =takeNextXY(landCells, rows, x, xAdd, yAdd-1, count);
            }
            if(x.contains(xAdd ) && rows.get(xAdd).contains(yAdd+1)){
                count =takeNextXY(landCells, rows, x, xAdd, yAdd+1, count);
            }
            if(x.contains(xAdd + 1) && rows.get(xAdd + 1).contains(yAdd)){
                count =takeNextXY(landCells, rows, x, xAdd + 1, yAdd, count);
            }
            
            return count;

    }

    public static void main(String[] args) {
        //int[][] grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,1,1,0,1,0,0,0,0,0,0,0,0},{0,1,0,0,1,1,0,0,1,0,1,0,0},{0,1,0,0,1,1,0,0,1,1,1,0,0},{0,0,0,0,0,0,0,0,0,0,1,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,1,1,0,0,0,0}};
        //int[][] grid = {{1,1,0,1,1},{1,0,0,0,0},{0,0,0,0,1},{1,1,0,1,1}};
        int[][]grid = {{0,1},{1,1}};
        System.out.println(maxAreaOfIsland(grid));
    }
}
