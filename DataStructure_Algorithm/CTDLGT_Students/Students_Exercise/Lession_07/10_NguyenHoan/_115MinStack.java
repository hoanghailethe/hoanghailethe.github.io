import java.util.Stack;

public class _115MinStack {

    static class Node {
        int value;
        int MIN;

        Node(int value) {
            this.value = value;
        }
    }

    static Stack<Node> stack = new Stack<>();

    static class MinStack {

        /** initialize your data structure here. */
        public MinStack() {

        }

        public void push(int x) {
            Node newNode = new Node(x);
            newNode.MIN = stack.isEmpty() ? x : Math.min(newNode.value, stack.peek().MIN);
            stack.add(newNode);
        }

        public void pop() {
            stack.pop();

        }

        public int top() {
            return stack.peek().value;
        }

        public int getMin() {
            return stack.peek().MIN;

        }
    }
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-1);
        System.out.println( minStack.top());
        System.out.println( minStack.getMin()); 
    }

}