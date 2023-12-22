public class _344_Reverse_String {
    public void reverseString(char[] s) {
        return;
    }

    public static void main(String[] args) {
        char[] s = {'a', 'v', 'c', 'q'};
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left++] = s[right];
            s[right--] = temp;
        }
        System.out.println(s);
    }
}
