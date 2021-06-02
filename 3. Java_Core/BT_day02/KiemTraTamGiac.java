import java.util.Scanner;

public class KiemTraTamGiac {
    public static void main(String[]arg) throws Exception {
        Scanner scan = new Scanner(System.in);
        float a, b, c;

        System.out.println("Hãy nhập vào độ dài bất kỳ cần kiểm tra có phải cạnh 1 tam giác");
        System.out.print("Nhập độ cài cạnh a : ");
        a = scan.nextFloat();
        System.out.print("Nhập độ cài cạnh b : ");
        b = scan.nextFloat();
        System.out.print("Nhập độ cài cạnh c : ");
        c = scan.nextFloat();

        if ( (a+b)>c && (b+c)>a && (c+a)>b ) {
            System.out.println("Đây là 3 cạnh của một tam giác");
        } else {
            System.out.println("Đây không phải 3 cạnh của một tam giác");
        }
        scan.close();
    }
}
