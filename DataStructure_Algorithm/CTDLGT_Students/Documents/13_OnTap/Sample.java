import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

public class Sample{

    public String addBinary(String strA, String strB) {
        char[] a = strA.toCharArray();
        char[] b = strB.toCharArray();
        int ia = a.length - 1;
        int ib = b.length - 1;
        String result = "";

        int sodu = 0;
        while(ia >= 0 && ib >= 0){
            int xa = a[ia] - '0';
            int xb = b[ib] - '0';
            int kq = xa + xb + sodu;
            int c = kq % 2;
            result = c + result;
            sodu = kq / 2;
            ia--;
            ib--;
        }
        while(ia >= 0){
            int xa = a[ia] - '0';
            int kq = xa + sodu;
            int c = kq % 2;
            result = c + result;
            sodu = kq / 2;
            ia--;
        }
        while(ib >= 0){
            int xb = b[ib] - '0';
            int kq = xb + sodu;
            int c = kq % 2;
            result = c + result;
            sodu = kq / 2;
            ib--;
        }

        if(sodu > 0)
            result = sodu + result;

        return result;
    }


    public boolean isToeplitzMatrix(int[][] a) {
        int n = a.length;
        int m = a[0].length;

        // Xet theo cot
        for (int j = 0; j < m; j++) {
            int x = a[0][j];
            int newJ = j;
            for (int i = 0; i < n && newJ < m; i++, newJ++) {
                if(a[i][newJ] != x)
                    return false;
            }
        }

        // Xet theo hang
        for (int i = 1; i < n; i++) {
            int newI = i;
            int x = a[i][0];
            for (int j = 0; j < m && newI < n; j++, newI++) {
                if(a[newI][j] != x)
                    return false;
            }
        }

        return true;
    }

    int distance = Math.abs('a' - 'A');
    public void buildingResult(StringBuilder sb, char c)
    {
        int n = sb.length();
        if(n == 0){
            sb.append(c);
        }else{
            char last = sb.charAt(n-1);
            if(last != c && Math.abs(last - c) == distance){
                sb.deleteCharAt(n-1);
            }else{
                sb.append(c);
            }
        }
    }

    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder();
        char[] a = s.toCharArray();
        
        for (char c : a) {
            buildingResult(sb, c);
        }

        return sb.toString();
    }


    public int longestPalindrome(String s) {
        int[] count = new int[150];
        char[] a = s.toCharArray();

        for (char c : a) {
            count[c]++;
        }

        int result = 0;
        int maxOdd = 0;
        for (int x : count) {
            if((x) % 2 == 0){
                result += x;
            }else{
                if(x > maxOdd){
                    maxOdd = x;
                }
                result += (x-1);
            }
        }
        result += (maxOdd != 0 ? 1: 0);
        return result;
    }


    public boolean wordPattern(String pattern, String s) {
        char[] p = pattern.toCharArray();
        String[] a = s.split(" ");
        Map<Character, String> map = new HashMap<>();

        if(p.length != a.length)
            return false;
        
        for (int i = 0; i < p.length; i++) {
            char key = p[i];
            String value = a[i];
            if(map.containsKey(key) == false){
                if(map.containsValue(value) == true){
                    return false;   
                }else{
                    map.put(key, value);
                }
            }else{
                if(map.containsValue(value) == false){
                    return false;
                }else{
                    if(value.equals(map.get(key)) == false){
                        return false;
                    }
                }
            }
        }

        return true;
    }


    public int maxProfit(int[] prices) {
        // Gia cao nhat khi ban vao ngày i
        int n = prices.length;
        int[] bestProfitAtSell = new int[n];
        int[] bestBuy = new int[n];

        for (int i = 0; i < n; i++) {
            bestBuy[i] = -1;
        }

        for (int i = 1; i < n; i++) {
            int bestProfit = 0;
            for (int j = i-1; j >= 0; j--) {
                if(prices[i] - prices[j] > bestProfit){
                    bestBuy[i] = j;
                }
            }
            bestProfitAtSell[i] = bestProfit;
        }


        int bestResult = 0;
        for (int i = n-1; i >= 0; i--) {
            int bestProfit = bestProfitAtSell[i];
            if(bestProfit > 0)
            {
                
            }
            for (int j = ; j < bestBuy.length; j++) {
                
            }

        }


        return bestResult;
    }

    public static void main(String[] args) {
        Sample s = new Sample();
        System.out.println(s.longestPalindrome("aabbcccd"));
    }
}