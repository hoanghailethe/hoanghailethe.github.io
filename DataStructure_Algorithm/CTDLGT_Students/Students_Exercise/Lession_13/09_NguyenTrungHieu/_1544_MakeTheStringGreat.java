public class _1544_MakeTheStringGreat {
    public static String makeGood(String s) {
        StringBuilder str = new StringBuilder(s);
        for (int i = 0; i < str.length()-1; i++) {
            if(Math.abs(str.charAt(i) - str.charAt(i+1)) == 32 && str.charAt(i) != str.charAt(i+1)){
                str.delete(i, i+2);
                i=-1;
            }
        }
        return str.toString();
    }


    public static void main(String[] args) {
        String s = "abBAcC";
        System.out.println(makeGood(s));
        // System.out.println(97-65);
    }
}
