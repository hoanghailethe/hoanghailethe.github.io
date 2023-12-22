public class _155leetCode {
    Stack<Integer> s;
    Integer minEle;

    MyStack() { s = new Stack<Integer>(); }

    // public void getMin() {
    //     if (s.isEmpty())
    //         System.out.println("Stack rỗng");
    //     else
    //         System.out.println("Phần tử nhỏ nhất"  + minEle);
    // }

    public void peek() {
        if (s.isEmpty()) {
            System.out.println("Stack rỗng");
            return;
        }

        Integer t = s.peek();
        System.out.print("Phần tử trên cùng: ");
        if (t < minEle)
            System.out.println(minEle);
        else
            System.out.println(t);
    }

    public void pop() {
        if (s.isEmpty()) {
            System.out.println("Stack rỗng");
            return;
        }

        System.out.print("Phần tử trên cùng bị xóa: ");
        Integer t = s.pop();
        if (t < minEle) {
            System.out.println(minEle);
            minEle = 2 * minEle - t;
        }

        else
            System.out.println(t);
    }

    public void push(Integer x) {
        if (s.isEmpty()) {
            minEle = x;
            s.push(x);
            System.out.println("Phần tử được chèn: " + x);
            return;
        }

        if (x < minEle) {
            s.push(2 * x - minEle);
            minEle = x;
        }

        else
            s.push(x);

        System.out.println("Phần tử được chèn là: " + x);
    }
};

public class Main {
    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(3);
        s.push(5);
        // s.getMin();
        s.push(2);
        s.push(1);
        // s.getMin();
        s.pop();
        // s.getMin();
        s.pop();
        s.peek();
    }
}