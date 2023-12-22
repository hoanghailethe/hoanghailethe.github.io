
public class _1694bt {
    public static void main(String[] args) {
        String nums = "123-1";
        reformatNumber(nums);
    }

    public static String reformatNumber(String number) {
        number = number.replace("-", "");
        number = number.replace(" ", "");
        if (number.length() <= 3) {
            return number;
        }
        StringBuilder number1 = new StringBuilder();
        if (number.length() % 3 == 0) {
            while (number.length() > 3) {
                number1.append(number.substring(0, 3));
                number1.append("-");
                number = number.substring(3);
                if (number.length() == 3) {
                    break;
                }
            }
            number1.append(number.substring(number.length() - 3));
        }
        if (number.length() % 3 == 2) {
            while (number.length() > 4) {
                number1.append(number.substring(0, 3));
                number1.append("-");
                number = number.substring(3);
                if (number.length() == 2) {
                    break;
                }
            }
            number1.append(number.substring(number.length() - 2));
        }

        if (number.length() % 3 == 1) {
            while (number.length() > 4) {
                number1.append(number.substring(0, 3));
                number1.append("-");
                number = number.substring(3);
                if (number.length() == 4) {
                    break;
                }
            }
            number1.append(number.substring(number.length() - 4, number.length() - 2));
            number1.append("-");
            number1.append(number.substring(number.length() - 2));

        }

        return number1.toString();
    }
}