public class Student {
    protected int maSinhVien;
    protected String hoTen;
    protected float diemLyThuyet;
    protected float diemThucHanh;
    protected float diemTrungBinh;

    public Student() {
    }

    public Student(int idStudent, String name, float testScore, float practiceScore) {
        this.maSinhVien = idStudent;
        this.hoTen = name;
        this.diemLyThuyet = testScore;
        this.diemThucHanh = practiceScore;
    }

    public void display() {
        System.out.printf(" %3d\t %-15s %8.2f %18.2f %n", maSinhVien, hoTen, diemLyThuyet, diemThucHanh);
    }

    public void avrScoreCalculate() {
        this.diemTrungBinh = (diemLyThuyet + diemThucHanh) / 2;
        System.out.println("Điểm trung bình của học sinh có tên " + this.hoTen + " và mã sinh viên " + maSinhVien
                + " là " + this.diemTrungBinh);
    }
}
