import java.util.Scanner;

public class OddEven {
    public static void main(String[]arg) throws Exception {
        System.out.println("Bài 2 - Kiểm tra số chẵn hay lẻ ");
        Scanner scan = new Scanner (System.in);

        System.out.println("Hãy nhập một số nguyên bất kỳ : ");
        int a = Integer.parseInt(scan.nextLine());

        String s = (a % 2 == 0) ? "Số đã nhập là số chẵn" : "Số đã nhập là số lẻ ";
        System.out.println(s);

        scan.close();
    }
}
