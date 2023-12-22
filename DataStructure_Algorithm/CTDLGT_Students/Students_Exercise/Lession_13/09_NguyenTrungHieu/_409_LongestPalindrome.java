import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _409_LongestPalindrome {
    public static int longestPalindrome(String s) {
        int result = 0;
        boolean check = false;
        // Map<Character, Integer> myMap = new HashMap<>();
        // for (int i = 0; i < s.length(); i++) {
        //     if (!myMap.containsKey(s.charAt(i))) {
        //         myMap.put(s.charAt(i), 1);
        //     } else {
        //         int count = myMap.get(s.charAt(i));
        //         myMap.put(s.charAt(i), count + 1);
        //     }
        // }

        // for (Map.Entry entry : myMap.entrySet()) {
        //     if (myMap.get(entry.getKey()) % 2 == 0) {
        //         result += (int) entry.getValue();
        //         // continue;
        //     } else if ((int) entry.getValue() >= 1) {
        //         result += (int) entry.getValue() - 1;
        //         check = true;
        //     }
        // }

        int[] count = new int[123];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }
        for (int i = 0; i < count.length; i++) {
            if(count[i] % 2 == 0){
                result += count[i];
            } else if(count[i] >=1){
                result += count[i] - 1;
                check = true;
            }
        }
        return check ? result + 1 : result;
    }

    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));
    }
}
