public class GoalParserInterpretation {
    public static String interpret(String command) {
        String result ="";
        int i =1;
        while(i<=command.length()){
            if(command.substring(i-1, i).equals("G")) {
                result+="G";
                i+=1;
            }
            else if(command.substring(i-1, i).equals("(")){
                if(command.substring(i, i+1).equals(")")) {
                    result+="o";
                    i+=2;
                }
                else {result+="al";
                   i+=4;
            }
            }
        
        }
        
        return result;
        
    }
    public static void main(String[] args) {
        System.out.println(interpret("G()()()()(al)"));
    }
}
