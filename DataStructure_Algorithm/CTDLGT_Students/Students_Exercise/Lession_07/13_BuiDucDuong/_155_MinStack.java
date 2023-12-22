

public class _155_MinStack {
    class MinStack {
        class Node {
            int val;
            int min;
            Node next;

            public Node(int val) {
                this.val = val;
            }
        }

        Node head;

        public MinStack() {

        }

        public void push(int val) {
            Node newNode = new Node(val);
            if (head == null) {
                newNode.min = val;
            } else {
                newNode.min = val > head.min ? val : head.min;
            }
            newNode.next = head;
            head = newNode;
        }

        public void pop() {
            head = head.next;
        }

        public int top() {
            return head.val;
        }

        public int getMin() {
            return head.min;
        }
    }
}
