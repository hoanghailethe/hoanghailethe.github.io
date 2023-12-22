import java.util.HashMap;
import java.util.Map;

public class _387_FirstUniqueCharater {

    //Use MAP -Key-Value
    public int firstUniqChar(String s) {
        Map <Character, Integer> charTime = new HashMap<>();

        for(int i = 0; i< s.length(); i++) {
            char a = s. charAt(i);
            if (charTime.containsKey(a) == false) {
                charTime.put(a, 1);
            } else {
                int time = charTime.get(a) + 1;
                charTime.put(a, time);
            }
        } 

        for (int i = 0; i< s.length(); i++) {
            char a = s. charAt(i);
            if (charTime.get(a) == 1) return i;
        }
        return -1;
    }
}
