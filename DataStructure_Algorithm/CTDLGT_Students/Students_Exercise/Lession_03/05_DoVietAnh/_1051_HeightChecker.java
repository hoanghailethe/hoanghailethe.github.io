package anhdv;

import java.util.Arrays;

/**
 *
 * @author anhdv
 */
class _1051_HeightChecker {

    static int heightChecker(int[] heights) {
        
        int n = heights.length;
        
        int[] heightUnSorted = new int[n];
        for( int i = 0; i < n; i++ ) {
            heightUnSorted[i] = heights[i];
        }
        System.out.println("arr UnSorted: " + Arrays.toString(heightUnSorted));
        
        for( int i = 0; i < n - 1; i++ ) {
            for( int j = 0; j < n - i - 1; j++ ) {
                if( heights[j] > heights[j + 1] ) {
                    int tmp = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j + 1] = tmp;
                }
            }
         
        }
        System.out.println("arr Sorted  : " + Arrays.toString(heights));
        
        int count = 0;
        for( int i = 0; i < n; i++ ) {
            if( heightUnSorted[i] != heights[i] ) {
                count++;
            }
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 1, 4, 2, 1, 3};
        System.out.println("count: " + heightChecker(arr));
    }
}
