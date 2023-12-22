public class _1295bt {

    public static void main(String[] args) {
        int[] nums1 = { 12, 345, 2, 6, 7896 };
        findNumbers(nums1);
    }

    public static int findNumbers(int[] nums) {
        int a = 0;
        for (int n : nums) {
            int b = 1;
            while ((n / 10) > 0) {
                b++;
                n = n / 10;
            }
            if (b % 2 == 0) {
                a++;
            }

        }

        System.out.println(a);
        return a;

    }

}
