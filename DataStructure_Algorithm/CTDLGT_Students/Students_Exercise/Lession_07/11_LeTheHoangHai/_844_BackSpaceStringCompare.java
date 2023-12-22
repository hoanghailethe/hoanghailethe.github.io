import java.util.Stack;

public class _844_BackSpaceStringCompare {
    public static boolean backspaceCompare(String s, String t) {
        Stack<Character>str1 = new Stack<>();
        Stack<Character>str2 = new Stack<>();
        
        for(int i = 0; i<s.length(); i++) {
            char a = s.charAt(i);
            if(a == '#') {
                if(!str1.isEmpty()){
                    str1.pop();
                }
            } else {
                str1.push(a);
            }
        }
        for(int i = 0; i<t.length(); i++) {
            char a = t.charAt(i);
            if(a == '#') {
                if(!str2.isEmpty()){
                    str2.pop();
                }
            } else {
                str2.push(a);
            }
        }
        if(str1.size() != str2.size() ) {
            return false;
        } else {
            while (!str1.isEmpty()) {
                if(str1.pop().equals(str2.pop())) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "bbcd";

        System.out.println(backspaceCompare(str1, str2));
    }
}
