import java.util.HashSet;
import java.util.Set;

public class _771_JewelsAndStones {
    public static void main(String[] args) {

    }

    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        for (char c : jewels.toCharArray()) {
            set.add(c);
        }

        int count = 0;
        for (char c : stones.toCharArray()) {
            if (set.contains(c)) {
                count++;
            }
        }
        return count;
    }
}
