import java.util.HashMap;
import java.util.Map;

public class _387_First_Unique_Character_in_a_String {
    public static int firstUniqChar(String s) {
        Map<Character, Integer> myMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (myMap.containsKey(s.charAt(i)) == false) {
                myMap.put(s.charAt(i), 1);
            } else {
                int soLanXuatHien = myMap.get(s.charAt(i)) + 1;
                myMap.put(s.charAt(i), soLanXuatHien);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (myMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "aabb";
        System.out.println(firstUniqChar(str));
    }
}
