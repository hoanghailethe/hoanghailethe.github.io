public class _1698ReformatPhoneNumber {
    public static String reformatNumber(String number) {
        if (number.length() <= 2) {
            return number;
        }
        number = number.replace("-", "");
        number = number.replace(" ", "");

        StringBuilder sb = new StringBuilder();

        while (number.length() > 0) {
            if (number.length() == 2) {
                sb.append(number.substring(0, 2)).append("-");
                break;
            }

            if (number.length() == 4) {
                sb.append(number.substring(0, 2));
                sb.append("-");
                sb.append(number.substring(2, 4));
                sb.append("-");
                break;

            }

            sb.append(number.substring(0, 3)).append("-");
            number = number.substring(3);
        }

        return sb.delete(sb.length() - 1, sb.length()).toString();

    }

    public static void main(String[] args) {
        String num = "1-23-45 6";
        System.out.println(reformatNumber(num));
    }
}
