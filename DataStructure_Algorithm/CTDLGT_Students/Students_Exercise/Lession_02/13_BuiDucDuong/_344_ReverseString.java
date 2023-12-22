public class _344_ReverseString {
    public void reverseString(char[] s) {
        int n = s.length - 1;
        for (int i = 0; i < s.length / 2; i++) {
            char c = s[i];
            s[i] = s[n - i];
            s[n - i] = c;
        }
    }
}
