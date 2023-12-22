import java.util.HashSet;
import java.util.Set;

class _771JewelsandStones {
    public static int numJewelsInStones(String jewels, String stones) {
        Set<Character> myJewels = new HashSet<>();
        char[] myStones = new char[stones.length()];

        for (int i = 0; i < jewels.length(); i++) {
            myJewels.add(jewels.charAt(i));
        }

        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            myStones[i] = stones.charAt(i);
        }
        for (int i = 0; i < myStones.length; i++) {
            if (myJewels.contains(myStones[i])) {
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        String jewels = "zZA";
        String stones = "zAABB";

        System.out.println(numJewelsInStones(jewels, stones));
        

    }
}