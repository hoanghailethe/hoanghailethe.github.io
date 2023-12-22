public class _509_FibonaciNoRecursion {
    public static int fibo(int n) {
        int[] F = new int [200];
        F[0] = 0;
        F[1] = 1;
        for (int i =2;i <=n;i++){
            F[i] = F[i-1] + F[i-2];
        }
        return F[n];
    }
    public static void main(String[] args) {
        System.out.println(fibo(2));
    }
}
