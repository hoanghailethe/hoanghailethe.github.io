package com.bt;

import java.util.Stack;

public class BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        return calculateString(s).equals(calculateString(t));
    }

    public String calculateString(String s) {

        Stack<Character> characters = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != '#') {
                characters.push(c);
            } else if (!characters.isEmpty()){
                characters.pop();
            }
        }

        while (!characters.isEmpty()) {
            stringBuilder.append(characters.pop());
        }

        return stringBuilder.toString();
    }
}
