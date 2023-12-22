import java.util.HashSet;
import java.util.Set;

public class JewelsandStones {
    public int numJewelsInStones(String J, String S) {
	
        if(S == null || S.length() == 0)
        {
            return 0;
        }
        
        if(J == null || J.length() ==0)
        {
            return 0;
        }
         
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i< J.length(); i++)
        {
            char c = J.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);
        }
        
        int result = 0;
        for(int i = 0;i <S.length(); i++)        
        {
            if(map.get(S.charAt(i)) != null)
            {
                result++;
            }
        }
        return result;
    
}
