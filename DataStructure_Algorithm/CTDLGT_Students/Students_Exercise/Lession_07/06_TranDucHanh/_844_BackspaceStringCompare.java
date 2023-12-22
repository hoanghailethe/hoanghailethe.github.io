import java.util.Stack;

public class _844_BackspaceStringCompare {
    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> first = new Stack<Character>();
        Stack<Character> second = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '#') {
                first.push(s.charAt(i));
            } else {
                if (!first.isEmpty()) {
                    first.pop();
                }
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) != '#') {
                second.push(t.charAt(i));
            } else {
                if (!second.isEmpty()) {
                    second.pop();
                }
            }
        }
        if (first.size() != second.size()) {
            return false;
        } else {
           while(!first.isEmpty()){
               if (first.pop() != second.pop()){
                   return false;
               }
           }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "abcd";
        String t = "bbcd";
        System.out.println(backspaceCompare(s, t));
    }
}
