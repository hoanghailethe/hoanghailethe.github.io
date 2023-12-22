public class _509_Fibonacci_Number {
    public static int tinhTong(int[] a, int k) {
        int Tk = 0;
        //1. Dieu kien dung`
        if (k == 0) {
            return a[0];
        }
        //2. Ap dung cong thuc quy nap
        Tk = a[k] + tinhTong(a, k - 1);

        return Tk;
    }

    public int fib(int n) {

        if (n == 2 || n == 1) {
            return 1;
        } else {
            n = fib(n - 1) + fib(n - 2);
        }

        return n;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println("sum = " + tinhTong(a, a.length - 1));
    }
}
