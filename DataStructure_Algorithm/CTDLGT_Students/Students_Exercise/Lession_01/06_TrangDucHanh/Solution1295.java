public class Solution1295 {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i =0; i < nums.length; i++){
            if((int)Math.log10(nums[i])%2 ==1){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] a1 = {10,103,104,22222,2647};
        System.out.println(findNumbers(a1));
    }
}
