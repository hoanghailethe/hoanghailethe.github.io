package anhdv;

/**
 *
 * @author anhdv
 */
public class _844_BackspaceStringCompare {
    
    static boolean backspaceCompare(String S, String T) {
        return isClear(S).equals(isClear(T));
    }

    static String isClear(String S) {
        char[] arr = new char[S.length()];
        int j = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) != '#') {
                arr[j++] = S.charAt(i);
            } else if (j > 0) {
                j--;
            }
        }
        return String.valueOf(arr).substring(0, j);
    }
    
    public static void main(String[] args) {
        
        String s = "ab#c";
        String t = "ad#c";
        
        System.out.println("result: " + backspaceCompare(s, t));
    }
}
