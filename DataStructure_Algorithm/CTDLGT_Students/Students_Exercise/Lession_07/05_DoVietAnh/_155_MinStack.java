package anhdv;

import java.util.Arrays;
import java.util.Stack;

/**
 *
 * @author anhdv
 */
public class _155_MinStack {
    
    Stack<Integer> stack;
    Stack<Integer> minStack;

    public _155_MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);

        if (minStack.isEmpty() || x <= minStack.peek())
            minStack.push(x);
    }

    public void pop() {
        int x = stack.pop();

        if (minStack.peek() == x)
            minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
    
    public static void main(String[] args) {
        
        _155_MinStack minStack = new _155_MinStack();
        
        minStack.push(1);
        minStack.push(2);
        minStack.push(3);
        minStack.push(4);
        System.out.println("stack: " + Arrays.toString(minStack.stack.toArray()));
        
        minStack.pop();
        System.out.println("stackAfterPop: " + Arrays.toString(minStack.stack.toArray()));
        
        minStack.top();
        System.out.println("stackAfter.top: " + minStack.top());
        
        minStack.getMin();
        System.out.println("stackAfter.min: " + minStack.getMin());
    }
}
