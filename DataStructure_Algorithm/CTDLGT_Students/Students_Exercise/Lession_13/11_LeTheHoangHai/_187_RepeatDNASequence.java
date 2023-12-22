
import java.util.LinkedList;
import java.util.List;

public class _187_RepeatDNASequence {
    public static List<String> findRepeatedDnaSequences(String s) {

        List<String> result = new LinkedList<>();
        String res = s;

        while (res.length() >= 11) {
            String find = res.substring(0, 10);
            res = res.substring(1);
            if (!result.contains(find)) {
                checkAndAdd(result, res, find);
            }
        }
        return result;
    }

    public static void checkAndAdd (List<String> list, String nextStr, String find) {
        int leng = nextStr.length();

        for (int i = 0; i <= leng - 10; i++) {
            String check = nextStr.substring(i, i + 10);
            if (check.equals(find)) {
                list.add(find);
                return;
            }
        }
    }

    public static void main(String[] args) {
        //String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        String s = "AAAAAAAAAAA";
        System.out.println(findRepeatedDnaSequences(s));        
    }

}
