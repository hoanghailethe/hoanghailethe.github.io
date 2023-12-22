public class _414leetCode {
    public static void thirdLargest(int arr[], int lengthArr) {
        if (lengthArr < 3) {
            System.out.printf("Mang nhap vao phai co gia tri lon hon 3");
            return;
        }

        int first = arr[0];
        for (int i = 1; i < lengthArr; i++)
            if (arr[i] > first)
                first = arr[i];

        int second = Integer.MIN_VALUE;
        for (int i = 0; i < lengthArr; i++)
            if (arr[i] > second && arr[i] < first)
                second = arr[i];

        int third = Integer.MIN_VALUE;
        for (int i = 0; i < lengthArr; i++)
            if (arr[i] > third && arr[i] < second)
                third = arr[i];

        System.out.printf("So co gia tri lon thu 3 la " + third + '\n');
    }

    public static void main(String[] args) {
        int arr[] = { 12, 13, 1, 10, 34, 16 };
        int n = arr.length;
        thirdLargest(arr, n);
    }

}
