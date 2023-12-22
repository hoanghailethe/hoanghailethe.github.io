
import java.util.Stack;

public class _20_ValidPanthesis {
    public boolean isValid(String s) {
        
        Stack <Character> closeOrder = new Stack<>();

        for(int i = 0; i< s.length(); i++) {
            char a = s.charAt(i);
            if (a == '(') {
                closeOrder.push(')');
            }
            
            if (a == '[') {
                closeOrder.push(']');
            }
            
            if (a == '{') {
                closeOrder.push('}');
            }

            if (closeOrder.isEmpty()) return false;

            if(a == ')') {
                char b = closeOrder.pop();
                if (a != b) return false;
            }
            if(a == ']') {
                char b = closeOrder.pop();
                if (a != b) return false;
            }
            if(a == '}') {
                char b = closeOrder.pop();
                if (a != b) return false;
            }
        } 
        return closeOrder.isEmpty();
    }
}
