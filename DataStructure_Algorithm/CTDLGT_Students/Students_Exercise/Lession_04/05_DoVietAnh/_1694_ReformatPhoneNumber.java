package anhdv;

/**
 *
 * @author anhdv
 */
class _1694_ReformatPhoneNumber {

    static String formatStr(String n) {
        if( n.length() <= 3 )
            return n;
        else if( n.length() == 4 )
            return n.substring(0, 2) + "-" + n.substring(2);
        else
            return n.substring(0, 3) + "-" + formatStr(n.substring(3));
    }

    public static void main(String[] args) {
        String nums = "1 2  3-4  56";
        System.out.println("res: " + formatStr(nums.replace(" ", "").replace("-", "")));
    }
}
