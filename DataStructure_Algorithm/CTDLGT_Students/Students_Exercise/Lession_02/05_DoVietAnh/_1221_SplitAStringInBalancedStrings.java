package anhdv;

/**
 *
 * @author anhdv
 * Balanced strings are those that have an equal quantity of 'L' and 'R' characters.
Given a balanced string s, split it in the maximum amount of balanced strings.
Return the maximum amount of split balanced strings.
 */
class _1221_SplitAStringInBalancedStrings {

    static int balancedStringSplit(String s) {
        // Jim: Good! Nhưng nên cho ngoặc và cả if và else 
        int lCount = 0, rCount = 0, max = 0;
        for( int i = 0; i < s.length(); i++ ) {
            if( s.charAt(i) == 'L' )
                lCount++;
            else
                rCount++;
            if( lCount == rCount )
                max++;
        }
        return max;
    }
    
    public static void main(String[] args) {
        String input = "LRRLLRLLRRRRRLLL";
        System.out.println("msx: " + balancedStringSplit(input));
    }
}
