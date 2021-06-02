import java.util.Scanner;

public class TinhLuyThua {
    public static void main(String[]arg) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println ("Nhập vào số nguyên n >=0. Chương trình sẽ tính n!");
        System.out.print ("Nhập số nuyên dương n : ");
        int n = scan.nextInt();
        long nGiaiThua = 1;

        if ( n < 0 ) {
            System.out.println("Vui lòng nhập số nguyên n >= 0"); 
        } 
      
        if ( n == 0 ) {
            System.out.println("Kết quả 0! = " + nGiaiThua);
        }

        if ( n > 0 ) {
            for (int i =1 ; i <= n; i++) {
                nGiaiThua = nGiaiThua * i;
            }
            System.out.println("Kết quả n! là : " + nGiaiThua);
        } 
        scan.close();
    }
}
