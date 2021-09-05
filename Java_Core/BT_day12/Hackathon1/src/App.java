import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Chương trình kiểm tra số nguyên tố! Hãy nhập số nguyên của bạn");
        
        Scanner scan = new Scanner (System.in);

        System.out.println("Thoát chương trình: Nhập X hoặc Q");
        
        String n = "";

        File myfile = new File ("D:\\nguyenTo.txt");
        myfile.createNewFile();

        FileWriter myPen = new FileWriter(myfile);
        String result = "";

        while ( !n.equals("X") && !n.equals("Q")) {
            try {
                System.out.print("Nhap so nguyen n bat ky: ");
                n = scan.nextLine();
                
                int x = Integer.parseInt(n);
                
                if (isPrime(x)) {
                    result = x + " là số nguyên tố";
                } else {
                    result = x + " không phải số nguyên tố";
                    
                }
    
            } catch (NumberFormatException e) {
                //TODO: handle exception
                result = n + " không phải là số";
            } finally {
                System.out.println(result);
                myPen.write(result + "\n");
            }
        } 
        myPen.close();

    }

    public static boolean isPrime(int n) {
        if (n<=1) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false; 
                }
            }
            return true; 
        }
    }
}