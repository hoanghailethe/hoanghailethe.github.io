public class _1694_Reformat_Phone_Number {
    public static String reformatNumber(String number) {
        String str = number.replace(" ", "").replace("-", "");
        int n = str.length();
        if (n <= 3) {
            return str;
        } else if (n <= 4) {
            return str.substring(0, 2) + "-" + str.substring(2, 4);
        } else {
            str = str.substring(0, 3) + "-" + reformatNumber(str.substring(3, n));
        }
        return str;

    }

    public static void main(String[] args) {
        String str = "123 4-567777777";
        System.out.println(reformatNumber(str));
    }
}
