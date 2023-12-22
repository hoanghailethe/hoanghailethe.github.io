public class _344_Reverse_String {
    public static void reverseString(char[] s) {
        char temp = 's';
        // Jim: Good!
        for (int i = 0; i < s.length / 2; i++) {
            temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        char[] s = { 'H', 'a', 'n', 'n', 'a', 'h' };
        reverseString(s);
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
    }
}