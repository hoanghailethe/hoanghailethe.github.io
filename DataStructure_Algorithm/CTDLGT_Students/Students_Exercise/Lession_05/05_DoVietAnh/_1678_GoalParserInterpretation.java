package anhdv;


/**
 *
 * @author Admin
 */
public class _1678_GoalParserInterpretation {
    
    static String interpret(String command) {
        
        //String result = command.replace("()", "o").replace("(al)", "al");
        
        String result = "";
        for( int i = 0; i < command.length(); i++ ) {
            if( command.charAt(i) == 'G' ) {
                result += "G";
            }else if( command.charAt(i) == '(' && command.charAt(i+1) == ')' ) {
                result += "o";
            }else if( command.charAt(i) == '(' && command.charAt(i+1) == 'a'
                    && command.charAt(i+2) == 'l' && command.charAt(i+3) == ')' ) {
                result += "al";
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        String command1 = "G()(al)";
        String command2 = "G()()()()(al)";
        String command3 = "(al)G(al)()()G";
        System.out.println("result1: " + interpret(command1));
        System.out.println("result2: " + interpret(command2));
        System.out.println("result3: " + interpret(command3));
    }
}
