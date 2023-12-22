public class _344ReverseString {
    public static void reverseString(char[] s) {
        int n = s.length;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            char x = s [i];
            s[i] = s[j];
            s[j] = x;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        char[] s = { 'h', 'e', 'l', 'l', 'o' };
        reverseString(s);
        System.out.println(s);
        

    }
}
