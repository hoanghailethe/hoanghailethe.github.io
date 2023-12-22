public class _1662CheckIfTwoStringArraysareEquivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2){
        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        for(String s : word1){
            stringBuilder1.append(s);
        }
        for(String b : word2){
            stringBuilder2.append(b);
        }
        return stringBuilder1.toString().equals(stringBuilder2.toString());
    }

}
