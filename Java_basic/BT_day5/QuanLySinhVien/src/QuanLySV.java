public class QuanLySV {
    public static void main(String[] args) throws Exception {
        System.out.println("Chào mừng đến với trang quán lý dữ liệu sinh viên !");
        System.out.println(" ");
        Student sv1 = new Student();
        sv1.hoTen = "Hong Ngoc";
        sv1.maSinhVien = 123214214;
        sv1.diemLyThuyet = 8.5f;
        sv1.diemThucHanh = 9f;

        Student sv2 = new Student();
        sv2.hoTen = "Mai Lan";
        sv2.maSinhVien = 12232143;
        sv2.diemLyThuyet = 9.5f;
        sv2.diemThucHanh = 9f;

        Student sv3 = new Student();
        sv3.hoTen = "Nguyen Huong";
        sv3.maSinhVien = 13512314;
        sv3.diemLyThuyet = 8.5f;
        sv3.diemThucHanh = 10f;

        Student sv4 = new Student(33445566, "Quang Huy", 10f, 8.5f);

        System.out.printf("%7s %17s %20s %17s %n", "Ma SV", "Ho ten", "Diem Ly thuyet", "Diem thuc hanh");
        sv1.display();
        sv2.display();
        sv3.display();
        sv4.display();

        sv1.avrScoreCalculate();
        sv2.avrScoreCalculate();
        sv3.avrScoreCalculate();
        sv4.avrScoreCalculate();
    }
}
