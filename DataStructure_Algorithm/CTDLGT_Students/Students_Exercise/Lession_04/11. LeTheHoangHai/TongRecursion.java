public class TongRecursion {
    //tinhk phan tu dau tien cua a (tu a[0] den a[n-1])
    public static int tinhTong(int[]a,int k) {
        int result =0;
        //1. Dk dung
        if(k==0) {
            return a[0];
        }

        //2. ap dung CT quy nap...
        result = a[k] + tinhTong(a,k-1);

        return result;
    }
}
