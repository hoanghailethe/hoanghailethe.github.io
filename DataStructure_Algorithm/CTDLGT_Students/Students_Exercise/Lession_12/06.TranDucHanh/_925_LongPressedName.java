public class _925_LongPressedName {
    public boolean isLongPressedName(String name, String typed) {
        int n = name.length();
        int m = typed.length();
        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            char c1 = name.charAt(i);
            char c2 = typed.charAt(j);
            if (c1 != c2) {
                return false;
            }
            int count1 = 0;
            int count2 = 0;
            while (i < n && name.charAt(i) == c1) {
                i++;
                count1++;
            }
            while (j < m && typed.charAt(j) == c2) {
                j++;
                count2++;
            }
            if (count1 > count2) {
                return false;
            }

        }
        return i==n && j==m;
    }
}
