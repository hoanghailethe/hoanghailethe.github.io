package anhdv;

/**
 *
 * @author anhdv
 */
class _485_MaxConsecutiveOnes {

    // Given a binary array, find the maximum number of consecutive 1s in this array.
    static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, count = 0;
        for( int i = 0; i<nums.length; i++ ) {
            if( nums[i] == 1 )
                count++;
            else {
                if( max < count )
                    max = count;
                count = 0;
            }
        }
        return Math.max(max, count);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 0, 1, 1, 1, 1, 0, 1 };
        System.out.println("result: " + findMaxConsecutiveOnes(arr));
    }
}
