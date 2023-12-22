public class _1221SplitaStringinBalancedStrings {
    public int balancedStringSplit(String s) {
        int r =0;
        int l=0;
        int count = 0;
        // Jim: Cần format lại code, ko được gộp các dòng code lại cho ngắn
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i)== 'R'){ r++;}
            else{l++;}
            if(r == l){count++;}
        }
        return count;
 }
}
