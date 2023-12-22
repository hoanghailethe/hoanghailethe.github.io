public class _chua1694_phoneReformat {
    public static String reformatNumber (String number) {
        //123
        StringBuilder result = new StringBuilder();
        number = number.replace(" ", "");
        number = number.replace("-", "");

        for (int i =0; i<number.length(); i++) {
            int k = number.length()-i;
            if (k <= 4) {
                if(k==2 || k ==4) {
                    result.append(number.substring(i, i+2));
                    result.append("-");
                    i += 1;
                } else {
                    result.append(number.substring(i,i+3)) ;
                    break;
                }
            } else {// take 0,1,2
                // xu ly thong thuong
                result.append(number.substring(i,i+3)) ;
                result.append("-");
                i += 2;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String number = "1-23-45 6";
        System.out.println(reformatNumber(number));
    }
}
