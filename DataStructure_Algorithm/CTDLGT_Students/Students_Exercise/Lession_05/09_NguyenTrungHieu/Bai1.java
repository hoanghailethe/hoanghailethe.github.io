public class Bai1{
    // public static int find(int x, int[] a, int i){
    //     if(i == a.length) return -1;
    //     if(a[i] == x) return i;
    //     return find(x, a, i+1);
    // }

    public static void merge(int[] nums1, int m, int[] nums2, int n){
        int k = nums1.length -1;
        while(k >= 0 && m > 0 && n > 0){
            nums1[k] = nums2[n-1] > nums1[m-1] ? nums2[n-1] : nums1[m-1];
            if(nums1[k] == nums2[n-1]){
                n--; 
            } else {
                m--;
            }
            k--;
        }
        if(n-1 >= 0){
            nums1[k] = nums2[n-1];
        }
    }
    
    public static void main(String[] args) {
        // int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // System.out.println(find(1, a, 0));
        int[] nums1 = {4,6,7,8,9,0,0,0};
        int[] nums2 = {1,5,10};
        merge(nums1, nums1.length-nums2.length, nums2, nums2.length);
        for (int i : nums1) {
            System.out.print(i + " ");
        }
    }
}