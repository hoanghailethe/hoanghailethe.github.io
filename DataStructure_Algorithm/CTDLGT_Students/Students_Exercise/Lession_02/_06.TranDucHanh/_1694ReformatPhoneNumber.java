public class _1694ReformatPhoneNumber {
    public static String reformatNumber(String number) {
        String s = number.replace("-","").replace(" ", "");
        // Jim: Hơi nhiều vòng for, cần tối ưu lại code 
        // Cố gắng, ngắn gọn + Dễ hiểu 
        StringBuilder newNumber = new StringBuilder(s);
        if (s.length()%3 == 0 ){
          for (int i = newNumber.length()-3;i>=3;i-=3){
            newNumber.insert(i, '-');
          }
        }
        if (s.length()%3 == 1 ){
            newNumber.insert(newNumber.length()-2, "-");
            for (int i = newNumber.length()-5;i>=3;i-=3){
                newNumber.insert(i, '-');
            }
          }
        if(s.length()%3 ==2){
            for (int i = newNumber.length()-2;i>=3;i-=3){
                newNumber.insert(i, '-');
            }
        }
        
        return newNumber.toString();
        
    }

    public static void main(String[] args) {
        System.out.println(reformatNumber("aaaaaaaaaaaaaaaaaaaaaaaaa"));
    }
}
