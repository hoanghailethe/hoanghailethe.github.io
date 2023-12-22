public class Fibonaxi {
    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int fi_1 = 0, fi_2 = 1, fi_3 = 0;
        int index = 2;
        while (index <= n) {
            fi_3 = fi_1 + fi_2;
            fi_1 = fi_2;
            fi_2 = fi_3;
            index++;
        }
        return fi_3;
    }

    public static void main(String[] args) {
        System.out.println(fib(6));
    }
}
