import java.util.HashSet;
import java.util.Set;

public class _771_JewelsAndStones {
    public static int numJewelsInStones(String jewels, String stones) {
        int result = 0;
        Set<Character> mySet= new HashSet<>();
        for (int i = 0; i < jewels.length(); i++) {
            mySet.add(jewels.charAt(i));
        }
        for (int i = 0; i < stones.length(); i++) {
            if(mySet.contains(stones.charAt(i))){
                result++;
            }
        }
        return result;    
    }

    public static void main(String[] args) {
        String jewels = "z";
        String stones = "ZZzzzzzzzzzzzzzzzzzz";
        System.out.println(numJewelsInStones(jewels, stones));
    }
}
