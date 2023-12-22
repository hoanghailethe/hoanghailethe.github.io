import java.util.LinkedList;
import java.util.Queue;

class _459_RepeatedSubString {
    public static boolean repeatedSubstringPattern(String s) {
        int slen = s.length();

        if(slen ==1) return false;
        
        Queue <Integer> divide = new LinkedList<>();
        
        divide.add(slen);

        int half = slen / 2;
        int primeDivide = 2;

        while(primeDivide >= 2 && primeDivide <= half) {
            if (isPrime(primeDivide)&& slen % primeDivide ==0) {
                divide.add(primeDivide);
            }
            primeDivide++;
        }

        while(!divide.isEmpty()) {
            int a = divide.poll();
            if(check(slen/a, s)) return true;
        }

        return false;
    }

    private static boolean check(int a, String s) {
        String b = s.substring(0, a);
        int begin = a;
        while (begin < s.length()) {
            String c = s.substring(begin, begin + a);
            if (!c.equals(b)) {
                return false;
            }
            begin += a;
        }
        return true;
    }

    private static boolean isPrime(int a) {     
        for(int i = 2; i <= Math.sqrt(a); i++) {
            if(a % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("abacababacab")) ;       
    }
}