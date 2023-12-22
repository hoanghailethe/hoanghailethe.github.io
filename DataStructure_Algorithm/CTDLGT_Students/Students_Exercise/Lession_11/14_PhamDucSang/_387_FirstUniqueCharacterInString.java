package aps.leetcodes;

import java.util.HashMap;
import java.util.Map;

public class _387_FirstUniqueCharacterInString {
    public int firstUniqChar(String s) {
        Map<Character, Integer> characterMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (characterMap.containsKey(s.charAt(i))) {
                characterMap.put(s.charAt(i), characterMap.get(s.charAt(i)) + 1);
            } else {
                characterMap.put(s.charAt(i), 1);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (characterMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
