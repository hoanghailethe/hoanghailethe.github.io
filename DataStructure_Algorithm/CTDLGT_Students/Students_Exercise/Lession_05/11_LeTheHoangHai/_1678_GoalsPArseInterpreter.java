package 11_LeTheHoangHai;

public class _1678_GoalsPArseInterpreter {
    public String interpret(String command) {
        StringBuilder result = new StringBuilder();
        String scanner  = "";

        for (int i =0; i<command.length(); i++) {
            if(command.charAt(i) == 'G') {
             result.append("G");   
            } else {
                scanner += command.charAt(i);
            }
            if(scanner.equals("()")) {
                result.append("o");
                scanner  = "";
            }
            if(scanner.equals("(al)")) {
                result.append("al");
                scanner  = "";
            }            
        }
        return result.toString();
    }
}
