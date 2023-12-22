class _1678GoalParserInterpretation {
    public static String interpret(String command) {
        StringBuilder str = new StringBuilder();
        int length = command.length();
        for (int i = 0; i < length; i++) {
            if (command.charAt(i) == 'G') {
                str.append('G');
            } else if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                str.append('o');
            } else if (command.charAt(i) == '(' && command.charAt(i + 1) == 'a') {
                str.append("al");
            }
        }

        return str.toString();
    }
    public static void main(String[] args) {
        String command = "(al)G(al)()()G";
        System.out.println(interpret(command));
    }
}