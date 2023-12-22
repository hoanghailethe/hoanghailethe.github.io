import java.util.HashMap;
import java.util.Map;

public class _137_Single_Number_II {
    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> myMap = new HashMap<>();
        for (int a : nums
        ) {
            if (myMap.containsKey(a) == false) {
                myMap.put(a, 1);
            } else {
                int soLanXuatHien = myMap.get(a) + 1;
                myMap.put(a, soLanXuatHien);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (myMap.get(nums[i]) == 1) {
                return nums[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] a = {0, 1, 0, 1, 0, 1, 99};
        System.out.println(singleNumber(a));
    }
}
