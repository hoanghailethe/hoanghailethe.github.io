import java.util.HashSet;
import java.util.Set;

public class _771_JewelsandStones {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> mySet = new HashSet<>();
        for (int i = 0; i < jewels.length(); i++) {
            mySet.add(jewels.charAt(i));
        }
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            if(mySet.contains(stones.charAt(i))){
                count++;
            }
        }
        return count;
    }
}
