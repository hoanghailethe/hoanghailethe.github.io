public class _704leetCode {
    public static void main(String[] args) throws Exception {
       int arr1[] = { 1,2,6,8,9,10 };
        reveserString(arr1 , 9);
    }

    public static void reveserString(int[] arr , int num) {
        num = 9;
        for (int i = 0; i < arr.length; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length - 1];
            arr[arr.length - 1] = temp;

        }
        System.out.println(arr);
     }
}