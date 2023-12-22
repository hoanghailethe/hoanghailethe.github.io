public class _344ReverseString {
    public static void reverseString(char[] s) {
    // Jim: cách đặt tên, và format lại code 
        char n = 'A';
    for(int i =0; i< s.length/2;i++){
        n = s[i];
        s[i] = s[s.length-1-i];
        s[s.length -1 -i] = n;
        }
    } 
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        for(char a : s){
            System.out.println(a);
        }
    }  
}
