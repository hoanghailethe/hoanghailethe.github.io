public class _1694_PhoneFormat_recursion {
    public static String filterNumber(String number) {
        // 123
        
        number = number.replace(" ", "");
        number = number.replace("-", "");
        return reformatNumber(number);
        
    }

    public static  String reformatNumber(String number) {
        StringBuilder result = new StringBuilder();
        if (number.length() == 4) {
            result.append(number.substring(0, 2) + '-' + number.substring(2));
        } else if (number.length() == 2 || number.length() == 3) {
            result.append(number);
        } else {
            result.append(number.substring(0, 3) + "-" + reformatNumber(number.substring(3)));
        }
        return result.toString();
    }
}
