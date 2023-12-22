class _459RepeatedSubstringPattern {
    public static boolean repeatedSubstringPattern(String s) {
        if (s.length() < 2) {
            return false;
        }
        String str = s + s;
        str = str.substring(1, str.length() - 1);

        return str.contains(s);
    }
    public static void main(String[] args) {
        String s = "abab";
        System.out.println(repeatedSubstringPattern(s));
    }
}