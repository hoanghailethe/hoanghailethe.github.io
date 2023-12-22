public class SplitStringInBalancedStrings {
    public static int balancedStringSplit(String s) {
        int sum = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
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
