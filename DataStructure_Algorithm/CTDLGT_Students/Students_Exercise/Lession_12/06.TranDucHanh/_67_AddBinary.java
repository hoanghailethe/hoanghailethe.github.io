public class _67_AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder sum = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int temp = 0;
        while (i >= 0 || j >= 0) {
            int val1 = i < 0 ? 0 : a.charAt(i) - '0';
            int val2 = j < 0 ? 0 : b.charAt(j) - '0';
            int digit = val1 + val2 + temp;
            if (digit >= 2) {
                temp = 1;
                digit = digit - 2;
            } else {
                temp = 0;
            }
            sum.append(digit);
            i--;
            j--;
        }
        if (temp == 1) {
            sum.append(temp);
        }
        return sum.reverse().toString();
    }
}