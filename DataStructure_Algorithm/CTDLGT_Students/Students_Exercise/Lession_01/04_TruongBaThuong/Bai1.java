public class Bai1 {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int max =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            else{
                if(max<count){
                    max = count;
                }
                count =0;

            }
        }
        return max>count? max:count;


    }
    public static void main(String[] args) {
        int [] nums = {1,1,1,0,1,1,1,1};
        System.out.println("Out:"+findMaxConsecutiveOnes(nums));
    }
}