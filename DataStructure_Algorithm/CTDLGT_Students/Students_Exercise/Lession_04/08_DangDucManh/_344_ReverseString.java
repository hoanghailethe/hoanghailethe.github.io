import java.util.Arrays;

public class _344_ReverseString {
    public static void reverseString(char[] s, int l, int r) {
        // System.out.println(Arrays.toString(s));
        if (l < r) {
            char t = s[l];
            s[l] = s[r];
            s[r] = t;
            reverseString(s, l + 1, r - 1);
        }
    }
    
    public static void main(String[] args) {
        char[] s = { 'h', 'e', 'l', 'l', 'o' };
        char[] s2 = { '1', '2', '3', '4', '5', '6' };

        reverseString(s, 0, s.length-1);
        reverseString(s2, 0, s2.length-1);

        System.out.println(Arrays.toString(s));
        System.out.println(Arrays.toString(s2));
    }
}
