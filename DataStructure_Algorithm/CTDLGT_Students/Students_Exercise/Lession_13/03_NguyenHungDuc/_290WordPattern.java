import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

class _290WordPattern {

  public static boolean wordPattern(String pattern, String s) {
    Hashtable<Character, String> myTable = new Hashtable<>();
    String[] str = s.split(" ");
    if (str.length != pattern.length()) {
      return false;
    }
    for (int i = 0; i < pattern.length(); i++) {
      char c = pattern.charAt(i);
      if (myTable.containsKey(c) && !myTable.get(c).equals(str[i])) {
        return false;
      } else if (!myTable.containsKey(c) && myTable.contains(str[i])) {
        return false;
      } else {
        myTable.put(c, str[i]);
      }
    }

    return true;
  }

  public static void main(String[] args) {
    String pattern = "abba";
    String s = "dog cat cat fish";
    System.out.println(wordPattern(pattern, s));
  }
}
