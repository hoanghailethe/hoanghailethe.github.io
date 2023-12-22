public class _344_reverseString {
    public void reverseString(char[] s) {
        int end = s.length-1;
        for(int i =0; i<end ; i++ ){
            char a = s[i];
            s[i] =s[end];
            s[end]= a;
            end--;
        }
    }
}
