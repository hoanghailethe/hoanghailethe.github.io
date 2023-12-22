public class _1221leetCode {
    public static void main(String[] args) throws Exception {
        String s = "RLRRLLRLRL";
        balancedStringSplit(s);
    }
    public static int balancedStringSplit(String arr) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length(); i++) {
            if (arr.charAt(i) == 'L') {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                sum++;
            }
        }
        return sum;
    }
}
