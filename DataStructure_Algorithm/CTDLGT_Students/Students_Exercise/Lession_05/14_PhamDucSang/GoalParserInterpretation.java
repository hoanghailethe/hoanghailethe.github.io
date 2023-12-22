public class GoalParserInterpretation {
    public String interpret(String command) {
        StringBuilder goalStringBuilder = new StringBuilder();
        int index = 0;
        while (index < command.length()) {
            if (command.charAt(index) == 'G') {
                goalStringBuilder.append("G");
                index++;
            } else if (command.charAt(index) == '(' && command.charAt(index+1) == ')') {
                goalStringBuilder.append("o");
                index += 2;
            } else {
                goalStringBuilder.append("al");
                index += 4;
            }
        }
        return goalStringBuilder.toString();
    }
    
}
