
public class _844_BackspaceStringCompare {
    public static void main(String[] args) {
        String s = "nzp#o#g";
        String t = "b#nzp#o#g";

        System.out.println(backspaceCompare3(s, t));
    }

    public static boolean backspaceCompare3(String s, String t) {
        StringBuilder s1 = getString(s);
        StringBuilder t1 = getString(t);
        return s1.toString().equals(t1.toString());
    }

    private static StringBuilder getString(String s) {
        StringBuilder res = new StringBuilder();
        int remember = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == '#') {
                remember++;
            } else if (remember > 0) {
                remember--;
            } else {
                res.append(c);
            }
        }
        return res;
    }
}
