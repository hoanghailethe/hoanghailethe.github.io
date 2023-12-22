package day10;

import java.util.HashMap;
import java.util.Map;

public class _409_LongestPalindrome {

    /**
     * 40.52%
     * 
     * 5 ms
     * 
     * 37.5 MB
     */
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        boolean haveLonelyChar = false;
        int count = 0;
        for (Map.Entry<Character, Integer> set : map.entrySet()) {
            if (set.getValue() % 2 != 0) {
                haveLonelyChar = true;
            }
            count += set.getValue() / 2 * 2;
        }
        if (haveLonelyChar) {
            count += 1;
        }
        return count;
    }
}
