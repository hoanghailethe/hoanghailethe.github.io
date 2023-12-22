public class _1678Goal{
    public static String interpret(String command){
        StringBuilder sb = new StringBuilder();
        int start = 0;
        for(int i = 0;i<command.length();i++)
        {
            if (command.charAt(i) == 'G')
                sb.append('G');
            else if (command.charAt(i) == '(') {
                start = i;
            } else if (command.charAt(i) == ')') {
                if (i - start == 1)
                    sb.append('o');
                else
                    sb.append("al");
            }
    
           
        }
        return sb.toString();
    }
        public static void main(String[] args) {
            String command = "(al)G(al)()()G";
            System.out.println(interpret(command));
        }
    
}