
public class _344ReverseString {

    public static void swap(char[] arr, int i, int j) {

        if (i < j) {
            char t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            swap(arr, i + 1, j - 1);
        }
    }

    public static void reverseString(char[] s) {
        swap(s, 0, s.length - 1);
    }

    public static void main(String[] args) {
        char[] a = { 'b', 'l', 'a', 'c', 'k' };
        swap(a, 0, a.length - 1);
        System.out.println(a);
    }
}