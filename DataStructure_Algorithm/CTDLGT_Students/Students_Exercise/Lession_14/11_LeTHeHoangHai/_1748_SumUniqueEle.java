public class _1748_SumUniqueEle {
    public int sumOfUnique(int[] nums) {
        int[] count = new int [150];
        int sum =0;
        for (int i : nums) {
            count[i]++;
        }

        for (int i : nums) {
            if(count[i] == 1) sum += i;
        }
        return sum;
    }
}
