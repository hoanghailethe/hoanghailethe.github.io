public class Rectangle extends Shape implements IRectangle{
    private float chieuDai;
    private float chieuRong;
    
    @Override
    public double tinhDuongCheo() {
        // TODO Auto-generated method stub
        return Math.sqrt(Math.pow(chieuDai, 2) + Math.pow(chieuRong, 2));
    }
    @Override
    public double chuVi() {
        // TODO Auto-generated method stub
        return 2*(chieuDai+chieuRong);
    }
    @Override
    public double dienTich() {
        // TODO Auto-generated method stub
        return chieuDai*chieuRong;
    }

    public float getChieuDai() {
        return chieuDai;
    }
    public void setChieuDai(float chieuDai) {
        this.chieuDai = chieuDai;
    }
    public float getChieuRong() {
        return chieuRong;
    }
    public void setChieuRong(float chieuRong) {
        this.chieuRong = chieuRong;
    }
    public Rectangle(float chieuDai, float chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    
}
