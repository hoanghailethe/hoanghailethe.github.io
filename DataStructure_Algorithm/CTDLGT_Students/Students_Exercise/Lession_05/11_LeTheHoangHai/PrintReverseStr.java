public class PrintReverseStr {
    public static void printReverseStr(String s) {
        int i = s.length();      
   

        if (i <= 0) {
            System.out.print(s);


            System.out.println();
        } else {
            System.out.print(s.charAt(i-1));
            printReverseStr(s.substring(0, i-1));
        }
    }
    public static void main(String[] args) {
        String s = "123";
        printReverseStr(s);
    }
}
