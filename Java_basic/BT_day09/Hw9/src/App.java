public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Shapes' World!");
    
        System.out.println();
        System.out.println("Thong tin hinh tron: ");
        Circle a = new Circle(3.2f);
        System.out.println("Ban kinh Circle la :" + a.getBanKinhR());
        System.out.printf("Chu vi : %.4f %n", a.chuVi());
        System.out.printf("Dien tich: %.4f %n", a.dienTich());
        System.out.println("Duong kinh: " + a.tinhDuongKinh());
        
        System.out.println();
        System.out.println("Thong tin hinh Chu nhat: ");
        Rectangle b = new Rectangle(10f, 5f);
        System.out.println("Chieu dai : "+ b.getChieuDai() + ". Chieu rong: "+ b.getChieuRong());
        System.out.println("Chu vi: "+ b.chuVi());
        System.out.println("Dien tich: " + b.dienTich());
        System.out.printf("Duong cheo: %.4f %n", b.tinhDuongCheo());
    }
}
