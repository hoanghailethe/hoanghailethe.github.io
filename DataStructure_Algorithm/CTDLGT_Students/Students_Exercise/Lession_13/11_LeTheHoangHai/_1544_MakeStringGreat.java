public class _1544_MakeStringGreat {
    public String makeGood(String s) {
        if (s.equals(""))
            return s;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (result.length() == 0) {
                result.append(s.charAt(i));
            } else {
                char top = result.charAt(result.length() - 1);
                char cur = s.charAt(i);

                if (Character.toLowerCase(top) == Character.toLowerCase(cur) && top != cur) {
                    result.deleteCharAt(result.length() - 1);
                } else {
                    result.append(cur);
                }
            }
        }

        return result.toString();
    }
}
