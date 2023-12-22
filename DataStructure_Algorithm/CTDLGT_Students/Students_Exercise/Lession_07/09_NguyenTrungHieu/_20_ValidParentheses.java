import java.util.Stack;

public class _20_ValidParentheses {
    public static boolean isValid(String s) {
        StringBuilder str = new StringBuilder(s);
        Stack<Character> stack = new Stack<>();
        if (str.charAt(0) != '(' && str.charAt(0) != '{' && str.charAt(0) != '[') {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != '(' && ch != ')' && ch != '[' && ch != ']' && ch != '{' && ch != '}') {
                return false;
            }
            if(stack.empty() == true && (ch == ')' || ch == ']' || ch == '}')){
                return false;
            }
            if (ch == '(') {
                stack.push(')');
            } else if (ch == '[') {
                stack.push(']');
            } else if (ch == '{') {
                stack.push('}');
            }

            if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.peek() != ch) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        if(stack.empty() == false){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "{[]}";
        System.out.println(isValid(s));
    }
}
