class _509FibonacciNumberNoRecursion {
    public static int fib(int n) {

        if (n == 0) {
            return 0;
        }
        if (n <= 2) {
            return 1;
        }
        int[] a = new int[31];
        a[0] = 0;
        a[1] = 1;
        a[2] = 1;
        for (int i = 2; i <= n; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        return a[n];
    }
    public static void main(String[] args) {
        System.out.println(fib(3));
    }
}