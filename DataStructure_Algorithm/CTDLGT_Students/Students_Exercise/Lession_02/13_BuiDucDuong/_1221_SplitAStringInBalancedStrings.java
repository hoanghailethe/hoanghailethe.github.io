public class _1221_SplitAStringInBalancedStrings {
    public static void main(String[] args) {

    }

    public int balancedStringSplit(String s) {
        int l_Count = 0;
        int r_Count = 0;
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                r_Count++;
            } else {
                l_Count++;
            }
            if (r_Count == l_Count) {
                res++;
            }
        }
        return res;
    }
}
