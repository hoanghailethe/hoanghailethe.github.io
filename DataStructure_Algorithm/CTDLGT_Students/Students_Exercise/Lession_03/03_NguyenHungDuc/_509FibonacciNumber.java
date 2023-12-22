class _509FibonacciNumber {
    public static int fib(int n) {
        if(n<=2){
            return 1;
        }
        int fib = fib(n - 1) + fib(n - 2);
        
        return fib;
    }

    public static void main(String[] args) {
       System.out.println(fib(10)); 
    }
}