
public class _394_decodeString_notregex {
    public static String decodeString(String s) { 
        if (s.equals(""))return s;
        int pos = 0;
        int number = 1;
        StringBuilder result = new StringBuilder();
        int beginI = 0;
        int endI = 1;

        int countBrack = 0;

        while (pos < s.length()) {
            if (s.charAt(pos) == '[' ) {
                countBrack++;
                if(countBrack == 1)  {
                    endI = pos;
                    number = Integer.parseInt(s.substring(beginI, endI));
                    beginI = pos + 1;
                }             
            }

            if (s.charAt(pos) == ']') {
                countBrack--;
                if(countBrack == 0) {
                    endI = pos;
                    for (int i = 0; i < number; i++) {
                        result.append(s.substring(beginI, endI));
                    }
                    beginI = pos + 1;
                }
            }
            //check if the string can be converted to nums:              
            if(!Character.isDigit(s.charAt(pos)) && s.charAt(pos) != ']' && s.charAt(pos) != '[' &&countBrack ==0){
                result.append(s.charAt(pos));
                beginI = pos+1;
            } 
            pos++;
        
        }
        String str = result.toString();
 
        while(str.contains("[")) {
            str = decodeString(str);
        }
        return str;
    }

    public static void main(String[] args) {
        String s = "3[a2[c]]";
        System.out.println(decodeString(s));
    }
}

