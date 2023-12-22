public class _509_Fibonacci_Number_Not_Recursive {
    public static int fib(int n) {
        int pre = 0, next = 1, result = 0;
        while (n >= 2) {
            result = pre + next;
            pre = next;
            next = result;
            n--;
        }
        if (n == 0) {
            return pre;
        } else if (n == 1) {
            return next;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fib(4));
    }
}
