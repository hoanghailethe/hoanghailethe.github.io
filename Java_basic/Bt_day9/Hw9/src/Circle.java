public class Circle extends Shape implements ICircle {
    private float banKinhR;

    @Override
    public float tinhDuongKinh() {
        // TODO Auto-generated method stub
        return banKinhR*2;
    }

    @Override
    public double chuVi() {
        // TODO Auto-generated method stub
        return 2* (Math.PI) * banKinhR;
    }

    @Override
    public double dienTich() {
        // TODO Auto-generated method stub
        return (Math.PI) * banKinhR *banKinhR;
    }

    public float getBanKinhR() {
        return banKinhR;
    }

    public void setBanKinhR(float banKinhR) {
        this.banKinhR = banKinhR;
    }

    public Circle(float banKinhR) {
        this.banKinhR = banKinhR;
    }

}
