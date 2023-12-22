
public class _1678_GoalParserInterpretation {
    public static void main(String[] args) {
        String command = "(al)G(al)()()G";

        interpret(command);
    }

    public static String interpret(String command) {
        // command = command.replace("()", "o");
        // command = command.replace("(al)", "al");
        
        StringBuilder cmd = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == '(') {
                if (command.charAt(i + 1) == ')') {
                    cmd.append("o");
                } else {
                    cmd.append("al");
                }
            }
            if (command.charAt(i) == 'G') {
                cmd.append("G");
            }

        }

        return cmd.toString();
    }
}
