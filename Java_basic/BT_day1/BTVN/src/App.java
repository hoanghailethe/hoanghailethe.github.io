import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        //Bai 1
        System.out.println("Bài 1 - Tính Chu vi và diện tích hình tròn ");
        System.out.println("Nhập bán kính hình tròn R : ");
        float R = scanner.nextFloat();
        scanner.nextLine();

        float C = (float) (2 * R * Math.PI);
        float S = (float) (Math.pow(R, 2) * Math.PI);
        
        System.out.printf("Hình tròn có bán kính R = " + R + " có chu vi C là: %.4f " + "\n" , C);
        System.out.printf("Hinh tròn bán kính R = " + R + " có diện tích là %.4f " + "\n" , S);
        System.out.println("---------------------");

        //Bai 2
        System.out.println("Bài 2 - Kiểm tra số chẵn hay lẻ ");

        System.out.println("Hãy nhập một số nguyên bất kỳ : ");
        int a = Integer.parseInt(scanner.nextLine());

        String s = (a % 2 == 0) ? "Số đã nhập là số chẵn" : "Số đã nhập là số lẻ ";
        System.out.println(s);
        System.out.println("---------------------");
       
        //bai 3
        System.out.println("Bài 3 - Tính tiền lãi hàng tháng của khoản vay với Số nợ = 100.000.000; Lãi xuất năm: 12% ");
        float baseDebt = 100_000_000f;
        float yearInterestRate = 0.12f;
        float monthInterestRate = yearInterestRate / 12;
        float monthlyInterestPayment = monthInterestRate * baseDebt;
        float monthlyTotalPayment = baseDebt / 12 + monthlyInterestPayment;
        System.out.printf("Số tiền phải trả hàng tháng là : %.4f " + "\n", monthlyTotalPayment);

        scanner.close();
    }
}
