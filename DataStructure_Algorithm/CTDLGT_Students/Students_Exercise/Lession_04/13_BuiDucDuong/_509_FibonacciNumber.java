package day04;

public class _509_FibonacciNumber {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(fib(n));
    }

    public static int fib(int n) {
        if (n < 2) {
            return n;
        }
        int fn_2 = 0;
        int fn_1 = 1;
        int fn = 0;
        for (int i = 2; i <= n; i++) {
            fn = fn_1 + fn_2;
            fn_2 = fn_1;
            fn_1 = fn;
        }
        return fn;
    }
}