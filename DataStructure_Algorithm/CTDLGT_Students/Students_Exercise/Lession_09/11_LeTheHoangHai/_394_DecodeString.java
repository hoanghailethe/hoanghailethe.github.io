import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _394_DecodeString {
    public static String decodeString(String s) {
   
        //Pattern pattern = Pattern.compile("0-30\\[[a-z]\\]")
        Pattern pattern = Pattern.compile("(\\d+)\\[(\\w+)\\]");
        Matcher m = pattern.matcher(s);
        boolean matchFound = m.find();

        while (matchFound) {
            s = m.replaceAll((match) -> {
                //System.out.println(match);
                String replacePos = match.group();
                return decodeInnerStringValid(replacePos);
            });
            m = pattern.matcher(s);
            matchFound = m.find();
        }
        return s;
    }

    public static String decodeInnerStringValid(String s) {
        if (s.equals(""))
            return s;

        int pos = 0;
        int number = 1;
        StringBuilder result = new StringBuilder();
        int beginI = 0;
        int endI = 1;

        while (pos < s.length()) {
            if (s.charAt(pos) == '[') {
                endI = pos;
                number = Integer.parseInt(s.substring(beginI, endI));
                beginI = pos + 1;
            }

            if (s.charAt(pos) == ']') {
                endI = pos;
                for (int i = 0; i < number; i++) {
                    result.append(s.substring(beginI, endI));
                }
                beginI = pos + 1;
            }

            pos++;
        }
        return result.toString();

    }

    public static void main(String[] args) {
        //String s = "3[a]2[bc]";
        String s = "3[a2[c]]";
        System.out.println(decodeString(s));
    }
}
