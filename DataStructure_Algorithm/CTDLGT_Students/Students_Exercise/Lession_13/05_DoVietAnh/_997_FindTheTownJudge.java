package anhdv.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author anhdv
 */
public class _997_FindTheTownJudge {
    
    static int findJudge(int n, int[][] trust) {
        
        if ( trust.length == 0 )
            return n == 1 ? 1 : -1;
        
        Map<Integer, List> map = new HashMap<>();
        for (int[] t : trust) {
            
            int c = t[0];
            int j = t[1];
            
            if (!map.containsKey(j))
                map.put(j, new ArrayList<>());
            
            map.get(j).add(c);
        }
        
        int label = -1;
        for (int k : map.keySet()) {
            if (map.get(k).size() == n - 1)
                label = k;
        }
        
        for (int k : map.keySet()) {
            if (k == label)
                continue;
            
            if (map.get(k).contains(label))
                return -1;
        }
        
        return label;
    }
    
    public static void main(String[] args) {
        
        int n = 3;
        
        int[][] trust = { {1,3}, {2,3} };
        
        System.out.println("result: " + findJudge(n, trust));
    }
}
