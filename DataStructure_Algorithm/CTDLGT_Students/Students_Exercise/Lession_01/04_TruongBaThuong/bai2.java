
public class bai2 {
    public static void main(String[] args) {
        
    }
    public static int Numbers(int[] nums){
        int sc = 0;
        for (int i = 0; i < nums.length; i++) {
            int dem = 1;
            while (nums[i] / 10 != 0) {
                dem++;
                nums[i] = nums[i] / 10;
            }
            if (dem % 2 == 0) {
                sc++;
            }
        }
        return sc;

    }
    
}
