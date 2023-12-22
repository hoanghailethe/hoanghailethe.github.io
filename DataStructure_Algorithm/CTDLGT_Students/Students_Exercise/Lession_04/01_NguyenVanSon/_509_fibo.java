
public class _509_fibo {

    public static void main(String[] args) {
        int n = 3;
        fiboo(n);
    }
        
    public static int[] fiboo(int n) {
        int a[] = new int[n];
        a[0] = 0;
        a[1] = 1;
        if (n == 0 || n == 1) {
            return a;
        }
        for (int i = 2; i < n; i++) {
            int count = i - 1;
            int count2 = i - 2;
            a[i] = a[count] + a[count2];
        }
        return a;
    }
}