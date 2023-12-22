import java.util.HashMap;
import java.util.Map;

class _137SingleNumber2 {
    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> myMap = new HashMap<>();
        int valueCount = 1;
        for (int i : nums) {
            if (myMap.containsKey(i) == false) {
                myMap.put(i, 1);
            } else {
                valueCount = myMap.get(i) + 1;
                myMap.put(i, valueCount);
            }
        }

        // for (Map.Entry entry : myMap.entrySet()) {
        //     System.out.println(entry.getKey() + " - " + entry.getValue());
        // }
        
        for (int i : nums) {
            if (myMap.get(i) == 1) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {2,2,3,2 };
        System.out.println(singleNumber(nums));
        

    }
}