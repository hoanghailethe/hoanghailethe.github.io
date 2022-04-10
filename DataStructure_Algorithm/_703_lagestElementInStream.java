import java.util.Arrays;

public class _703_lagestElementInStream {
    int largestKThNum;
    int[] nums;

    public KthLargest(int k, int[] nums) {
        Arrays.sort(nums);
        this.nums =nums;
        largestKThNum = nums[nums.length-k];
    }
    
    public int add(int val) {
        if(val > this.largestKThNum) {

            // binasearch the position to insert = > copy values to new array 
            // int begin = 0;
            int end = nums.length-1;
            // int mid = (int) (begin+end)/2;
            int idxInsert = 0;

            // while(begin < end) {

            //     mid = (int) (begin+end)/2;
            //     if(nums[mid] < val) {
            //         begin = mid+1;
            //         continue;
            //     }
            //     if(nums[mid] > val) {
            //         end = mid-1;
            //         continue;
            //     }
            //     if(nums[mid] == val) {
            //         idxInsert = mid;
            //         break;
            //     }
            // }

            for(int i = 0; i < nums.length ; i++) {
                if(nums[i] != this.largestKThNum) {
                    idxInsert = i;
                    break;
                }
            }

            //insert to nums
            int[] newNums = new int[nums.length-idxInsert ];
            newNums[0] = val;
            for(int i = 1; i < newNums.length ; i++) {
                newNums[i] = nums[idxInsert+i];
            }
            //=> make this num become new array
            this.nums = newNums;
            //
            this.largestKThNum = this.nums[0];
        }
        System.out.println(Arrays.toString(nums));
        return this.largestKThNum;

    }


    class KthLargest {
        private PriorityQueue<Integer> pq;
        private int k;
        public KthLargest(int k, int[] nums) {
            List<Integer> list= new ArrayList<Integer>();  
            for(int i = 0; i < Math.min(k, nums.length); ++i) list.add(nums[i]);
            pq = new PriorityQueue<>(); pq.addAll(list);
            this.k = k;
            for(int i = k; i < nums.length; ++i) {
                pq.add(nums[i]);
                pq.poll();
            }
        }
        
        public int add(int val) {
            pq.add(val);
            if(pq.size() > k) pq.poll();
            return pq.peek();
        }
    }
}
