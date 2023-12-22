package anhdv;

/**
 *
 * @author anhdv
 */
class _1295_FindNumbersWithEvenNumberOfDigits {

    // Given an array nums of integers, return how many of them contain an even number of digits.
    static int findNumbers(int[] nums) {
        if( nums==null || nums.length == 0 || nums.length > 500 )
            return -1;
        
        int count = 0, e;
        double exceedElementValue = Math.pow(10, 5);
        for( int i = 0; i < nums.length; i++ ) {
            
            e = nums[i];
            
            if( e > exceedElementValue )
                return -1;
            
            if( String.valueOf(e).length() % 2 == 0 )
                count++;
        }
        
        return count;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = { 12, 345, 2, 6, 7896, 55555, 100000, 11 };
        System.out.println("result: " + findNumbers(arr));
    }
}
