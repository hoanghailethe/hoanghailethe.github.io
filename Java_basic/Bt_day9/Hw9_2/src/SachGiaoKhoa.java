public class SachGiaoKhoa extends Book implements IKho,IMuon {
    private int numOfPages;
    private String tinhTrang;
    private int soLuongMuon;

    public SachGiaoKhoa() {
        //default constructor
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
        setSoLuongMuon(Integer.valueOf(scan.nextLine()));
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "|Số trang : " + numOfPages + "|Tình trạng :" + tinhTrang + "|Số lượng mượn:"
                + soLuongMuon+"|Vị trí:"+viTri()+"|Tồn kho:"+tonKho();

    }

    @Override
    public int tonKho() {
        // TODO Auto-generated method stub
        return getQuantity() - soLuongMuon;
    }

    @Override
    public String viTri() {
        // TODO Auto-generated method stub
        return "Nằm trong kho A324";
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

    public int getSoLuongMuon() {
        return soLuongMuon;
    }

    public void setSoLuongMuon(int soLuongMuon) {
        this.soLuongMuon = soLuongMuon;
    }

    public SachGiaoKhoa(int id, String title, String publisher, int yearPublished, int quantity, int numOfPages,
            String tinhTrang, int soLuongMuon) {
        super(id, title, publisher, yearPublished, quantity);
        this.numOfPages = numOfPages;
        this.tinhTrang = tinhTrang;
        this.soLuongMuon = soLuongMuon;
    }

    
    
}
