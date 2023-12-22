import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

class _442FindAllDuplicatesinanArray {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        for (Integer i : nums) {
            if (set.contains(i) == false) {
                set.add(i);
            } else {
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println(findDuplicates(nums));
        
    }
}