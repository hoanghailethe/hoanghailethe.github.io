public class _704BinarySearch {
    public static int binarySearch(int []a, int L, int R,int x){
        if (L>R){
            return -1;
        }
        int k = (R+L)/2;
        if (x==a[k]){
           return k;
        }
        if (x<a[k]) {
            return binarySearch(a, L, k-1, x);
        }
        return binarySearch(a, k+1, R, x);
    }
    
    public int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length-1, target);
    }

    public static void main(String[] args) throws Exception {
       int [] nums = {-1,0,3,5,9,12};
       int target = 9;
      System.out.println(binarySearch(nums, 0, nums.length-1, target));
    }
}
