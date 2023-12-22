public class _287_findDul3 {
    public int findDuplicate(int[] nums) {
        int [] pos = new int [1000];

        for (int num : nums ) {
            if(pos[num] == 1) return pos[num];
            pos[num]++; 
        }
        return -10;
   }
}
