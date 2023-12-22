public class _997_findTheTown {
    public static int findJudge(int N, int[][] trust) {        
            //count trust of EACH PERSON
            int[] trustedOfEach = new int[N+2];
            
            //trust each person have in other Other
            int[] trustInOthers = new int[N+2];
    
            for (int i = 0; i < trust.length ; i++) {
                //trust[i][1] hold the index of the the person been Trusted
                trustedOfEach[trust[i][1]]++;
    
                //the Index of one who trust
                trustInOthers[trust[i][0]]++;               
            }
    
            for( int i = 1; i <= N; i++) {
                if(trustedOfEach[i] == N-1 &&trustInOthers[i] == 0) return i;
            }
    
            return -1;
        }
    
        public static void main(String[] args) {
            int N = 2;
            int[][] trust = {{1,2}};
            System.out.println(findJudge(N, trust)); 
        }
    
    }
}
