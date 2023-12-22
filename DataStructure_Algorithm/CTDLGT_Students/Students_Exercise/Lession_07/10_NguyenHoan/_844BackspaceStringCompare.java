import java.util.Stack;

public class _844BackspaceStringCompare{
    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> sStack = new Stack<>();
        Stack<Character> tStack = new Stack<>();
        for(char c: s.toCharArray()){
            if (c!='#'){
                sStack.push(c);
            }else if (!sStack.isEmpty()){
                sStack.pop();
            }
        }
        for(char c: t.toCharArray()){
            if (c!='#'){
                tStack.push(c);
            }else if (!tStack.isEmpty()){
                tStack.pop();
            }
        }
        while(!sStack.isEmpty()){
            char cur = sStack.pop();
            if (tStack.isEmpty()||tStack.pop()!=cur){
                return false;
            }
        }
        return sStack.isEmpty()&&tStack.isEmpty();
    }

    public static void main(String[] args) {
       String s = "ab##"; 
       String t = "c#d#";
       System.out.println( backspaceCompare(s, t));

    }
}