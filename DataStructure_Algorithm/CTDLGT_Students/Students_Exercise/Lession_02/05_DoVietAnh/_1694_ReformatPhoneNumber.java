package anhdv;

/**
 *
 * @author anhdv
 */
class _1694_ReformatPhoneNumber {

    public static StringBuilder merge(StringBuilder result, String newNumber)
    {
        if(result.length() == 0){
            result.append(newNumber);
        }else {
            result.append("-");
            result.append(newNumber);
        }
        return result;
    }

    public static String reformatNumber(String s) {
        StringBuilder result = new StringBuilder();

        s = s.replace(" ", "");
        s = s.replace("-", "");

        int i = 0;
        while(i < s.length()) {
            int k = s.length() - i;
            // Xuly dac biet
            if(k == 2 || k == 4){
                result =  merge(result, s.substring(i, i+2));
                i += 2;
            }else{ // Xử lý thong thuơngf
                result =  merge(result, s.substring(i, i+3));
                i += 3;
            }   
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String number = "1-23-45 6";
        System.out.println(reformatNumber(number));
    }
}
