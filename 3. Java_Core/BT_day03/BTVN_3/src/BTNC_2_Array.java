import java.util.Scanner;

public class BTNC_2_Array {
    //Plus Array and Tranpose Array
    public static void main(String[] arg) throws Exception {
        Scanner scan = new Scanner(System.in);

        // nhập số n là độ dài mảng; kiểm tra điều kiện
        System.out.print("n là chiều dài của ma trận vuông. Nhập n > 0 : ");
        int n = scan.nextInt();
        while (n <= 0) {
            System.out.print("Yêu cầu nhập n >= 0. Hãy nhập lại n : ");
            n = scan.nextInt();
        }

        // Khai báo và nhập giá trị cho A[],B[].
        int[][] A = new int[n][n];
        int[][] B = new int[n][n];
        // Nhập giá trị ma trận A
        System.out.println("Nhập tham số cho ma trận A[" + n + "][" + n + "] :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("   A[" + i + "][" + j + "] :");
                A[i][j] = scan.nextInt();
            }
        }
        // Nhập giá trị ma trận B
        System.out.println("Nhập tham số cho ma trận B[" + n + "][" + n + "] :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("   B[" + i + "][" + j + "] :");
                B[i][j] = scan.nextInt();
            }
        }

        // in ra hai ma trận A và B đã nhập:
        // In Ma trận A:
        System.out.println("");
        System.out.println("Ma trận A[" + n + "][" + n + "] chứa các số sau : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("\t" + A[i][j]);
            }
            System.out.println("");
        }
        // In Ma trận B
        System.out.println("");
        System.out.println("Ma trận B[" + n + "][" + n + "] chứa các số sau : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("\t" + B[i][j]);
            }
            System.out.println("");
        }

        // Khai báo ma trận C là tổng hai ma trận A + B
        int[][] C = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        // In Ma trận C
        System.out.println("");
        System.out.println("Ma trận C[" + n + "][" + n + "] = A[" + n + "][" + n + "]+ B[" + n + "][" + n + "] chứa các số sau : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("\t" + C[i][j]);
            }
            System.out.println("");
        }

        // Chạy thuật toán chuyển vị 2 ma trân vuông A và B:
        // ma trận A
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
        // ma trận B
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = B[i][j];
                B[i][j] = B[j][i];
                B[j][i] = temp;
            }
        }
        // in ra hai ma trận sau khi chuyển vị:
        System.out.println("");
        System.out.println("Ma trận A[" + n + "][" + n + "] đã chuyển vị : ");
        for (int i = 0; i < n; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                System.out.print("\t" + A[i][j]);
            }
        }
        System.out.println("");
        System.out.println("Ma trận B[" + n + "][" + n + "] đã chuyển vị :");
        for (int i = 0; i < n; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                System.out.print("\t" + B[i][j]);
            }
        }
        System.out.println("");
        scan.close();
    }
}
