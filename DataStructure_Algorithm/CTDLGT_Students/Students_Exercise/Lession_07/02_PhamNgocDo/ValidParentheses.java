import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        if (s.length() % 2 != 0)
            return false;
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (stack.isEmpty() || stack.pop() != '(')
                    return false;
            } else if (s.charAt(i) == '}') {
                if (stack.isEmpty() || stack.pop() != '{')
                    return false;
            } else if (s.charAt(i) == ']') {
                if (stack.isEmpty() || stack.pop() != '[')
                    return false;
            } else
                stack.push(s.charAt(i));
        }
        if (stack.size() > 0)
            return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValid("([])"));
    }
}
