package anhdv;

import java.util.Arrays;

/**
 *
 * @author anhdv
 */
class _977_SquaresOfASortedArray {

    // Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
    static int[] sortedSquares(int[] nums) {
        int length = nums.length;
        for( int i = 0; i < length; i++ ) {
            nums[i] = (int) Math.pow(nums[i], 2);
        }
        
        boolean swapped = false;
        for( int i = 0; i < length; i++ ) {
            if( i == length - 1 ) {
                if( !swapped )
                    break;
                swapped = false;
                i = 0;
            }
            if( nums[i] > nums[i + 1] ) {
                int temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
                swapped = true;
            }
        }
        return nums;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = { -4, -1, 0, 3, 10 };
        System.out.println("result: " + Arrays.toString(sortedSquares(arr)));
    }
}
