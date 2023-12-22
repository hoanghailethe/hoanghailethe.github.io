import java.util.ArrayList;

public class _202_HappyNumber {

    public static boolean isHappy(int n) {
        int a;
        int begin;
        if (n < 10) {
            a = n * n;
            begin = a;
        } else {
            a = n;
            begin = n;
        }

        ArrayList<Integer> nums = new ArrayList<>();

        while (true) {
            int sum = 0;
            nums.clear();

            while (a >= 10) {
                if (a % 10 != 0)
                    nums.add(a % 10);
                a /= 10;
            }
            nums.add(a);

            for (int num : nums) {
                sum += num * num;
            }

            a = sum;

            // DKdung...
            if (a == 1) {
                return true;
            }
            if (a == begin || a == 4) {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(isHappy(7));
    }
}
