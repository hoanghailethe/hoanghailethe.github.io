public class Fibo {
    public static int fib(int n) {
        System.out.println("F(" + n + ")");
        if (n == 0)
            return 0;
        if (n <= 2)
            return 1;
        int Fn = fib(n - 1) + fib(n - 2);
        return Fn;
    }


    public static void main(String[] args) {
        fib(6);
    }
}
