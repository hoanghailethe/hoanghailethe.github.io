import java.util.HashMap;
import java.util.Map;

public class _1309_Decrypt {
    public static String freqAlphabets(String s) {
        char[] letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        
        Map<Integer, Character> dic = new HashMap<>();
        for (int i = 0; i < letters.length; i++) {
            dic.put(i+1, Character.toLowerCase(letters[i]));
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0 ; i < s.length(); i++) {
            int key;
            int pos = i;
            if (pos >= s.length() - 3 && s.charAt(s.length()-1) != '#') {
                char c =s.charAt(pos);
                key =  Integer.parseInt(String.valueOf(c));  
            } else {
                if( s.charAt(pos+2)  == '#') {
                    key = Integer.valueOf(s.substring(pos, pos+2));
                    i += 2;
                } else {
                    char c =s.charAt(pos);
                    key =  Integer.parseInt(String.valueOf(c));  
                }
            }
            
            result.append(dic.get(key));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "10#11#12";
        System.out.println(freqAlphabets(s));
    }
}
