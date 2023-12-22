public class 1121_leetcode {
    public int balancedStringSplit(String s) {
        int count =0;
        int ballance = 0;
        for (int i =0; i<s.length(); i++) {
            if (s.charAt(i) == 'L') {
                ballance++;
            }
            if(s.charAt(i) == 'R') {
               ballance--; 
            }
            if(ballance ==0) {
                count++;
            }
        }
        return count;
        
    }
}
