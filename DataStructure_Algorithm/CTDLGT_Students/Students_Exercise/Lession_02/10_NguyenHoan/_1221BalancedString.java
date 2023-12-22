public class _1221BalancedString {
    public static int balancedStringSplit(String s) {

        // char[] chars = s.toCharArray();
        int R = 0, L = 0, count = 0;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'R')
                R++;
            if (s.charAt(i) == 'L')
                L++;

            if (R == L) {
                count++;
                R = 0;
                L = 0;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String a = "RLRRLLRLRL";
        System.out.println(balancedStringSplit(a));
    }
}
