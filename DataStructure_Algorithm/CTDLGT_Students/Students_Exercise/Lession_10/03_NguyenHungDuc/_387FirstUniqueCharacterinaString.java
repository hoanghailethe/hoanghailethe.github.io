import java.util.HashMap;
import java.util.Map;

class _387FirstUniqueCharacterinaString {
    public static int firstUniqChar(String s) {
        Map<Character, Integer> myMap = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int valueCount = 1;
            if (myMap.containsKey(c) == false) {
                myMap.put(c, valueCount);
            } else {
                valueCount = myMap.get(c) + 1;
                myMap.put(c, valueCount);
            }
        }

        // for (Map.Entry entry : myMap.entrySet()) {
        //     System.out.println(entry.getKey() + " - " + entry.getValue());
        // }
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (myMap.get(c) == 1) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        String s = "aabb";
        System.out.println(firstUniqChar(s));
        

    }
}