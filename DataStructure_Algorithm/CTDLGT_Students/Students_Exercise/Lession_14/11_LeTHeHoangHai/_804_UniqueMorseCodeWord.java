import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class _804_UniqueMorseCodeWord {
    public int uniqueMorseRepresentations(String[] words) {
        char[] letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        String[] morseCode = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        Map<Character, String> dic = new HashMap<>();
        for (int i = 0; i < letters.length;i++) {
            dic.put(Character.toLowerCase(letters[i]), morseCode[i]);
        }

        String[] trans2Morse = new String[words.length];

        for (int i =0; i < words.length; i++) {       
            String a = words[i];
            StringBuilder morse = new StringBuilder();

            for(int j = 0; j < a.length(); j++) {

                char b = a.charAt(j);
                morse.append(dic.get(b)) ;

            }
            trans2Morse[i] = morse.toString();
        }

        Set<String> result = new HashSet();
        for (String string : trans2Morse) {
            result.add(string);
        }

        return result.size();

    }
}
