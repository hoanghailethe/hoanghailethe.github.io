public class _771_JewelsStones {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;

        boolean[] isJem = new boolean[256];

        for(int i = 0; i < jewels.length(); i++) {
            isJem[jewels.charAt(i)] = true;
        } 
        
        for(int i = 0 ; i < stones.length(); i++) {
            if(isJem[stones.charAt(i)] == true){
                count++;
            }
        }
        return count;
    }

}
