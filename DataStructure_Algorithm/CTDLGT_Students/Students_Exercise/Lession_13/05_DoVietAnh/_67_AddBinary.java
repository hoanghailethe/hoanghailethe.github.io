package anhdv.graph;

/**
 *
 * @author anhdv
 */
public class _67_AddBinary {
    
    static String addBinary(String a, String b) {
        
        StringBuilder sb = new StringBuilder();
        
        int tmp = 0, carry = 0, i = a.length() - 1, j = b.length() - 1;
        
        while (i >= 0 || j >= 0) {
            tmp = carry;
            if (i >= 0)
                tmp += a.charAt(i--) - '0';
            
            if (j >= 0)
                tmp += b.charAt(j--) - '0';
            
            sb.append(tmp % 2);
            
            carry = tmp / 2;
        }
        if (carry > 0)
            sb.append(1);

        return sb.reverse().toString();
    }
    
    public static void main(String[] args) {
        
        String a = "1010", b = "1011";
        
        System.out.println("result: " + addBinary(a, b));
    }
}
