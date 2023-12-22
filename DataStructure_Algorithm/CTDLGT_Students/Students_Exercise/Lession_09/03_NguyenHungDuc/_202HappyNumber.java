class _202HappyNumber {
    public static boolean isHappy(int n) {
        while( n!=1 && n!=4 ) {
            int next = 0;
            
            while( n > 0 ) {
                next += ( n % 10 )*( n % 10 );
                n /= 10;
            }
            
            n = next;
        }
        
        return n == 1;
    }

    public static void main(String[] args) {
        int n = 21;
        // int m = n % 10;
        // System.out.println(m);
        System.out.println(isHappy(n));
        
    }
}