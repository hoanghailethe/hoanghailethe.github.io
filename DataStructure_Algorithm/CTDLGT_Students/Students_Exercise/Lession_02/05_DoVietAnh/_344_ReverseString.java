package anhdv;

import java.util.Arrays;

/**
 *
 * @author anhdv
 * Write a function that reverses a string. The input string is given as an array of characters
 */
class _344_ReverseString {

    static void reverseString(char[] s) {
        // Jim: Trình bày tốt ! Good!
        int j = s.length - 1;
        char temp;
        for( int i = 0; i < s.length; ) {
            if( i >= j )
                break;
            
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            
            i++;
            j--;
        }
    }
    
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f'};
        reverseString(arr);
        System.out.println("result: " + Arrays.toString(arr));
    }
}
