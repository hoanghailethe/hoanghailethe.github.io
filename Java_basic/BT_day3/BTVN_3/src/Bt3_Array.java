import java.util.Scanner;

public class Bt3_Array {
    public static void main(String[] arg) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Khai báo mảng đa chiều A[x][y] ");
        // nhập chiều dài ma trận mong muốn x = sô hàng
        System.out.print("Nhập x > 0 (row number): ");
        int x = scan.nextInt();
        while (x <= 0) {
            System.out.print("Yêu cầu nhập x >= 0. Hãy nhập lại x : ");
            x = scan.nextInt();
        }
        // nhập y = sô côt
        System.out.print("Nhập y > 0 (collumn number): ");
        int y = scan.nextInt();
        while (y <= 0) {
            System.out.print("Yêu cầu nhập x >= 0. Hãy nhập lại x : ");
            y = scan.nextInt();
        }

        // Khai bao và nhập tham số cho 2 ma trận vuông.
        int[][] A = new int[x][y];
        // Nhập ma trận A
        System.out.println("Nhập tham số cho ma trận A[" + x + "][" + y + "] :");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("   A[" + i + "][" + j + "] :");
                A[i][j] = scan.nextInt();
            }
        }
        // In Ma trận A:
        System.out.println("");
        System.out.println("Ma trận A[" + x + "][" + y + "] chứa các số sau : ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("\t" + A[i][j]);
            }
            System.out.println("");
        }

        // tính tổng của các phần tử chia hết cho 5 trong mảng
        int sum = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (A[i][j] % 5 == 0) {
                    sum += A[i][j];
                }
            }
        }
        System.out.println("Tổng các giá trị chia hết cho 5 trong mảng là : " + sum);
        scan.close();
    }
}
