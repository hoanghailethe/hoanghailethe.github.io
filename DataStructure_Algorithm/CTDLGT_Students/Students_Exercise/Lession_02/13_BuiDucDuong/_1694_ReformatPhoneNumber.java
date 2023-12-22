public class _1694_ReformatPhoneNumber {
    public static void main(String[] args) {
        String number = "1-23-45 6";
        System.out.println(reformatNumber(number));
    }

    public static String reformatNumber(String number) {
        number = number.replace(" ", "");
        number = number.replace("-", "");
        StringBuilder res = new StringBuilder();
        int i = 0;
        while (i < number.length()) {
            int k = number.length() - i;
            if (k == 2 || k == 4) {
                i = appendString(res, number, i, i + 2);
            } else {
                i = appendString(res, number, i, i + 3);
            }
        }
        return res.toString();
    }

    private static int appendString(StringBuilder res, String number, int i, int j) {
        if (res.length() == 0) {
            res.append(number.substring(i, j));
        } else {
            res.append("-");
            res.append(number.substring(i, j));
        }
        return j;
    }
}