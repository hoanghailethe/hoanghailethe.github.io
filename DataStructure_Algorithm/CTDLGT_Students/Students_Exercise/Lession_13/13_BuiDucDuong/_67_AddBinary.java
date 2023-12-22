package day10;

public class _67_AddBinary {
    public static void main(String[] args) {
        String a = "1111";
        String b = "1111";

        System.out.println(addBinary(a, b));
    }

    /**
     * 1 ms
     * 
     * 39.2 MB
     * 
     * 100.00%
     */
    public static String addBinary(String a, String b) {
        char[] aArr = a.toCharArray();
        char[] bArr = b.toCharArray();
        int i = aArr.length - 1;
        int j = bArr.length - 1;
        int n = i > j ? i + 5 : j + 5;
        char[] res = new char[n + 1];
        int remember = 0;
        while (i >= 0 || j >= 0 || remember != 0) {
            int numA = i >= 0 ? aArr[i] - '0' : 0;
            int numB = j >= 0 ? bArr[j] - '0' : 0;

            int sum = remember + numA + numB;
            if (sum <= 2) {
                res[n] = (char) (sum % 2 + '0');
                remember = sum / 2;
            } else {
                res[n] = '1';
                remember = 1;
            }
            n--;
            i--;
            j--;
        }

        String s = String.valueOf(res, n + 1, res.length - 1 - n);
        return s;
    }
}
