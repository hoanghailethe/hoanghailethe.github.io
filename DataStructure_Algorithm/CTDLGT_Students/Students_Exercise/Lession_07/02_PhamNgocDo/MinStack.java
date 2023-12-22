import java.util.Stack;

class MinStack {

    public class Node {
        int data;
        int min;

        public Node(int data) {
            this.data = data;
        }
    }

    Stack<Node> stack;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        Node node = new Node(val);
        node.min = stack.isEmpty() ? val : Math.min(val, stack.peek().min);
        stack.push(node);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek().data;
    }

    public int getMin() {
        return stack.peek().min;
    }
}