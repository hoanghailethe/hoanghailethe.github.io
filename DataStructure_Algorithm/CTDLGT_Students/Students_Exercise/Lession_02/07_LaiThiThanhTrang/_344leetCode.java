public class _344leetCode {
    public static void main(String[] args) throws Exception {
        char arr1[] = { 'h','a','n','n','a','H' };
        reveserString(arr1);
    }

    public static void reveserString(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length - 1];
            arr[arr.length - 1] = temp;

        }
        System.out.println(arr);
     }
}
