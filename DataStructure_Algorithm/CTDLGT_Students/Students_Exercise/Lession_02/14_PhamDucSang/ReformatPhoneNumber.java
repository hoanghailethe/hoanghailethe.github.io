public class ReformatPhoneNumber {
    public static String reformatNumber(String number) {
        number = number.replaceAll("-| ","");
        StringBuilder newNumber = new StringBuilder();
        while (number.length() != 0) {
            if(number.length() > 4 || number.length() == 3) {
                newNumber.append(number, 0, 3).append("-");
                number = number.substring(3);
            } else {
                newNumber.append(number, 0, 2).append("-");
                number = number.substring(2);
            }
        }

        return newNumber.substring(0, newNumber.length()-1);
    }

    public static void main(String[] args) {
        String number = "--17-5 229 ";
        System.out.println(reformatNumber(number));
    }
}
