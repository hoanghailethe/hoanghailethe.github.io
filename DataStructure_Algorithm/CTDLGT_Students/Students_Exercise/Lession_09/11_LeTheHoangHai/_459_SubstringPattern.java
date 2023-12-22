public class _459_SubstringPattern {
    public static boolean repeatedSubstringPattern(String s) {
        int endIndex = 1;
        String beginStr = s.substring(0, endIndex);

        while (endIndex <= s.length() / 2) {

            if (checkNextToEnd(beginStr, s.substring(endIndex))) {
                // System.out.println(endIndex);
                // System.out.println(beginStr);
                return true;

            } else {
                endIndex++;
                beginStr = s.substring(0, endIndex);
            }
        }
        return false;
    }

    public static boolean checkNextToEnd(String a, String b) {
        int aSize = a.length();
        int startId = 0;
        int endId = 0 + aSize;

        if(a.equals(b)) return true;

        if (b.length() % aSize != 0)
            return false;

        while (endId <= b.length()) {

            if (!b.substring(startId, endId).equals(a)) {
                return false;
            }
            startId = endId;
            endId += aSize;
        }

        return true;
    }

    public static void main(String[] args) {
        //String s = "abab";
        String s = "ababba";
        System.out.println(repeatedSubstringPattern(s));
    }
}
