public class ReverseString {
    public static void reverseString(char[] s, int l , int r ){
        if (l < r) {
            char c = s[l];
            s[l] = s[r];
            s[r] = c;
            reverseString(s, l+1, r-1);
        }
    }
    public static void main(String[] args) {
        char[] c = {'h','e','l','l','o'};
        reverseString(c, 0, c.length-1);
        System.out.println(c);
    }
}
