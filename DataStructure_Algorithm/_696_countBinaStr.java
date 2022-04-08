import java.util.HashSet;
import java.util.Set;

class Solution {
    public int countBinarySubstrings(String s) {
        int countOne = 0;
        int countZ = 0;
        Set<String> resHolder =new HashSet<>();
        StringBuilder builder = new StringBuilder();
        char lastChar = '.';

        for (int i = 0 ; i < s.length(); i++) {
            char pos = s.charAt(i);
            builder.append(pos);
            if ( pos == '0' ) {
                countZ++;
                // if last is still zero
                if (pos == lastChar) {
                    if (countOne > 0) {
                        if (countOne > countZ) {
    
                            resHolder.add(builder.substring(countOne-countZ));
                        }else if(countOne == countZ) {
                            resHolder.add(builder.toString());
                            //reset no 1 in 00111000 
                            
                            builder = builder.delete(0, countOne);
                            countOne = 0;
                        } else { //count1 < countZ
                            
                            builder = builder.delete(0, countOne);
                            countOne = 0;
                        }
                    }
                } else {
                    builder = builder.delete(0, countZ);
                    countZ = 1;
                    resHolder.add("10");
                }
                
            }
            if ( pos == '1' ) {
                countOne++;
                // if last is still 1  0001 1
                if (pos == lastChar) {
                    if (countZ > 0) {
                        if (countZ > countOne) {
    
                            resHolder.add(builder.substring(countZ-countOne));
                        }else if(countZ == countOne) {
                            resHolder.add(builder.toString());
                            //reset no 1 in 00111000 
                            
                            builder = builder.delete(0, countZ);
                            countZ = 0;
                            System.out.println(builder.toString());
                        } else {
                            
                            builder = builder.delete(0, countZ);
                            countZ = 0;
                            System.out.println(builder.toString());
                        }
                    }
                }else { //1110 1
                    builder = builder.delete(0, countOne);
                    countOne = 1;
                    resHolder.add("01");
                }
                
            }
            lastChar = pos;
            
        }
        System.out.println(resHolder);
        return resHolder.size();

    }
}