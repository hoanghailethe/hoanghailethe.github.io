import java.util.LinkedList;
import java.util.Queue;

public class _394_decodeStr {
    public String decodeString(String s) {
        Queue<Character> holder = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            q.offer(s.charAt(i));
        }

        return helper(q);

    }

    public static String helperS(Queue<Character> queue) {
        StringBuilder build = new StringBuilder();

        int num = 1;
        
        while (!queue.isEmpty()) {
            char c = queue.poll();
            

            if (Character.isDigit(c)) {
                num = c * 10 + c - '0';
            } else {
                if (c == '[') {
                    while (num > 0) {
                        build.append(helperS(queue));
                        num--;
                    }
                } else if (c == ']') {
                    break;
                } else {
                    build.append(c);
                }
            }
        }
        return build.toString();
    }
}
