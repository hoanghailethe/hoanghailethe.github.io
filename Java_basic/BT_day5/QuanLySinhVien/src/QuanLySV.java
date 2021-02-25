public class QuanLySV {
    public static void main(String[] args) throws Exception {
        System.out.println("Chào mừng đến với trang quán lý dữ liệu sinh viên !");
        Student sv1 = new Student(11223344, "Hong Ngoc", 8.22f, 8.53f);
        Student sv2 = new Student (22334455, "La Thuy", 9.4f, 7.5f);
        Student sv3 = new Student (33445566, "Quang Huy", 10f, 8.5f);
        Student sv4 = new Student();

        sv1.avrScoreCalculate();
        sv2.avrScoreCalculate();
        sv3.avrScoreCalculate();

    }
}
