public class _344ReverseStringNoArray {
    //Viết thuật toán đảo ngược 1 string
    static String newS = " ";

    public static void printArrayReverse(String s) {
        printCharacterK(s, s.length()-1);

    }

    //k sẽ đóng vai trò vị trí cuối cùng
    public static void printCharacterK(String s, int k) {
        System.out.println(s.charAt(k));
        printCharacterK(s, k - 1);
    }
    
    //Viết thuật toán in String theo chiều thuận
    public static void printArray(String s) {
        printCharacterL(s, s.length()-1);
    }

    public static void printCharacterL(String s, int l){
        printCharacterL(s, l-1);
        System.out.println(s.charAt(l));
    }

    public static void main(String[] args) {
        String s = "Hello";
        printArrayReverse(s);
        printArray(s);

    }
}
