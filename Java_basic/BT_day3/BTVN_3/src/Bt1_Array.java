import java.util.Scanner;

public class Bt1_Array {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        // nhập số n là độ dài mảng; kiểm tra điều kiện
        System.out.print("Nhập vào số nguyên dương n (chiều dài mảng): ");
        int n = scan.nextInt();
        while (n <= 0) {
            System.out.print("Yêu cầu nhập n >= 0. Hãy nhập lại n : ");
            n = scan.nextInt();
        }
        // Khai báo các giá trị cho mảng A[n]
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập A[" + i + "] : ");
            A[i] = scan.nextInt();
        }
        // In ra mảng vừa nhập
        System.out.print("Mảng vừa nhập có chứa các giá trị sau : ");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + A[i]);
        }

        // Chạy thuật toán sắp xếp mảng giá trị giảm dần
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (A[i] < A[j]) {
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
        // In mảng mới đã sắp xếp thứ tự giảm dần
        System.out.println("");
        System.out.print("Mảng mới sau khi sắp xếp là : ");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + A[i]);
        }

        // Chạy Thuật toán Tìm số lớn nhất Max_1
        int max1_value = A[0];
        for (int i = 1; i < n; i++) {
            if (max1_value < A[i]) {
                max1_value = A[i];
            }
        }
        // in ra giá trị MAX_1
        System.out.println("");
        System.out.println("Giá trị lớn nhất (MAX_1) là : " + max1_value);
        // In vị trí các phần tử có GTLN
        System.out.print("Các A[i] có GTLN (MAX_1) có i là : ");
        for (int i = 0; i < n; i++) {
            if (A[i] == max1_value) {
                System.out.print(" " + i);
            }
        }

        // Tìm ra số lớn thứ 2 trong dãy:
        // Bước 1: gán cho max_2 giá trị đầu tiên khác với Max_1
        int max2_value = A[0];
        for (int i = 0; i < n; i++) {
            if (A[i] != max1_value) {
                max2_value = A[i];
                break;
            }
        }
        // Bước 2: kiểm tra TH chuỗi chỉ có một giá trị duy nhất là Max_1 
        // => Không có giá trị lớn thứ 2 và Dùng chương trình tại đây
        if (max1_value == max2_value) {
            System.out.println("");
            System.out.println(
                    "Tất cả số trong dãy đều bằng nhau hoặc chuỗi này chỉ có 1 số duy nhất. Ko tìm được MAX_2");
        } else {
            // Bước 3: Sau khi loại đi TH Chuỗi chỉ gồm 1 giá trị. Chạy tiếp CT TÌM và In MAX_2
            // Chạy thuật toán tìm Max_2
            for (int i = 0; i < n; i++) {
                if (A[i] < max1_value && A[i] > max2_value) {
                    max2_value = A[i];
                }
            }
            System.out.println("");
            System.out.println("Giá trị lớn thứ hai (MAX_2) là : " + max2_value);
            // In vị trí tất cả các phần tử có GT MAX_2
            System.out.print("Các A[i] có gía trị MAX_2 có i là : ");
            for (int i = 0; i < n; i++) {
                if (A[i] == max2_value) {
                    System.out.print(" " + i);
                }
            }
            System.out.println(" ");
        }
        scan.close();
    }
}
