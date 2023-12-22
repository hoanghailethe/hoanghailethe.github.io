package com.bt;

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> myStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                myStack.push(ch);
            } else if (myStack.isEmpty()) {
                return false;
            } else if (ch == ')' && myStack.pop() != '(') {
                return false;
            } else if (ch == '}' && myStack.pop() != '{') {
                return false;
            } else if (ch == ']' && myStack.pop() != '[') {
                return false;
            }
        }

        if (myStack.isEmpty()) {
            return true;
        }
        return false;
    }
}
