package anhdv;

/**
 *
 * @author Admin
 */
public class _509_Fibonacci_Number {
    
    static int fib(int n) {
        int fibSum[] = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                fibSum[i] = i;
            }else if (i == 1 || i == 2) {
                fibSum[i] = 1;
            }else {
                fibSum[i] = fibSum[i - 1] + fibSum[i - 2];
            }
        }
        return fibSum[fibSum.length-1];
    }
    
    public static void main(String[] args) {
        int num = 6;
        System.out.println("res: " + fib(num));
    }
}
