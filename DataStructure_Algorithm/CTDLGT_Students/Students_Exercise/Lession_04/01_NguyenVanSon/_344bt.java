import java.util.Arrays;

public class _344bt {
    public static void main(String[] args) {
        String[] s = { "h", "e", "l", "n", "o", "g", "b", "k", "l" };
        int i = 0;
        reverseString(s, i);
        System.out.println(Arrays.toString(s));
    }

    public static void reverseString(String[] s, int i) {
       
        if (i < s.length / 2 ) {
            String a = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = a;
            i++;
            reverseString(s, i);
        }

    }
}
