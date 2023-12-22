package day10;

import java.util.Stack;

public class _1544_MakeTheStringGreat {
    //
    /**
     * 2 ms
     * 
     * 37.6 MB
     * 
     * 85.47%
     */
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        stack.add(' ');
        for (char c : s.toCharArray()) {
            if (c >= 'a') {
                if (stack.peek() == (char) (c - 32)) {
                    stack.pop();
                    continue;
                }
            } else {
                if (stack.peek() == (char) (c + 32)) {
                    stack.pop();
                    continue;
                }
            }
            stack.add(c);
        }
        int n = stack.size() - 1;
        char[] res = new char[n];
        while (n != 0) {
            n--;
            res[n] = stack.pop();
        }
        return String.valueOf(res);
    }
}
