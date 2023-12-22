import java.util.Stack;

public class _155_MinStack {

    public class MinStack {
        Stack<Node> myStack;
        int min = Integer.MAX_VALUE;

        /** initialize your data structure here. */
        public MinStack() {
            myStack = new Stack<>();
        }

        public void push(int val) {
            myStack.push(new Node(val, min));
            if (val < min) {
                min = val;
            }
        }

        public void pop() {
            Node tempt = myStack.pop();
            min = tempt.min;
        }

        public int top() {
            return myStack.peek().val;
        }

        public int getMin() {
            return min;
        }
    }
}
