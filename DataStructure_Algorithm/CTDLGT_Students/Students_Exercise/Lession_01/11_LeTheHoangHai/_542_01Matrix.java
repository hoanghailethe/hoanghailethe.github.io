public class _542_01Matrix {
    public static int[][] updateMatrix(int[][] mat) {

        
            for(int i = 0, a= mat.length; i < a ; i++) {
                for(int j = 0, b = mat[0].length; j < b; j++) {
                    
                    if(mat[i][j] == 1 ) {
                        mat[i][j] = -1;
                    }                
                }
            }
            
            for(int i = 0, a= mat.length; i < a ; i++) {
                for(int j = 0, b = mat[0].length; j < b; j++) {                  
                    if(mat[i][j] == -1 ) {
                        DFS(i, j ,mat, a , b);
                    }                   
                }
            }
            return mat;
        }
        
        static int[][] xy = new int[1000][1000];
        
        
        private static void DFS(int i, int j, int[][] mat, int a, int b) {
            if(i == a || i == -1 || j ==b || j == -1) {
                return;
            } 
            
            if(mat[i][j] != -1 || xy[i][j] == 1 ) return;
            
            else 
            {
                xy[i][j]++;
                    
                DFS(i+1, j,mat, a, b);
                DFS(i-1, j,mat, a, b);
                DFS(i, j+1,mat, a, b);
                DFS(i, j-1,mat, a, b);
                
                xy[i][j]--;
                
               mat[i][j] = findMin( valueOf(i,j+1,mat,a,b), valueOf(i+1,j,mat,a,b) ,valueOf(i-1,j,mat,a,b),valueOf(i,j-1,mat,a,b))+1; 
                
            } 
        }
        
        private static int valueOf(int i, int j, int[][] mat, int a, int b) {
            if(i == a || i == -1 || j ==b || j == -1) return Integer.MAX_VALUE;
            else return mat[i][j];
        }
        
        private static int findMin(int one, int two, int three, int four){
            
            return Math.min(  Math.min(one, two) , Math.min(three, four)  );
            
        }

    public static void main(String[] args) {
        int[][] test = { { 0, 0, 0 }, { 0, 1, 0 }, { 1, 1, 1 } };
        System.out.println(updateMatrix(test));
    }
}
