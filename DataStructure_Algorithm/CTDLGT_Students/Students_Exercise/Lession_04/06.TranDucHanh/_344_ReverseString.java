public class _344_ReverseString {
    public static char[] reverseString(char[] s, int l, int r) {
        if (l > r) {
            return s;
        }
        char temp = s[l];
        s[l] = s[r];
        s[r] = temp;
        return reverseString(s, l + 1, r - 1);
    }

    public static void main(String[] args) {
        char[] s = { 'H', 'a', 'n', 'n', 'a', 'h' };
        System.out.println(reverseString(s, 0, s.length - 1));
    }
}
