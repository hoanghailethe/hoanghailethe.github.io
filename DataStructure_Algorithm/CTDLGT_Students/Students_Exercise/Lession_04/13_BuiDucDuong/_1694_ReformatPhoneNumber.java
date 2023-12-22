package day04;

public class _1694_ReformatPhoneNumber {
    public static void main(String[] args) {
        String number = "1-23-45 6";
        System.out.println(reformatNumber(number));
    }

    public static String reformatNumber(String number) {
        number = number.replace("-", "");
        number = number.replace(" ", "");
        StringBuilder res = new StringBuilder();
        reformatNumber(res, number);
        return res.toString();
    }

    private static void reformatNumber(StringBuilder res, String number) {
        if (res.length() != 0 && number.length() != 0) {
            res.append("-");
        }
        if (number.length() == 4 || number.length() == 2) {
            res.append(number.substring(0, 2));
            reformatNumber(res, number.substring(2));
        } else if (number.length() >= 3) {
            res.append(number.substring(0, 3));
            reformatNumber(res, number.substring(3));
        }
        return;
    }
}
