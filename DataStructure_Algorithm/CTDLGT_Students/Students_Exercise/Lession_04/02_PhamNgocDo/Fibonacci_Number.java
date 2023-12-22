class Fibonacci_Number{
    public static int fib(int n ) {
        if(n==1) return 0;
        if(n>1&&n<=3) return 1;
        int a[] = new int[1000];
        a[0]=0;
        a[1]=1;
        a[2]=1;
        for(int i =3 ; i<=n ; i++){
           a[i]=a[i-1]+a[i-2];
        } 
        return a[n];
    }
    public static void main(String[] args) {
        System.out.println(fib(60));
    }
}