import java.util.HashMap;
import java.util.Map;

public class _287FindtheDuplicateNumber {
    public static int findDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i) == false) {
                map.put(i, 1);
            } else {
                int soLanXuatHien = map.get(i) + 1;
                map.put(i, soLanXuatHien);
            }
        }
        for (int i : nums) {
            if (map.get(i) != 1) {
                return i;
            }
        }
        return 0;

    }
    public static void main(String[] args) {
        int [] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums)); 

    }
}
