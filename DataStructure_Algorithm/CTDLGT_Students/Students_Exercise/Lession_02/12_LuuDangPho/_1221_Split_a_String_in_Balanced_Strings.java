public class _1221_Split_a_String_in_Balanced_Strings {
    public static int balancedStringSplit(String s) {
        int l = 0, r = 0, count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                l++;
            }else {
                r++;
            }
            if (l == r) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "RLRRLLRLRL";
        System.out.println(balancedStringSplit(str));
    }
}
