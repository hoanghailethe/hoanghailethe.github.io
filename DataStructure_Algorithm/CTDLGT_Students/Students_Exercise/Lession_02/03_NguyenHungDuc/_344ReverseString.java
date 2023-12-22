class _344ReverseString {
    public static void reverseString(char[] s) {
        int j = s.length - 1;
        for (int i = 0; i < j; i++, j--) {
            char temp = s[j];
            s[j] = s[i];
            s[i] = temp;
        }
        System.out.println(s);
        
    }
    public static void main(String[] args) {
        char[] s = { 'h', 'e', 'l', 'l', 'o' };
        
        reverseString(s);
    }
}