import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _187_RepeatHashMap {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String, Integer> hp = new HashMap<>();
        // hashmap to contains all substring of 10 length and frequency map
        for (int i = 0; i + 10 <= s.length(); i++) {
            String temp = s.substring(i, i + 10);
            hp.put(temp, hp.getOrDefault(temp, 0) + 1);
        }

        List<String> ans = new ArrayList<>();
        for (String ss : hp.keySet()) {
            if (hp.get(ss) > 1)
                ans.add(ss);
        }
        // traverse in map and string with greater freq can be stored
        return ans;
    }
}
