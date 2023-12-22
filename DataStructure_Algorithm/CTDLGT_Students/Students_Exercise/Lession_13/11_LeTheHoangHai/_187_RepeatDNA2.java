public class _187_RepeatDNA2 {
    public List<String> findRepeatedDnaSequences(String s) {
        
        if(s == null || s.length() == 0) return new ArrayList<>();
        Set<String> results = new HashSet<>();
        int len = s.length();
        Set<String> rep = new HashSet<>();
        int dnaLen = 10;
        
        for(int i=0;i<len-dnaLen+1;++i) {
            String s1 = s.substring(i,i+dnaLen);
            if(rep.contains(s1)) results.add(s1);
            else rep.add(s1);
        }
        return new ArrayList<>(results);
    }
   
}
