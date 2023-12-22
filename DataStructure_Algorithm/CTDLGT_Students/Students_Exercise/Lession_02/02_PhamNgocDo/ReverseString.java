class ReverseString {
    public static void reverseString(char[] s) {
        int z =s.length;
        for (int i = 0; i < s.length/2; i++) {
            char c = s[i];
            s[i]=s[z-1];
            s[z-1]=c;
            z--;
        }

    }
    
    public static void main(String[] args) {
        char[] c ={'h','e','c','l','o'};
    reverseString(c);
    System.out.println(c);
    }

}
