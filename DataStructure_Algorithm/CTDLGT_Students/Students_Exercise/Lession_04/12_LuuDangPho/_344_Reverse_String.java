public class _344_Reverse_String {
    public static void reverseString(char[] s, int i, int j) {
        if (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            reverseString(s, i + 1, j - 1);
        }
    }

    public static void main(String[] args) {
        char[] s = {'a', 'b', 'c', 'd', 'e', 'f'};
        reverseString(s, 0, s.length - 1);
        System.out.println(s);
    }
}
