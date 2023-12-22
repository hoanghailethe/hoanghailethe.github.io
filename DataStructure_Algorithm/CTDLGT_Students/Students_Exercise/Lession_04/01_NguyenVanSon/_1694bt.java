
public class _1694bt {
    public static void main(String[] args) {
        String nums = "5674567456456748362652611111";
        StringBuilder number1 = new StringBuilder();
        reformatNumber(nums, number1);
    }

    public static String reformatNumber(String number, StringBuilder numBuilder) {
        number = number.replace("-", "");
        number = number.replace(" ", "");
        if (number.length() <= 3) {
            numBuilder.append(number);
            return numBuilder.toString();
        }

        if (number.length() == 4) {
            numBuilder.append(number.substring(number.length() - 4, number.length() - 2));
            numBuilder.append("-");
            numBuilder.append(number.substring(number.length() - 2));       
            return numBuilder.toString();
        }

        if (number.length() > 4) {
            numBuilder.append(number.substring(0, 3));
            numBuilder.append("-");
            number = number.substring(3);
            reformatNumber(number, numBuilder);
        }

        return numBuilder.toString();

    }
}