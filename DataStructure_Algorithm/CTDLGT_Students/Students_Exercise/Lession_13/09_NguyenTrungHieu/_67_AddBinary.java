public class _67_AddBinary {
    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int temp = 0;
        StringBuilder s1 = new StringBuilder(a);
        StringBuilder s2 = new StringBuilder(b);
        if (s1.length() >= s2.length()) {
            while(s1.length() != s2.length()) {
                s2.insert(0, '0');
            }
        } else {
            while(s1.length() != s2.length()) {
                s1.insert(0, '0');
            }
        }
        int i = s1.length() - 1;
        int j = s2.length() - 1;

        while (i >= 0 && j >= 0) {
            if (s1.charAt(i) + s2.charAt(j) + temp == 96) {
                result.insert(0, '0');
            } else if (s1.charAt(i) + s2.charAt(j) + temp == 97) {
                result.insert(0, '1');
                if (temp == 1) {
                    temp--;
                }
            } else if (s1.charAt(i) + s2.charAt(j) + temp == 98) {
                result.insert(0, '0');
                temp = 1;
            } else if (s1.charAt(i) + s2.charAt(j) + temp == 99) {
                result.insert(0, '1');
            }
            i--;
            j--;
        }

        if (temp == 1) {
            result.insert(0, '1');
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        String b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
        String a1 = "100";
        String b1 = "110010";
        System.out.println(addBinary(a1, b1));
        // 0+0 = 96 = '`'
        // 0+1 = 97 = 'a'
        // 1+1 = 98 = 'b'

    }
}
