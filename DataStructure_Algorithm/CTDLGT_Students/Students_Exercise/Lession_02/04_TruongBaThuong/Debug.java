public class Debug {
    private static void thisIsAFunction(int k) {
        System.out.println("K la so " + (k%2 == 0 ? "Chan" : "Le"));
    }
    public static void main(String[] args) {
        int n = 10;
        int k = 0;
        for (int i = 0; i < n; i++) {
            k++;
            if(k == 5){
                System.out.println("k = 5");
            }
            thisIsAFunction(k);
        }
    }
}
