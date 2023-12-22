public class ThirdMaximumNumber {
    public static int[] insertSort(int[] a) {
        int index, value;
        for (int i = 1; i < a.length; i++) {
            index = i;
            value = a[i];
            while (index > 0 && a[index - 1] > value) {
                a[index] = a[index - 1];
                index--;
            }
            a[index] = value;
        }
        return a;
    }

    public static int thirdMax(int[] nums) {
        nums=insertSort(nums);
        int x = nums[nums.length-1];
        for (int i = nums.length-2; i >=0; i--) {
            if (nums[i] < x) {
                x = nums[i];
                break;
            }
        }
        for (int i = nums.length-3; i >=0; i--) {
            if (nums[i] < x) {
                x = nums[i];
                return x;
            }
        }
        return nums[nums.length - 1];
    }

    public static void printArray(int a[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        int a[] = new int[] { 3, 2, 1 };
        System.out.println("so lon t3 : " + thirdMax(a));
    }
}
