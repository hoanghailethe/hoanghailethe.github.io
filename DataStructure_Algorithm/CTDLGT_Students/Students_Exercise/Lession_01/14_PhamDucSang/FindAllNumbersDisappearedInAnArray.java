import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> list = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toSet());

        return IntStream.rangeClosed(1, nums.length)
                .boxed()
                .filter(value -> !list.contains(value))
                .collect(Collectors.toList());
    }
}
