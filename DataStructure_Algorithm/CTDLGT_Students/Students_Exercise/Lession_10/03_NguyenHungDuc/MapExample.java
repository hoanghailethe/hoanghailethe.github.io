import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, Integer> myMap = new HashMap<>();
        myMap.put(1, 1);
        myMap.put(2, 2);
        myMap.put(3, 1);

        for (Map.Entry entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + " - " +  entry.getValue());
        }

    }
}
