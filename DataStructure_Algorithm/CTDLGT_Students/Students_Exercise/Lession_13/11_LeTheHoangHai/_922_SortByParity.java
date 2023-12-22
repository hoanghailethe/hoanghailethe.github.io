import java.util.LinkedList;
import java.util.Queue;

public class _922_SortByParity {
    public int[] sortArrayByParityII(int[] nums) {
        Queue<Integer> invalOdd = new LinkedList<>();
        Queue<Integer> invalEven = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0 && (i % 2) != 0)
                invalOdd.add(i);
            if (nums[i] % 2 != 0 && (i % 2) == 0)
                invalEven.add(i);
        }

        while (!invalOdd.isEmpty()) {
            int a = invalOdd.poll();
            int b = invalEven.poll();
x   
            int tempt = nums[a];
            nums[a] = nums[b];
            nums[b] = tempt;
        }

        return nums;

    }
}
