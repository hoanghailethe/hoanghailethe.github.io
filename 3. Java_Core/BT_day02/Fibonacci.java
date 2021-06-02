import java.util.Scanner;

public class Fibonacci {
    public static void main(String[]arg) throws Exception {
        System.out.println("Cung cấp số nguyên n >= 0 để in ra n số Fibonacci");
        Scanner scan = new Scanner (System.in);

        System.out.print("Nhập số nguyên dương n : ");
        int n = scan.nextInt();
        int fibo0 =0; 
        int fibo1 =0; 
        int fiboN =1;

        if (n <= 0) {
            System.out.println("Hãy nhập số nguyên n > 0 ");
        }
        
        if (n >= 1) {
            System.out.println("Số fibonacci thứ 1 là " + fiboN);
            for ( int i=1; i < n; i++) {
                fibo1 = fiboN;
                fiboN = fibo0 + fibo1;
                fibo0 = fibo1;
                System.out.println("Số fibonacci thứ " + (i+1) + " là " + fiboN);
            }
        }         
        scan.close();
    }
}
