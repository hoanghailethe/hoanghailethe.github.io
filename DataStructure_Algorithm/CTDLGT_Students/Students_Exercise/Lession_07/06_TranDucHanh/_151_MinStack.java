import java.util.Stack;
public class _151_MinStack {
    class MinStack {
        class Node {
            int val;
            int min;

            Node(int val) {
                this.val = val;
            }
        }

        Stack<Node> s = new Stack<Node>();

        public MinStack() {
        }

        public void push(int val) {
            Node newNode = new Node(val);
            newNode.min = s.isEmpty() ? newNode.val : Math.min(newNode.val, s.peek().min);
            s.push(newNode);
        }

        public void pop() {
            s.pop();
        }

        public int top() {
            return s.peek().val;
        }

        public int getMin() {
            return s.peek().min;
        }
    }
}
