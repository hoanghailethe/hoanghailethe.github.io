package anhdv.set;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author anhdv
 */
public class _771_JewelsAndStones {

    static int numJewelsInStones(String jewels, String stones) {
        
        int res = 0;
        
        Map<Character, Integer> map = new HashMap<>();
        for( int i = 0; i < jewels.length(); i++ ) {
            map.put(jewels.charAt(i), 0);
        }
        
        for( int j = 0; j < stones.length(); j++ ) {
            if( map.containsKey(stones.charAt(j)) )
                res++;
        }
        
        return res;
    }

    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println("res: " + numJewelsInStones(jewels, stones));
    }
}
