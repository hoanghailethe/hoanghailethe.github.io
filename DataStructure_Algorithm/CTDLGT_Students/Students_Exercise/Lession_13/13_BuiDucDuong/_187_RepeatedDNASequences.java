package day10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _187_RepeatedDNASequences {
    /**
     * 20 ms
     * 
     * 47.6 MB
     * 
     * 40.41%
     */
    private static final int LENGTH_SEQUENCE = 10;

    public List<String> findRepeatedDnaSequences(String s) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length() - LENGTH_SEQUENCE + 1; i++) {
            String key = s.substring(i, i + LENGTH_SEQUENCE);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        List<String> res = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() != 1) {
                res.add(entry.getKey());
            }
        }
        return res;
    }
}
