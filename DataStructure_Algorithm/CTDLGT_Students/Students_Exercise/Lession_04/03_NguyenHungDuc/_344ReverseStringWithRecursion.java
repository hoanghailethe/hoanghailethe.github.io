class _344ReverseStringWithRecursion {
    static char[]s;

    public void reverseString(char[] s) {
        this.s = s;
        recursion(0, s.length - 1);

        for (char c : s) {
            System.out.println(c);
        }
        
        
    }
    public static void recursion(int i, int j){
        if(i >= j)
            return;
        
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;

        recursion(i+1, j-1);
        
    }
    public static void main(String[] args) {
        char[] s = { 'H','a','n','n','a','h' };
        _344ReverseStringWithRecursion abc = new _344ReverseStringWithRecursion();
        abc.reverseString(s);

        
    }
}