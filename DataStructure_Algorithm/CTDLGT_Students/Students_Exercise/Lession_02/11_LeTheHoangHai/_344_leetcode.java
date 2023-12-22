import java.util.Arrays;

public class _344leetcode {
    public static void reverseString(char[] s) {
        int end = s.length-1;
        for (int i =0; i< end ; i++ ){
            char a = s[i];
            s[i] =s[end];
            s[end]= a;
            end--;
        }
    }
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        System.out.println(Arrays.toString(s));

    }
}
