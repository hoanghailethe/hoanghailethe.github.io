public class _1662_CheckIfTwoStringArraysAreEquivalent {
    public static void main(String[] args) {
        String[] word1 = { "ab", "c" };
        String[] word2 = { "a", "bc" };
        System.out.println(arrayStringsAreEqual(word1, word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder();
        for (int i = 0; i < word1.length; i++) {
            s1.append(word1[i]);
        }
        StringBuilder s2 = new StringBuilder();
        for (int i = 0; i < word2.length; i++) {
            s2.append(word2[i]);
        }
        return s1.toString().equals(s2.toString());
    }
}
