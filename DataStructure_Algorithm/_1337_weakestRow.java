import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _1337_weakestRow {
    public int[] kWeakestRows(int[][] mat, int k) {
        
        int[] leastSoldiersInRows = new int[k];
        Map<Integer, List<Integer>> rowIndexes = new HashMap<>();

        Arrays.fill(leastSoldiersInRows, mat[0].length);
 
        for (int i  = 0 ; i < mat.length; i++) {
            for(int j = leastSoldiersInRows.length - 1; j > 0 ; j--) {
                int leastSodier = leastSoldiersInRows[j];
                if( mat[i][leastSodier] == 1 ) continue; // already have more than this soldier number 
                else {
                    pushValuesToLeft( leastSoldiersInRows, j );

                    leastSoldiersInRows[j] = countSoldiersByBST(0, leastSodier, mat[i]);

                    rowIndexes.getOrDefault(leastSoldiersInRows[j], new ArrayList<Integer>()).add(i);
                    
                    break;
                }            
            }

        }
        return leastSoldiersInRows;
    }

    private int countSoldiersByBST(int begin, int end, int[] mat) {

        if (begin >= end ) return end;
        //find the first 10 in the line???;
        int mid = (begin +end) /2 ;

        if (mat[mid] == 1 && mat[mid+1 ] == 0) return mid;
        else if(mat[mid] == 1 && mat[mid+1 ] == 1) return countSoldiersByBST(mid+1, end, mat);
        else if (mat[mid] == 0 && mat[mid-1] ==1 ) return mid-1;
        else if(mat[mid] == 0&& mat[mid-1] == 0) return countSoldiersByBST(begin, mid-1, mat);
        return 0;
    }

    private void pushValuesToLeft(int[] leastSoldiersInRows, int fromRow) {
        for (int i = fromRow; i >= 1 ; i--) {
            leastSoldiersInRows[ i-1 ] = leastSoldiersInRows[i] ;
        }
    }


}
