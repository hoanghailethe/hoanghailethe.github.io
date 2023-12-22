public class _695_Max_Queue_fasterx3times {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        //Object holder
        Queue<int[]> landCells = new LinkedList<>(); 
        ArrayList<Set<Integer>> rows = new ArrayList<>(grid.length);    
        Set<Integer> x = new HashSet<>();
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
        }

        //take out from ArrayList
        while (!landCells.isEmpty()){
            int count = 0;
            int[] cell = landCells.poll();
            int xAdd = cell[0];
            int yAdd = cell[1];
            
            count = takeNextXY(landCells, rows, x, xAdd, yAdd, count);
            if(count > max) max = count;
        }

        return max;
    }

    public static int takeNextXY(Queue<int[]> landCells, ArrayList<Set<Integer>> rows, Set<Integer> x, int xAdd, int yAdd, int count) 
            
        {
            rows.get(xAdd).remove(yAdd);
            if(rows.get(xAdd).isEmpty()) x.remove(xAdd);       
            
            //remore from the Arraylist of all the "1" cell (or represent land)            
            for(int[] a : landCells) {
                if(a[0] == xAdd && a[1] == yAdd) {
                    landCells.remove(a);
                    break;
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
}
