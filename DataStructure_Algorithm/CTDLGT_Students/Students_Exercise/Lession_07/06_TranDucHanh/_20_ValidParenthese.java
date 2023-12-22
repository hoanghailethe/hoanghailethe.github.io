import java.util.Stack;

public class _20_ValidParenthese {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if (s.charAt(i) == '}' && stack.pop() != '{') {
                    return false;
                }
                if (s.charAt(i) == ')' && stack.pop() != '(') {
                    return false;
                }
                if (s.charAt(i) == ']' && stack.pop() != '[') {
                    return false;
                }

            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
}
