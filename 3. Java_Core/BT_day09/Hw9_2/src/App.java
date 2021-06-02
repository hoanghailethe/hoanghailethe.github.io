import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Library!");

        // Nhap so luong sach
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập số đầu sách Giao khoa: ");
        int n1 = scan.nextInt();
        System.out.print("Nhập số đầu sách đồ án: ");
        int n2 = scan.nextInt();
        System.out.print("Nhập số đầu sách tài liệu điện tử: ");
        int n3 = scan.nextInt();

        // Nhap SGK
        System.out.println("Nhập thông tin SGK");
        SachGiaoKhoa[] sgk = new SachGiaoKhoa[n1];
        for (int i = 0; i < n1; i++) {
            sgk[i] = new SachGiaoKhoa();
            sgk[i].input();
        }

        // Nhap Do an
        System.out.println("Nhập thông tin đồ án");
        DoAn[] doAn = new DoAn[n2];
        for (int i = 0; i < n2; i++) {
            doAn[i] = new DoAn();
            doAn[i].input();
        }

        // Nhap tai lieu dien tu
        System.out.println("Nhập thông tin Tài liệu điện tử");
        TaiLieuDienTu[] taiLieu = new TaiLieuDienTu[n3];
        for (int i = 0; i < n3; i++) {
            taiLieu[i] = new TaiLieuDienTu();
            taiLieu[i].input();
        }
        scan.close();

        // In ketQua
        System.out.println("Thông tin Sách Giáo Khoa");
        for (int i = 0; i < n1; i++) {
            System.out.println(sgk[i].toString());
        }
        System.out.println();
        System.out.println("Thông tin đồ án:");        
        for (int i = 0; i < n2; i++) {
            System.out.println(doAn[i].toString());
        }
        System.out.println();
        System.out.println("Thông tin sách điện tử: ");
        for (int i = 0; i < n3; i++) {
            System.out.println(taiLieu[i].toString());
        }

    }
}
