import java.util.*;

class _409LongestPalindrome {

  public static int longestPalindrome(String s) {
    if (s.length() == 0) {
      return 0;
    }
    Set<Character> mySet = new HashSet<>();
    int count = 0;
    for (char ch : s.toCharArray()) {
      if (mySet.remove(ch)) {
        count++;
      } else {
        mySet.add(ch);
      }
    }
    return mySet.isEmpty() ? count * 2 : count * 2 + 1;
  }

  public static void main(String[] args) {
    String s = "bb";
    System.out.println(longestPalindrome(s));
  }
}
