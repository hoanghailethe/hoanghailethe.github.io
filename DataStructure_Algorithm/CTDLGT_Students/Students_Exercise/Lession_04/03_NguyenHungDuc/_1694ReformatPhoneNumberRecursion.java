class _1694ReformatPhoneNumberRecursion {
    static String str ="";
    public static String reformatNumber(String number) {
        
        str = number.replaceAll("[- ]", "");
        int length = str.length(); 

        if (length <= 3) {
            return str;
        }else if(length==4){
            return str = str.substring(0, 2) + "-" + str.substring(2, 4);
        }else{
            str = str.substring(0, 3) + "-"+ reformatNumber(str.substring(3));
        }

        return str;
        
    }
    public static void main(String[] args) {
        String number = "1-23-45 6";
        System.out.println(reformatNumber(number));

    }
}