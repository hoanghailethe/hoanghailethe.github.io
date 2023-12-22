public class _925_LongPressedName {
    public static boolean isLongPressedName(String name, String typed) {
        int count = 0;

        char[] nameChar = name.toCharArray();
        char[] typedChar = typed.toCharArray();

        if(nameChar.length > typedChar.length) return false;

        if(nameChar.length == 1) {
            for (char c : typedChar) {
                if (c != nameChar[0]) return false;
            }
        } 

        for (int i = 1; i < typedChar.length; i++) {
            if (typedChar[i] == typedChar[i - 1]) {        
                if (i == 1) {
                    count++;
                    continue;
                }

                if ( i - count == nameChar.length) {
                    count++;
                }

                if (nameChar[i - count] == nameChar[i - count - 1]) {
                    count--;
                } 

                if ( i - count != nameChar.length) {
                    count++;
                }

            }  else {
                if (i - count >= nameChar.length) return false;
                if(typedChar[i] != nameChar[i - count]) return false;
            }   
            
            // System.out.println(i);
            // System.out.println(count);
        }
        return true;
    }

    public static void main(String[] args) {
        // String name = "vtkgn";
        // String typed = "vttkgnn";

        // System.out.println(isLongPressedName(name, typed));

        //System.out.println(isLongPressedName("saeed","ssaaedd"));
        //System.out.println(isLongPressedName("leelee", "lleeelee"));
        System.out.println(isLongPressedName("alex","aaleexa"));
    }
}
