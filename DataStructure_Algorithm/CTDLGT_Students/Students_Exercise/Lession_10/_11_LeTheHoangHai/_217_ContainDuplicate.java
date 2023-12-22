import java.util.HashSet;
import java.util.Set;

public class _217_ContainDuplicate {
    public boolean containsDuplicate(int[] nums) {
        
        //Note: Dung Set trong truowng hop nay Se tot hon list ve do phuc tap
        // Do SET dung hashTable va Hash - do đó về CONTAINs nên dùng Set. hoặc tím kiếm theo kiểu KEY-VALUE sẽ nhanh hơn
        // do làm giảm độ phức tạp....
        Set<Integer> set = new HashSet<>();
        for(int i : nums) {
            if(set.contains(i) == false ) {
                set.add(i);
            } else{
                return true;
            }
        }
        return false;
    }
}

