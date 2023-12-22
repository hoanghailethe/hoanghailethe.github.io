import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class OnTap{


    public boolean isToeplitzMatrix(int[][] a) {
        int n = a.length;
        int m = a[0].length;

        // Xet theo cot
        for (int j = 0; j < m; j++) {
            int key = a[0][j];
            int tempJ = j;
            for (int i = 0; i < n && tempJ < m; i++) {
                if(a[i][tempJ] != key)
                    return false;
                tempJ++;
            }
        }

        // Xet theo hang
        for (int i = 1; i < n; i++) {
            
            int key = a[i][0];
            int tempI = i;

            for (int j = 0; j < m && tempI < n; j++, tempI++) {
                if(a[tempI][j] != key)
                    return false;
            }
        }

        return true;
    }


    public int longestPalindrome(String s) {
        char[] a = s.toCharArray();
        int[] count = new int[150];

        for (char c : a) {
            count[c]++;
        }
        
        int result = 0;
        for (int soLanXuatHien : count) {
            // Voi cac phan tu so lan xuat hien chan
            if(soLanXuatHien % 2 == 0){
                result += soLanXuatHien;
            }else{
                result += (soLanXuatHien - 1);
            }
        }

        //Kiem tra con thua khong?>
        if(s.length() - result > 0)
            result++;

        return result;
    }

    public String makeGood(String s) {
        String result = "";
        char[] a = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char c : a) {
            if(stack.isEmpty() == true){
                stack.push(c);
            }else{
                char topChar = stack.peek();
                if(c != topChar && 
                    Character.toLowerCase(c) == Character.toLowerCase(topChar)){
                    stack.pop();
                }else{
                    stack.push(c);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Character character : stack) {
            sb.append(character);
        }

        return sb.toString();
    }

    public boolean wordPattern(String pattern, String sInput) {
        char[] p = pattern.toCharArray();
        String[] s = sInput.split(" ");
        Map<Character, String> map = new HashMap<>();

        if(p.length != s.length)
            return false;

        for (int i = 0; i < s.length; i++) {
            char key = p[i];
            String value = s[i];

            if(map.containsKey(key) == false){
                if(map.containsValue(value) == true){
                    return false;
                }else{
                    map.put(key, value);
                }
            }else{ // Da ton tai key
                String valueInMap = map.get(key);
                if(value.equals(valueInMap) == false){
                    return false;
                }
            }
        }

        return true;
    }


    public String addBinary(String a, String b) {
        String s = "";
        
    }

    public static void main(String[] args) {
        OnTap ontap = new OnTap();
        System.out.println(ontap.wordPattern("abba", "dog cat cat dog"));
    }
}