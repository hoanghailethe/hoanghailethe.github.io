import java.util.HashSet;
import java.util.Set;

public class _771JewelsandStones {
    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < jewels.length(); i++) {
            char c1 = jewels.charAt(i);
            set.add(c1);
        }

        for (int i = 0; i < stones.length(); i++) {
            char c2 = stones.charAt(i);
            if (set.contains(c2) == true) {
                count++;
            }
        }

        return count;

    }

    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels, stones));
    }
}
