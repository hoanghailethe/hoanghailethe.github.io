import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class _200_NumsOfISland_myway {
    public static int numIslands(char[][] grid) {   
        LinkedList< LinkedList<Integer> > fixedLand = new LinkedList<>();
        LinkedList< LinkedList<Integer> > processing = new LinkedList<>();
        //inside is the LAND itself
        int xSize = grid.length;
        int ySize = grid[0].length;

        int count = 0; //deal with bug
        for (int i = 0; i < xSize; i++) {
            //bug with ysize ==1
            if(ySize == 1){
                if(grid[i][0] == '1' && i == xSize-1) {
                    count++;
                }
                else if(grid[i][0] == '1'&& grid[i+1][0] == '0') count++;
                continue;
            }
            
            LinkedList<LinkedList<Integer>> thisRow = new LinkedList<>();

            //add land1 - 0 - land2... in row to Arr<> thisRow
            for(int j = 0; j < ySize-1; j++) {    
                //and a bug stupid here
                if ( j == ySize-2 && grid[i][j] == '0' && grid[i][j+1] == '1') {
                    LinkedList<Integer> bug = new LinkedList<>();
                    bug.add(j+1);
                    thisRow.add(bug);
                }

                //scanning and PROCCESS Each row. SEPARATED Queue if not side-by-side land             
                if(grid[i][j] == '1') {
                    LinkedList<Integer> lands = new LinkedList<>();
                    lands.add(j);
                    while(grid[i][j+1] == '1') {
                        j++;
                        lands.add(j);
                        if (j == ySize -1) break; //to make sure it dont break out array bound
                    }
                    //save to the processor-- if found land.. and separate them
                    if(!lands.isEmpty()) {
                        thisRow.add(lands);
                    } 
                }
            }

            if(thisRow.isEmpty()) {
                //if all the row is juzt 0
                fixedLand.addAll(processing);
                processing.clear();
                continue;
            }

            if(processing.isEmpty()) {
                processing = thisRow;
            } else {
                //if there are new TERRITORY appeear (which has no connection with .. the previous cell).
                // then after compare. at the end. these new land will be updatede to th ePROCESSING list.
                Set<LinkedList<Integer>> addAfter = new HashSet<>();
             
                //AGain Bug will APPEAR for SURE if we REMOVE ELEMENT in the list while PROCESSING
                // because we remove the Element in processing.. so it stop while now complete Comparing element in that list/..
                //to avoid this.. every Action of ADD or DELETE need to POSTPONE until the END of the PRCOCESS.
                //We do this by... Creating another list... and at the end/ use AddALl and RemoveALl
                Set<LinkedList<Integer>> deleteAfter = new HashSet<>();
                
                for(LinkedList<Integer> lastRowLand : processing) {
                    //create a list to process...
                    LinkedList<Integer> connectedLand = new LinkedList<>();
                    for (LinkedList<Integer> thisRowLand : thisRow) {
                        for (int yAdd : lastRowLand) {
                            if (!connectedLand.isEmpty()) break;
                            for(int yyAdd : thisRowLand) {
                                if(yAdd == yyAdd) 
                                {
                                    // If two land has a connection
                                    connectedLand.addAll(thisRowLand);
                                    break;
                                }
                            }
                        }
                        //if there is no connection... add new teritory to addafter.. to later update to processing
                        if (connectedLand.isEmpty()){
                            addAfter.add(thisRowLand);
                        }
                    }

                    //if there is no connection... and remember in this case. Row has value
                    if (!connectedLand.isEmpty()) {
                        lastRowLand.clear();
                        lastRowLand.addAll(connectedLand);
                        //if conneted.. update the row value in connecting...But we shouldnt change like this while processing
                        //oh but this work. because all the lastRowland finished processing. in this step...
                    } else {
                        fixedLand.add(lastRowLand);
                        //processing.remove(lastRowLand)   THIS CAUSE bug
                        //because it is empty...BUG..
                        deleteAfter.add(lastRowLand);
                    }
                }//end for thisrowland loop

                //update new territory if have any new
                if(!addAfter.isEmpty()){
                    processing.addAll(addAfter);
                }

                //delete old territory.. (all these added to fixed land already)
                if(!deleteAfter.isEmpty()) {
                    processing.removeAll(deleteAfter);
                }
            }
        } //end for eachRow loop
        if (ySize  == 1) return count;
        fixedLand.addAll(processing);
        return fixedLand.size();
    }

    public static void main(String[] args) {
        //int[][] grid = {{1,1,1,1,0},{1,1,0,1,0},{1,1,0,0,0},{0,0,0,0,0}};
        // char[][] grid = {
        //     {'1','1','0','0','0'},
        //     {'1','1','0','0','0'},
        //     {'0','0','1','0','0'},
        //     {'0','0','0','1','1'}
        //   };

        //char[][] grid = {{'1'},{'1'}};

        //char[][] grid = {{'0','1','0'},{'1','0','1'},{'0','1','0'}};
        //char[][] grid = {{'1','0','1'},{'0','1','0'},{'1','0','1'}};
        char[][] grid = {{'1','0','1','1','1'},{'1','0','1','0','1'},{'1','1','1','0','1'}};
        System.out.println(numIslands(grid));
    }
}
