import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _187_Repeat3 {
    public List<String> findRepeatedDnaSequences(String s) {
        int n = s.length();
        Set<String> seqs = new HashSet<>(n * 2);
        Set<String> result = new HashSet<>();
        for (int i = 10; i <= n; i++) {
            String word = s.substring(i - 10, i);
            if (!seqs.add(word)) {
                result.add(word);
            }
        }
        return new ArrayList<>(result);
    }
}
