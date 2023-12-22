import java.util.List;

public class _1773CountMachine {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
    
        int count =0;
        int typeLocation =0 ;

        switch (ruleKey){
            case "type": typeLocation = 0; break;
            case "color": typeLocation = 1; break;
            case "name": typeLocation = 2; break;
        }

        for(List<String> item : items ) {          
            if (item.get(typeLocation).equals(ruleValue)) {
                count++;
            }
        }
        
        return count;
    }
}
