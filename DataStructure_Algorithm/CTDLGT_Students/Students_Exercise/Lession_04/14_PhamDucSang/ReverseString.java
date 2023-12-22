public class ReverseString {
    public static void reverseString(char[] s, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            char temp = s[leftIndex];
            s[leftIndex] = s[rightIndex];
            s[rightIndex] = temp;
            reverseString(s, leftIndex+1, rightIndex-1);
        }
    }

    public static void main(String[] args) {
        char[] s = {'H','a','n','n','a','h'};
        reverseString(s, 0, s.length - 1);
        System.out.println(s);
    }
}
