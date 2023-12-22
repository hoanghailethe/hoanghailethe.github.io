package day04;

public class _344_ReverseString {
    public static void main(String[] args) {

    }

    public void reverseString(char[] s) {
        reverse(s, 0, s.length - 1);
    }

    private void reverse(char[] s, int l, int r) {
        if (l < r) {
            char c = s[l];
            s[l] = s[r];
            s[r] = c;
            reverse(s, l + 1, r - 1);
        }
    }
}
