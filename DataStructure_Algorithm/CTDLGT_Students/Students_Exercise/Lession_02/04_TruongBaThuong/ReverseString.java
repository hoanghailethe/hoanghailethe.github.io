public class ReverseString {
    public static void reverseStrings(char[] s){
        int run=0;
        int stop = s.length-1;
        for(int i=0;i < s.length/2;i++){
            char temp = s[i];
            s[i] = s[stop-i];
            s[stop-i]=temp;
        }
    }

    public static void main(String[] args) {
        char [] s={'h','e','l','l','o'};
        reverseStrings(s);
        for (char a : s){
            System.out.println(a);
        }
    }
}
