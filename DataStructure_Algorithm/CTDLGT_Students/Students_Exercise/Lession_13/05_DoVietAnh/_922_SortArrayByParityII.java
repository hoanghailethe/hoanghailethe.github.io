package anhdv.graph;

import java.util.Arrays;

/**
 *
 * @author anhdv
 */
public class _922_SortArrayByParityII {
    
    static int[] sortArrayByParityII(int[] nums) {
        
        if( nums==null )
            return null;
        
        int[] result = new int[nums.length];
        
        int resultEvenIndex = 0;
        int resultOddIndex = 1;
        
        for(int i = 0; i < nums.length; i++){
            if( nums[i]%2 == 0 ) {
                result[resultEvenIndex] = nums[i];
                resultEvenIndex += 2;
            }else {
                result[resultOddIndex] = nums[i];
                resultOddIndex += 2;
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        
        int[] nums = { 4, 2, 5, 7 };
        
        System.out.println("result: " + Arrays.toString(sortArrayByParityII(nums)));
    }
}
