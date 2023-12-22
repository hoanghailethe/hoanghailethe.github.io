public class _1262leetCode {
    public static void main(String[] args) throws Exception {
      String[] word1 = {"ab", "c"};
      String[] word2 = {"a", "bc"};
      System.out.println(checkEqualStrings(word1, word2));

    }

    public static boolean checkEqualStrings(String[] word1, String[] word2) {
        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        for (String s : word1) {
            stringBuilder1.append(s);
        }

        for (String s : word2) {
            stringBuilder2.append(s);
        }

        return stringBuilder1.toString().equals(stringBuilder2.toString());
    }
}
