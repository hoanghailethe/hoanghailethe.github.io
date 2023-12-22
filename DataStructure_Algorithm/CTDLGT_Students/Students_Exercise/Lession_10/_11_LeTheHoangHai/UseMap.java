import java.util.HashMap;
import java.util.Map;

public class UseMap {
    public static void main(String[] args) {
        Map<Integer, Integer> myMap = new HashMap<>();
        //VD Kiem tra so lan xuat hien cua cac so trong mot mang
        // myMap.put(1, 1);
        // myMap.put(1, 1);
        // myMap.put(1, 1);

        // for(Map.Entry entry : myMap.entrySet()) {
        //     System.out.println(entry.getKey() + " - " + entry.getValue());
        // } 

        //VD Kiem tra so lan xuat hien cua cac so trong mot mang
        int[] arr = {1,2,3,2,4,2,31,24,3};
        for (int a : arr) {
            if(myMap.containsKey(a) == false) {
                myMap.put(a, 1);
            } else {
                int soLanXuatHien = myMap.get(a) +1 ; 
                myMap.put(a, soLanXuatHien);
            }
        }

        for (Map.Entry entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
