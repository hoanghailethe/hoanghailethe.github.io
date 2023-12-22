public class _1662_Check_If_Two_String_Arrays_are_Equivalent {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder(), sb2 = new StringBuilder();

        for (String w1 : word1)
            sb1.append(w1);

        for (String w2 : word2)
            sb2.append(w2);

        return sb1.toString().equals(sb2.toString());

        //        String s1="";
        //        String s2="";
        //          tạo 2 chuỗi rỗng sau đó lặp từng phần tử
        //        for(int i=0;i<word1.length;i++){
        //            s1=s1+word1[i];
        //        }
        //
        //        for(int i=0;i<word2.length;i++){
        //            s2=s2+word2[i];
        //        }
        //          nếu s1 === s2 thì return true; còn không thì false
        //        if(s1.equals(s2)){
        //            return true;
        //        }
        //        else{ return false};
    }

    public static void main(String[] args) {
        String[] str1 = {"ab", "c"};

        String[] str2 = {"a", "bc"};

        System.out.println(arrayStringsAreEqual(str1, str2));
    }
}
