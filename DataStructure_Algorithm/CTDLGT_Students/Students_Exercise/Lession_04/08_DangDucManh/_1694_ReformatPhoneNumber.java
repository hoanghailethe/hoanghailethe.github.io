public class _1694_ReformatPhoneNumber {    
    public static String reformatNumber(String number) { 
        String str = number.replace("-", "").replace(" ", "");

        if(str.length() <= 3) return str.toString();
        if(str.length() == 4) return str.substring(0, 2) + "-" + str.substring(2, 4);

        String result = str.substring(0, 3) + "-" + reformatNumber(str.substring(3));
        
        return result;
    }
    public static void main(String[] args) {
        String number = "123 4-24215-3524422";
        System.out.println(reformatNumber(number));
    }
}
