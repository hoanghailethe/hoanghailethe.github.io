import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class _771JewelsandStones {

  public static int numJewelsInStones(String jewels, String stones) {
    Map<Character, Integer> myMap = new HashMap<>();
    int count = 0;
    for (char c : jewels.toCharArray()) {
      if (myMap.containsKey(c) == false) {
        myMap.put(c, 1);
      } else if (myMap.containsKey(Character.toUpperCase(c)) == false) {
        myMap.put(Character.toUpperCase(c), 1);
      }
    }
    for (char c : stones.toCharArray()) {
      if (myMap.containsKey(c)) {
        count++;
      }
    }

    return count;
  }

  public static void main(String[] args) {
    String jewels = "zAb";
    String stones = "ZzaB";
    System.out.println(numJewelsInStones(jewels, stones));
  }
}
