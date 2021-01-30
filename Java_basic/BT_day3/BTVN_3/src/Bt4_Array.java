import java.util.Scanner;

public class Bt4_Array {
    // Bài tập mảng một chiều mới
    public static void main(String[] arg) throws Exception {
        Scanner scan = new Scanner(System.in);

        // khai bao n
        System.out.println("n > 0 là chiều rộng mảng A[n]");
        System.out.print("Nhập n : ");
        int n = scan.nextInt();
        while (n <= 0) {
            System.out.print("nhaập lại n > 0 : ");
            n = scan.nextInt();
        }

        // nhap du lieu mang mot chieu
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("nhập A[" + i + "] : ");
            A[i] = scan.nextInt();
        }
        System.out.println("");

        // in du lieu mang ra man hinh
        System.out.print("Mảng A đã nhập gồm các số : ");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + A[i]);
        }
        System.out.println("");

        // dem so chan => in ra Kq
        int evenNumCount = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] % 2 == 0) {
                evenNumCount++;
            }
        }
        System.out.println("Mảng A có " + evenNumCount + " số chẵn ");

        // Tim cac so nguyen to trong mang:
        // Phương pháp kiểm tra: 
        //  A[i] có chia hết số nguyên nào giữa 2 và căn A[i] ko. Nếu có => là số nguyên tố
        for (int i = 0; i < n; i++) {
            int valid = 1; 
            if (A[i] >= 1) {
                valid = 0;
                for (int j = 2 ; j < (Math.sqrt(A[i]) + 1); j++) {
                    // Số 2 là giá trị duy nhất chia cho chính nó trong vòng lặp này
                    if (A[i] == 2 ) {
                        break;
                    }
                    // Các trường hợp khác > 2
                    if (A[i] % j == 0) {
                        valid++;
                        break;
                    }
                }
            }
            if ( valid == 0 ) {
                System.out.println("A[" + i + "] = " + A[i] + " là số nguyên tố");
            }
        }

        // Sap xep mang theo thu tu tang dan
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (A[i] > A[j]) {
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
        // In mang sau khi sap xep
        System.out.println("");
        System.out.print("Sắp xếp tăng dần : ");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + A[i]);
        }

        // SAp xep mang theo othu tu giam dan
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (A[i] < A[j]) {
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
        // In mang sau khi sap xep
        System.out.println("");
        System.out.print("Sắp xếp giảm dần : ");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + A[i]);
        }
        System.out.println("");
    }
}
