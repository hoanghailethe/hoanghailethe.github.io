public class _1678_GoalPaser {
    public String goalPaser(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }
}