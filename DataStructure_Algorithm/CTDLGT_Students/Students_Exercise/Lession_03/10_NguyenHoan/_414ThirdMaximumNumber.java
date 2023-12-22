public class _414ThirdMaximumNumber {

    public static void printArray(long[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d,", arr[i]);
        }
        System.out.println(
        );
    }

    public static void insert(int val, long[] maxArr) {
        int i = 0;
        while (i < maxArr.length) {
            if (val == maxArr[i]) {
                return;
            } else if (val > maxArr[i]) {
                break;
            } else {
                i++;
            }
        }
        if (i < maxArr.length) {
            for (int j = maxArr.length - 2; j >= i; j--) {
                maxArr[j + 1] = maxArr[j];
            }
            maxArr[i] = val;
        }

        printArray(maxArr);
    }

    public static int thirdMax(int[] nums) {
        long[] maxArr = { Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE };
        for (int i = 0; i < nums.length; i++) {
            insert(nums[i], maxArr);
        }
        if (maxArr[2] == Long.MIN_VALUE) {
            return (int) maxArr[0];
        }
        return (int) maxArr[2];

    }

    public static void main(String[] args) {
        int [] a = {5,2,4,1,3,6,0};
        System.out.println(thirdMax(a));
    }
}
