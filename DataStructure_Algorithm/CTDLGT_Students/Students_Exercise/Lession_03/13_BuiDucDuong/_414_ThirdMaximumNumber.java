public class _414_ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println(thirdMax(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int thirdMax(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int val = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] > val) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = val;
        }
        int count = 1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != arr[i + 1]) {
                count++;
                if (count == 3) {
                    return arr[i];
                }
            }
        }
        return arr[arr.length - 1];
    }
}
