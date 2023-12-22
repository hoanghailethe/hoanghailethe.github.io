import java.util.HashSet;
import java.util.Set;

public class _217_Contains_Duplicate {
    public boolean containsDuplicate(int[] a) {
        Set<Integer> mySet = new HashSet<>();
        for (int i : a) {
            if (mySet.contains(i) == false) { // chua ton tai
                mySet.add(i);
            } else { // da ton tai
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
