import java.util.Scanner;

public class Circle {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        //Bai 1
        System.out.println("Bài 1 - Tính Chu vi và diện tích hình tròn ");
        System.out.println("Nhập bán kính hình tròn R : ");

        float R = scanner.nextFloat();
        float C = (float) (2 * R * Math.PI);
        float S = (float) (Math.pow(R, 2) * Math.PI);
        
        System.out.printf("Hình tròn có bán kính R = " + R + " có chu vi C là: %.4f " + "\n" , C);
        System.out.printf("Hinh tròn bán kính R = " + R + " có diện tích là %.4f " + "\n" , S);

        scanner.close();
    }
}
