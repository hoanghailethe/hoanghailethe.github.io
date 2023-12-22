class _1221SplitaStringinBalancedStrings {
    public static int balancedStringSplit(String s) {
        int count = 0;
        //"RLLLLRRRLR"
        int charCount = 0;
        
        for (int i = 0; i < s.length(); i++) {
            
            if (s.charAt(i) == 'R') {
                charCount++;
                ;
                
            } else if (s.charAt(i) == 'L') {
                charCount--;

            }
            if (charCount == 0) {
                count++;
            }
            
            
        }
        return count;
        
    }
    public static void main(String[] args) {
        String s = "RLLLLRRRLR";
        
        System.out.println(balancedStringSplit(s));

    }
}