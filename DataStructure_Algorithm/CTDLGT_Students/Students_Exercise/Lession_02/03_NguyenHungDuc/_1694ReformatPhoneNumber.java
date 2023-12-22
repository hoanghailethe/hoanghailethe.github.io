class _1694ReformatPhoneNumber {
    public static String reformatNumber(String number) {
        number = number.replaceAll("[- ]", "");
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < number.length() - 4) {
            sb.append(number.substring(i, i + 3)).append("-");
            i += 3;
        }
        if (number.length() - i == 4) {
            sb.append(number.substring(i, i + 2)).append("-");
            i += 2;
        }
        sb.append(number.substring(i));
        System.out.println(sb);

        return sb.toString();

    }
    public static void main(String[] args) {
        String number = "123 4-567 8 9";
        reformatNumber(number);
    }
}
// Dưới là cách 2
// public class reformatNumber {

//     public static StringBuilder merge(StringBuilder result, String newNumber)
//     {
//         if(result.length() == 0){
//             result.append(newNumber);
//         }else{
//             result.append("-");
//             result.append(newNumber);
//         }
//         return result;
//     }

//     public static String reformatNumber(String s) {
//         StringBuilder result = new StringBuilder();

//         s = s.replace(" ", "");
//         s = s.replace("-", "");

//         int i = 0;
//         while(i < s.length())
//         {
//             int k = s.length() - i;
//             // Xuly dac biet
//             if(k == 2 || k == 4){
//                 result =  merge(result, s.substring(i, i+2));
//                 i += 2;
//             }else{ // Xử lý thong thuơngf
//                 result =  merge(result, s.substring(i, i+3));
//                 i += 3;
//             }   
//         }

//         return result.toString();
//     }

//     public static void main(String[] args) {
//         String number = "1-23-45 67";
//         System.out.println(reformatNumber(number));
//     }
// }