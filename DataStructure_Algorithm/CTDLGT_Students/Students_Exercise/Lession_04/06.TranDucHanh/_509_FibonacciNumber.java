public class _509_FibonacciNumber {
    public static int[] LuuKQ = new int[31];

    public static int fib(int n) {
        if (LuuKQ[n] != 0) {
            return LuuKQ[n];
        }
        if (n == 0) {
            LuuKQ[n] = 0;
            return 0;
        }
        if (n <=2) {
            LuuKQ[n] = 1;
            return 1;
        }
        int fn = fib(n - 1) + fib(n - 2);
        LuuKQ[n] = fn;
        return fn;
    }
}
