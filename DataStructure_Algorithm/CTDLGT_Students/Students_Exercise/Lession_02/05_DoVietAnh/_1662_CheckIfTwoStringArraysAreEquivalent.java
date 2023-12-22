package anhdv;

import java.util.Arrays;

/**
 *
 * @author anhdv
 * Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
 */
class _1662_CheckIfTwoStringArraysAreEquivalent {

    static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        // Jim: Really bad code!
        // Code chạy đúng, nhưng khó quan sát, đồng thời người đọc cũng khó hiểu
        return Arrays.toString(word1).replaceAll(" ", "").replaceAll(",", "")
                .equals(Arrays.toString(word2).replaceAll(" ", "").replaceAll(",", ""));
    }
    
    public static void main(String[] args) {
        String[] arr01 = {"abc", "d", "defg"};
        String[] arr02 = {"abcddefg"};
        System.out.println("result: " + arrayStringsAreEqual(arr01, arr02));
    }
}
