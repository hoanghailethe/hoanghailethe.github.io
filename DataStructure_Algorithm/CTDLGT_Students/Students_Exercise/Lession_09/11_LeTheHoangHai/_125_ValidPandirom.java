public class _125_ValidPandirom {
    public static boolean isPalindrome(String s) {
        s= s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]+","");
            
        int i = 0;
        int size = s.length();
        int reIdx = size-1;
        while (i < reIdx) {
        
            char a = s.charAt(i);
            char b = s.charAt(reIdx);
            if( a!= b) {
                return false;
            }
            i++;
            reIdx--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
