import java.util.Stack;

public class BackspaceStringCompare {
    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> stackS = new Stack<>();
        for (char cs : s.toCharArray()) {
            if (cs != '#')
                stackS.push(cs);
            else if (!stackS.empty())
                stackS.pop();
        }
        Stack<Character> stackT = new Stack<>();
        for (char cT : t.toCharArray()) {
            if (cT != '#')
                stackT.push(cT);
            else if (!stackT.empty())
                stackT.pop();
        }
        return stackS.equals(stackT);
    }

    public static void main(String[] args) {
        System.out.println(backspaceCompare("a##c", "#a#c"));
    }
}
