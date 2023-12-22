import java.util.HashMap;
import java.util.Map;

public class _137SingleNumber {
    private String a;

    public int singleNumber(int[] nums) {
        Map<Integer, Integer> time = new HashMap<>();

        for (int num:nums) {
            if(!time.containsKey(num)) {
                time.put(num, 1);
            } else {
                int update = time.get(num) + 1;
                time.put(num,update);
            }
        }

        for(int num:nums) {
            if (time.get(num) == 1) return num;
        }
        return -1;
    }
}
