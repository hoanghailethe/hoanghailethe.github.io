class _125ValidPalindrome {
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]+", "");
        s = s.toLowerCase();

        
        for (int i = 0, j = (s.length() - i) - 1; i < s.length()/2; i++, j--) {
            char c = s.charAt(i);
            char cj = s.charAt(j);
            if (c != cj) {
                return false;
            }
        }
        
        return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}