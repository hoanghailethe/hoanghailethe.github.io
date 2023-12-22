import java.util.Stack;

class _844BackspaceStringCompare {
    public static boolean backspaceCompare(String s, String t) {
        String str = backspace(s);
        String str2 = backspace(t);
        if (str.equals(str2)) {
            return true;
        } else {
            return false;
        }   
    }

    public static String backspace(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            // stack.push(s.charAt(i));
            if (!stack.isEmpty()&& s.charAt(i)=='#') {
                stack.pop();
            } else if (s.charAt(i) != '#') {
                stack.push(s.charAt(i));
            }
            
        }
        for (Character character : stack) {
            str.append(character);
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String s = "a##c";
        String t = "#a#c";

        System.out.println(backspace(s));
        System.out.println(backspace(t));
        System.out.println(backspaceCompare(s, t));
        
    }
}