public class reverse_thuan {
    public static void printReverse(String s) {
        printCharacterK(s, s.length() - 1);
    }

    public static void printCharacterK(String s, int k) {
        //dieu kien dung
        if (k < 0)
            return;

        //cong thuc quy nap
        printCharacterK(s, k - 1);
        System.out.print(s.charAt(k));
    }

    public static void main(String[] args) {
        String s = "123";
        printReverse(s);
    }
}
