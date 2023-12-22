public class _1162Leetcode {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String x ="";
        String y ="";
        int a = word1.length;
        int b = word2.length;
        for(int i =0; i<a; i++){
            x += word1[i];
        }
        for(int i =0; i<b; i++){
            y += word2[i];
        }
        return x.equals(y);
    }
}
