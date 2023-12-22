public class _1528_ShuffleString {
    public String restoreString(String s, int[] indices) {
        char[] sChars = s.toCharArray();
        char[] result = new char[s.length()];

        for (int i = 0; i < result.length; i++) {
            result[indices[i]] = sChars[i];
        }

        return String.valueOf(result);
    }
}
