package day10;

public class _925_LongPressedName {
    public static void main(String[] args) {
        String name = "alex";
        String typed = "aaleex";

        System.out.println(isLongPressedName(name, typed));
    }

    /**
     * 0 ms
     * 
     * 37 MB
     * 
     * 100.00%
     */
    public static boolean isLongPressedName(String name, String typed) {
        if (typed.length() < name.length()) {
            return false;
        }
        char[] nameArr = name.toCharArray();
        char[] typedArr = typed.toCharArray();
        int j = 0;
        int i = 0;
        if (nameArr[i] != typedArr[j]) {
            return false;
        }
        i++;
        j++;
        while (i < nameArr.length && j < typedArr.length) {
            if (nameArr[i] == typedArr[j]) {
                i++;
                j++;
            } else if (typedArr[j] == nameArr[i - 1]) {
                while (j < typedArr.length && typedArr[j] == typedArr[j - 1]) {
                    j++;
                }
            } else {
                return false;
            }
        }
        while (j < typedArr.length && typedArr[j] == typedArr[j - 1]) {
            j++;
        }
        return i == nameArr.length && j == typedArr.length;
    }
}
