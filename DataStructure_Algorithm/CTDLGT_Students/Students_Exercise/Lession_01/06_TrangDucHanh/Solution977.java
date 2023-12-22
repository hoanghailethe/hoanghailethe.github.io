public class Solution977 {
    public static int findIndexPositive(int[] nums){
        int  a=nums.length;
        for(int i =0; i< nums.length;i++){
            if(nums[i]>=0){
                a = i;
                break;
            }
            
        }
        return a;
    }
    public static int[] sortedSquares(int[] nums) {
        int[] v = new int[nums.length];
        int i = findIndexPositive(nums);
        int j = findIndexPositive(nums) -1;
        int k =0;
        while (j>=0 || i<nums.length){
            if (j>=0 && i < nums.length){
                if(nums[i] * nums[i]<=nums[j] * nums[j]){
                    v[k] = nums[i] * nums[i];
                    k++;i++;
                }
                else{
                    v[k] =  nums[j] * nums[j];
                    k++;j--;
                }
            }
            else if(j>=0){
                v[k] = nums[j]*nums[j];
                j--;
                k++;
            }
            else {
                v[k] = nums[i]*nums[i];
                i++;
                k++;
            }
            
        }
     return v;   
    }
    public static void main(String[] args) {
        int[] v = {-4,-3,-2,-1};
        for(int s : sortedSquares(v)){
            System.out.println(s);
        }
    }
    
}