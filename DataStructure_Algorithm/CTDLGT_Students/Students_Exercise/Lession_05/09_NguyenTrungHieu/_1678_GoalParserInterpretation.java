public class _1678_GoalParserInterpretation {
    
    public static String interpret(String s) {
        if (s.length() == 0)
            return "";
        if (s.substring(0, 1).equals("G")) {
            return "G" + interpret(s.substring(1));
        } else {
            if (s.substring(0, 2).equals("()")) {
                return "o" + interpret(s.substring(2));
            }
            return "al" + interpret(s.substring(4));
        }
    }

    public static void main(String[] args) {
        String command = "G()()()G(al)";
        System.out.println(command);
        System.out.println(interpret(command));
    }
}
