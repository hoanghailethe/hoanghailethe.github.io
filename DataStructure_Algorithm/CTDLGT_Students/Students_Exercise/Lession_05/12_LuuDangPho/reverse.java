public class reverse {
    public static void printReverse(String s) {
        printCharacterK(s, s.length() - 1);
    }

    public static void printCharacterK(String s, int k) {
        //dieu kien dung
        if (k < 0)
            return;

        //cong thuc quy nap
        System.out.print(s.charAt(k));
        printCharacterK(s, k - 1);
    }

    public static void main(String[] args) {
        String s = "123";
        printReverse(s);
    }
}
