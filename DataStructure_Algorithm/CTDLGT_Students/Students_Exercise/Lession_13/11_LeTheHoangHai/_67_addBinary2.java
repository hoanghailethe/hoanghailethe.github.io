public class _67_addBinary2 {
    public static String addBinary(String a, String b) {
        char[] aa = a.toCharArray();
        char[] bb = b.toCharArray();

        int aleng = aa.length;
        int bleng = bb.length;

        int aDecimal = 0;
        int bDecimal = 0;

        for(int i = 0; i < aleng; i++) {
            int add;
            add = aa[i] == '1' ? 1 : 0;
            aDecimal += add*(Math.pow(2,aleng-1-i));
        }
        for(int i = 0; i < bleng; i++) {
            int add;
            add = bb[i] == '1' ? 1 : 0;
            bDecimal += add*(Math.pow(2,bleng-1-i));
        }

        Integer sum = aDecimal + bDecimal;

        //convert to Binary String
        StringBuilder binaryNumber = new StringBuilder();
        Integer c = sum;

        while (c > 0) {
            int remainder = c % 2;
            binaryNumber.append(remainder);
            c /= 2;
        }

        binaryNumber = binaryNumber.reverse();
        return binaryNumber.toString();
    }

    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(addBinary(a, b));
    }
}
