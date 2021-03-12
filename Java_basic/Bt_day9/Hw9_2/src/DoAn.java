public class DoAn extends Book implements IKho{
    
    private int numOfPages;
    private String tinhTrang;
    private int yearProtected;

    public DoAn(){
        //defaults
    }

    @Override
    public void input() {
        // TODO Auto-generated method stub
        super.input();
        System.out.print("Nhập số trang sách : ");
        setNumOfPages(Integer.valueOf(scan.nextLine()));
        System.out.print("Nhập tình trạng sách : ");
        setTinhTrang(scan.nextLine());
        System.out.print("Nhập số lượng cho mượn : ");
        setYearProtected(Integer.valueOf(scan.nextLine()));
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "|Số trang: "+numOfPages+ "|Tình trạng: "+tinhTrang+"|Năm bảo vệ:"+yearProtected + "|Vị trí:"+viTri();
    }

    @Override
    public String viTri() {
        // TODO Auto-generated method stub
        return "Kho A28";
    }

    public DoAn(int id, String title, String publisher, int yearPublished, int quantity, int numOfPages,
            String tinhTrang, int yearProtected) {
        super(id, title, publisher, yearPublished, quantity);
        this.numOfPages = numOfPages;
        this.tinhTrang = tinhTrang;
        this.yearProtected = yearProtected;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public int getYearProtected() {
        return yearProtected;
    }

    public void setYearProtected(int yearProtected) {
        this.yearProtected = yearProtected;
    }
    
}
