public class _1694ReformatPhoneNumber {
    public static String reformatNumber(String number) {
        String str = number.replace("-", "").replace(" ", "");
        String result = "";
        if (str.length() <= 3)
            result += str;
        else if (str.length() == 4)
            result = str.substring(0, 2) + "-" + str.substring(2);
        else {
            String last4Digits = "";
            if (str.length() % 3 == 1) {
                last4Digits = str.substring(str.length() - 4, str.length() - 2) + "-" + str.substring(str.length() - 2);
            }
            if (str.length() % 3 == 2) {
                last4Digits = str.substring(str.length() - 2);
            }
            if (str.length() % 3 == 0) {
                last4Digits = str.substring(str.length() - 3);
            }
            System.out.println(str.length());
            for (int i = 0; i < str.length() - 4; i = i + 3) {
                result += str.substring(i, i + 3) + "-";
            }
            result += last4Digits;
        }

        return result;
    }

    public static void main(String[] args) {
        String number = "--17-5 229 35-39475 525123";
        System.out.println(number);
        System.out.println(reformatNumber(number));
    }
}