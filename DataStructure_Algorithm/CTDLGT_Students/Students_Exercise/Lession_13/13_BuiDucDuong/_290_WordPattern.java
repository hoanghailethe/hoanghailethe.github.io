package day10;

import java.util.HashMap;
import java.util.Map;

public class _290_WordPattern {
    /**
     * 1 ms
     * 
     * 37.1 MB
     * 
     * 79.64%
     */
    public boolean wordPattern(String pattern, String s) {
        String[] strings = s.split(" ");
        char[] arr = pattern.toCharArray();
        if (strings.length != arr.length) {
            return false;
        }
        Map<String, Character> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(strings[i])) {
                if (!(map.get(strings[i]) == arr[i])) {
                    return false;
                }
            } else {
                if (map.containsValue(arr[i])) {
                    return false;
                }
                map.put(strings[i], arr[i]);
            }
        }
        return true;
    }
}
