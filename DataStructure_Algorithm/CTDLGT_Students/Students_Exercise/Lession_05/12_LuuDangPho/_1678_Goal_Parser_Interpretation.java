public class _1678_Goal_Parser_Interpretation {
    public static String interpret(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }

    public static void main(String[] args) {
        String s = "G()(al)", x = "G()()()()(al)", z = "(al)G(al)()()G";
        System.out.println(interpret(s));
        System.out.println(interpret(x));
        System.out.println(interpret(z));

    }
}
