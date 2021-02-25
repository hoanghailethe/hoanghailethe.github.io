public class Student {
    protected int maSinhVien;
    protected String hoTen;
    protected float diemLyThuyet;
    protected float diemThucHanh;
    protected float diemTrungBinh;

    public Student() {
        System.out.println("Một sinh viên vừa đăng ký tài khoản mặc đinh, không có thông tin");
        this.hoTen = "Unknown";
        this.diemLyThuyet = 0;
        this.diemThucHanh = 0;
    }

    public Student(int idStudent , String name, float testScore, float practiceScore ) {
        System.out.println("Một sinh viên vừa đăng ký tài khoản chính thức, có cung cấp thông tin");
        this.maSinhVien = idStudent;
        this.hoTen = name;
        this.diemLyThuyet = testScore;
        this.diemThucHanh = practiceScore;
    }

    public void avrScoreCalculate() {
        this.diemTrungBinh = (diemLyThuyet+diemThucHanh)/2;
        System.out.println("Điểm trung bình của học sinh có mã sinh viên "+ maSinhVien + " là " + this.diemTrungBinh );
    }
}
