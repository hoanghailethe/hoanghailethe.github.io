public class _844_BackspaceStringCompare {
    public static boolean backspaceCompare(String s, String t) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        int i = 0, j = 0;
        while(i < s.length() || j < t.length()){
            if( i < s.length()){
                if(s.charAt(i) != '#'){
                    str1.append(s.charAt(i));
                } else {
                    if(str1.length()>0){
                        str1.deleteCharAt(str1.length()-1);
                    }
                }
            }
            if (j < t.length()){
                if(t.charAt(j) != '#'){
                    str2.append(t.charAt(i));
                } else {
                    if(str2.length()>0){
                        str2.deleteCharAt(str2.length()-1);
                    }
                }
            }
            i++;j++;
        }
        return str1.toString().equals(str2.toString());
    }

    public static void main(String[] args) {
        String s = "a###bscsd##sad";
        String t = "##a###bscsd##sadsd#s##";
        System.out.println(backspaceCompare(s, t));
        
    }
}
