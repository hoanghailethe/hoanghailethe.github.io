
public class _844_BackspaceStringCompare {
    public static boolean backspaceCompare3(String s, String t) {
        StringBuilder s1 = getString(s);
        StringBuilder t1 = getString(t);
        return s1.toString().equals(t1.toString());
    }

    private static StringBuilder getString(String s) {
        StringBuilder str = new StringBuilder();
        int temp = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == '#') {
                temp++;
            } else if (temp > 0) {
                temp--;
            } else {
                str.append(c);
            }
        }
        return str;
    }
    public static void main(String[] args) {
        String s = "a#casg#";
        String t = "jakhsdkj#####aeeh";
        System.out.println(backspaceCompare3(s, t));
    }
}
