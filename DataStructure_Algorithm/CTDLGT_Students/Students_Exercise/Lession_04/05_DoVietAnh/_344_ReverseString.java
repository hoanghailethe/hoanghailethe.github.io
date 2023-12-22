package anhdv;

import java.util.Arrays;

/**
 *
 * @author anhdv
 * Write a function that reverses a string. The input string is given as an array of characters
 */
class _344_ReverseString {

    static void reverseString(char[] arrInput, char[] res, int index) {
        if( arrInput.length == 0 )
            return;
        
        res[index] = arrInput[arrInput.length - 1];
        char[] newArr = Arrays.copyOfRange(arrInput, 0, arrInput.length - 1);
        reverseString(newArr, res, ++index);
    }
    
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f'};
        char[] res = new char[arr.length];
        reverseString(arr, res, 0);
        System.out.println("res: " + Arrays.toString(res));
    }
}
