import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _155_MinStack {

    public static class MinStack {

        Stack<Integer> minStack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        int min;

        /** initialize your data structure here. */
        public MinStack() {

        }

        // Thêm phần tử
        public void push(int val) {
            if(minStack.size() == 0){
                min = val;
            }
            if (val <= min) {
                min = val;
            }
            list.add(min);
            minStack.push(val);
        }

        // xóa phần tử cuối cùng thay đổi stack
        public void pop() {
            if (list.size() > 1) {
                list.remove(list.size() - 1);
            }
                min = list.get(list.size()-1);
            minStack.pop();
        }

        // trả về phần tử cuối cùng của stack, không làm thay đổi stack
        public int top() {
            return minStack.peek();
        }

        // Lấy phần tử nhỏ nhất trong stack
        public int getMin() {
            if(list.size()>1){
                return list.get(list.size() - 1);
            } else {
                return minStack.peek();
            }
        }
    }

    public static void main(String[] args) {
        MinStack myStack = new MinStack();
        myStack.push(-10);
        myStack.push(14);
        System.out.println(myStack.getMin());
        System.out.println(myStack.getMin());
        myStack.push(-20);
        System.out.println(myStack.getMin());
        System.out.println(myStack.getMin());
        myStack.top();
        System.out.println(myStack.getMin());
        myStack.pop();
        myStack.push(10);
        myStack.push(-7);
        System.out.println(myStack.getMin());

//         ["MinStack","push","push","getMin","getMin","push","getMin","getMin","top","getMin","pop","push","push","getMin","push","pop","top","getMin","pop"]
// [[],[-10],[14],[],[],[-20],[],[],[],[],[],[10],[-7],[],[-7],[],[],[],[]]
        System.out.println(myStack.getMin());
        myStack.pop();
        System.out.println(myStack.getMin());
        myStack.pop();
        System.out.println(myStack.getMin());
        myStack.pop();
        // myStack.pop();
        System.out.println(myStack.getMin());

    }
}
