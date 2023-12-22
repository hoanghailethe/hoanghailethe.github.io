package com.bt;

import java.util.Stack;

public class MinStack {
    Stack<Node> myStack;

    class Node {
        int val;
        int min;

        public Node(int val, int min) {
            this.val = val;
            this.min = min;
        }
    }

    public MinStack() {
        this.myStack = new Stack<Node>();
    }

    public void push(int x) {
        if (myStack.isEmpty()) {
            myStack.push(new Node(x, x));
        } else {
            int min = Math.min(myStack.peek().min, x);
            myStack.push(new Node(x, min));
        }
    }

    public int pop() {
        return myStack.pop().val;
    }

    public int top() {
        return myStack.peek().val;
    }

    public int getMin() {
        return myStack.peek().min;
    }
}
