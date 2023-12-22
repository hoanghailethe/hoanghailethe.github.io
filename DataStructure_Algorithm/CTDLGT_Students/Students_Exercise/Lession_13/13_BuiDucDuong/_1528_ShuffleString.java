package day10;

public class _1528_ShuffleString {
    /**
     * 1 ms
     * 
     * 39 MB
     * 
     * 99.95%
     */
    public String restoreString(String s, int[] indices) {
        char[] res = new char[indices.length];
        int i = 0;
        for (char c : s.toCharArray()) {
            res[indices[i++]] = c;
        }
        return String.valueOf(res);
    }
}
