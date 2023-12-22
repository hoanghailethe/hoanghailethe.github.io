public class 414{
public static int thirdMax(int[]nums){
    long max = Long.MIN_VALUE;
    long val = max;
    long lar = max;
    for(int i=0;i<nums.length;i++){
        if(nums[i] > max){
            max = nums[i];
        }
        }
    for(int i=0;i<nums.length;i++){
    if(nums[i]>val && num[i]!=max){
        val = nums[i];
        }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i] > lar && nums[i] !=max && num[i]!=val){
                lar = nums[i];
        }
        }
        return lar !=Long.MIN_VALUE ? (int) lar:(int)max;

        }
       public static void main(String[]args){
    int[] nums ={3,2,1};
    System.out.println(lar(nums));

        }
        }