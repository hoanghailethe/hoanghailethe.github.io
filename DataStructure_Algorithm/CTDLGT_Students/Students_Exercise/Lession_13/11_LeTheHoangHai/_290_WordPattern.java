import java.util.HashSet;
import java.util.Set;

public class _290_WordPattern {
    public boolean wordPattern(String pattern, String s) {    
        String[] holder = new String[150];
        char[] patChars = pattern.toCharArray();
        String[] value = s.split(" ");

        int a = patChars.length;
        int b = value.length;

        Set<String> added = new HashSet<>();

        if(a != b) return false;

        for (int i = 0; i < a; i++) {
            char c = patChars[i];

            //if the fisrt time => add
            if (holder[c] == null) {
                holder[c] = value[i];
                //already added this result => duplicate value
                if(added.contains(value[i])) return false;
                added.add(value[i]);
            } else {
                //not equal the previous add
                if (!holder[c].equals(value[i])) return false;
            }
        }

        return true;
    }
}
