public class _1678GoalParserInterpretation {
    public static String interpret(String command) {
        command = command.replace("()", "o").replace("(al)", "al");
        return command;
    }

    public static void main(String[] args) {
        String command = "G()()()()(al)";
        System.out.println(interpret(command));
    }
}
