import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class _409_LongestPandrome {
    public static int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();

        char[] sChars = s.toCharArray();
        int result = 0;

        for (char a : sChars) {
            if (!map.containsKey(a)) {
                map.put(a, 1);
            } else {
                map.put(a, map.get(a) + 1);
            }
        }
        Iterator<Map.Entry<Character, Integer>> itr = map.entrySet().iterator();

        while (itr.hasNext()) {
            Map.Entry<Character, Integer> c = itr.next();
            if (c.getValue() % 2 == 0) {
                result += c.getValue();
            } else {
                result += c.getValue() - 1;
            }
        }

        if (result < s.length()) {
            result++;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("ccc"));
    }
}
