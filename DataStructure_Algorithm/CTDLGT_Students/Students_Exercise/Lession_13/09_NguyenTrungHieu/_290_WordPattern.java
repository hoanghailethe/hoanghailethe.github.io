import java.util.HashMap;
import java.util.Map;

import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;

public class _290_WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if(pattern.length() != arr.length){
            return false;
        } else {
            Map<Character, String> myMap = new HashMap<>();
            for (int i = 0; i < arr.length; i++) {
                if(!myMap.containsKey(pattern.charAt(i))){
                    if(myMap.containsValue(arr[i])){
                        return false;
                    } else {
                        myMap.put(pattern.charAt(i), arr[i]);
                    }
                } 
            }
            for (int i = 0; i < arr.length; i++) {
                if(!myMap.get(pattern.charAt(i)).equals(arr[i])){
                    return false;
                }
            }
        }  
        return true;
    }
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog dog dog dog";
        System.out.println(wordPattern(pattern, s));
        
    }
}
