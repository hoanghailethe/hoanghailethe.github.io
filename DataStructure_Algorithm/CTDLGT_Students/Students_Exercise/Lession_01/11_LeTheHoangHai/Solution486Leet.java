
    public class Solution486Leet{
        public static boolean predictTheWinner(int[] nums) {
            int total =0;
            int size = nums.length;
            
            if (size == 1) {
                return true;
            }
            if(size % 2 == 0) {
                return true;
            } else {
                int sumOdd =0;
                for (int i =0; i<size; i++) {
                    total += nums[i];
                    
                    if (i%2 != 0) {
                        sumOdd += nums[i];
                    }
                }
                int sumEven1 = (total -sumOdd) - nums[0] ;
                int sumEven2 = (total -sumOdd) - nums[size-1];
                if (nums[2] + nums[size-2] > total/2 || nums[size-3] +nums[2] >total/2 ) {return false;} 
                if( nums[0] > (Math.abs(sumEven1-sumOdd))  || nums[size-1] >(Math.abs(sumEven2-sumOdd))) {
                    return true;
                } else {
                    return false;
                }
            }
        }
    
    public static void main(String[] args) {
        int[] arr= {0,0,7,6,5,6,1};
        boolean test = predictTheWinner(arr);
        System.out.println(test);
    }
}


    

