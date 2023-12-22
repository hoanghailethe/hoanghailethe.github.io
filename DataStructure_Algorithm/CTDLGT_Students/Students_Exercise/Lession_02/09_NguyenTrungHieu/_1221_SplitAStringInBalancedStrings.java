public class _1221_SplitAStringInBalancedStrings {
    public static int balancedStringSplit(String s) {
        int amount = 0;
        int countR = 0;
        int countL = 0;
        for(int i = 0; i< s.length(); i++){
            if(s.charAt(i) == 'R'){
                countR++;
            } else {
                countL++;
            }
            // Jim: Sao đoạn này giống của Mạnh thế?
            if(countL == countR){
                amount++;
            }
        }
        return amount;
    }
    public static void main(String[] args) {
        String s = "RLRRRLLRLL";
        System.out.println(balancedStringSplit(s));
    }
}
