public class _20leetCode {
 
    static boolean isValid(String expString)
    {
        Deque<Character> restoreCh = new ArrayDeque<Character>();
 
        for (int i = 0; i < expString.length(); i++)
        {
            char x = expString.charAt(i);
 
            if (x == '(' || x == '[' || x == '{')
            {
                restoreCh.push(x);
                continue;
            }
            if (restoreCh.isEmpty())
                return false;
            char check;
            switch (x) {
            case ')':
                check = restoreCh.pop();
                if (check == '{' || check == '[')
                    return false;
                break;
 
            case '}':
                check = restoreCh.pop();
                if (check == '(' || check == '[')
                    return false;
                break;
 
            case ']':
                check = restoreCh.pop();
                if (check == '(' || check == '{')
                    return false;
                break;
            }
        }
 
        return (restoreCh.isEmpty());
    }
 
    public static void main(String[] args)
    {
        String expr = "([{}])";
        if (isValid(expr))
            System.out.println("Doi xứng");
        else
            System.out.println("Không đối xứng");
    }
}
