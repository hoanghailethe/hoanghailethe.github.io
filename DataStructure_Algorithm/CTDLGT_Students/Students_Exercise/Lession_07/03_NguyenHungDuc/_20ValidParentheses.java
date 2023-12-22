import java.util.Stack;

class _20ValidParentheses {
    public static boolean isValid(String s) {
        if (s.isEmpty()) {
            return true;
        }
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty())
                    return false;
                char c2 = stack.pop();
                if (c2 == '(' && c != ')')
                    return false;
                if (c2 == '{' && c != '}')
                    return false;
                if (c2 == '[' && c != ']')
                    return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "{[}}";
        System.out.println(isValid(s)); 
    }
}