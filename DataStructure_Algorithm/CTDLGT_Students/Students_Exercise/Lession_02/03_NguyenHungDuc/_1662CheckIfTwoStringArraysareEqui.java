class _1662CheckIfTwoStringArraysareEquivalent {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
       
        for (String s : word1) {
            sb.append(s);
        }
        for (String s : word2) {
            sb2.append(s);
        }
        if (sb.toString().equals(sb2.toString())) {
            System.out.println(sb+" is the same as "+sb2);
            return true;
        } else {
            System.out.println(sb + " isn't the same as "+sb2);
            return false;
        }

    }

    public static void main(String[] args) {
        String[] word1 = { "abc", "d", "defg" };
        String[] word2 = { "abcddefg" };

        arrayStringsAreEqual(word1, word2);
    }
}