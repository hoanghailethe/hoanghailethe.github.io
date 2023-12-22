public class ReverseStringNoArray {
    //Viết thuật toán đảo ngược 1 string
    static String newS = " ";

    public static void printArray(String s) {
        printCharacterK(s, s.length()-1);

    }

    //k sẽ đóng vai trò vị trí cuối cùng
    public static void printCharacterK(String s,int k) {
        System.out.println(s.charAt(k));
        printCharacterK(s, k-1);
    }
    public static void main(String[] args) {
        String s = "Hello";
        printArray(s);

    }
}