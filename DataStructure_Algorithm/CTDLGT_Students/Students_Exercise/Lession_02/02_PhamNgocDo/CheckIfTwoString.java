public class CheckIfTwoString {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String a ="";
        String b ="";
        for(String i : word1){
            a+=i;
        }
        for(String i : word2){
            b+=i;
        }
        if(a.equals(b)) return true;
        return false;
    }
    public static void main(String[] args) {
        String[] word1 ={"ab", "c"};
        String[] word2 ={"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }
}
