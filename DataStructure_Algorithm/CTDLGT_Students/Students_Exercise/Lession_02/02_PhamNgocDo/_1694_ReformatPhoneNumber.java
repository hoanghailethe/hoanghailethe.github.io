class _1694_ReformatPhoneNumber{
    public static String Result(String result, String message){
        if(result.isEmpty()){
            result+= message;
        }
        else result=result+ "-"+message;
        return result;
    }
    public static String reformatNumber(String number){
        String result="";
        number=number.replace(" " ,"");
        number=number.replace("-","");
        int i =0 ;
        while(i<number.length()){
            int k = number.length()-i;
            if(k==2 || k ==4){
                result = Result(result, number.substring(i, i+2));
               i+=2;
            }
            else {
                result = Result(result, number.substring(i, i+3));
                i+=3;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(reformatNumber("--17-5 229 35-39479 "));
    }
}