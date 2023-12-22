public class _509_FibonaciNumber {
    public int fi(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = f1;

        if (n == 0) {
            return f0;
        } else if (n == 1) {
            return f1;
        }

        for( int i = 2; i< n; i++) {
            f0 = f1;
            f1 = fn;
            fn = f0 + f1;
        } 
        
        return fn;
    }
}
