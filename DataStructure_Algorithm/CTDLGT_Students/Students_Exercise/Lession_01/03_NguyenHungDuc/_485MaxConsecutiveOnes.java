class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        // int max = 0;
        // int count =0;
        // for(int i=0;i<nums.length;i++) {
        //     if(nums[i] == 1) {
        //         count++;
        //     } else {
        //         if(max < count) {
        //             max = count;
        //         }
        //         count =0;
        //     }
        // }
        // return max > count ? max : count;
        int maxOnes = 0;
        for (int i = 0; i < nums.length; i++){
            int newOnes = 0;
            while (i < nums.length && nums[i] == 1){
                newOnes++;
                i++;
            }
            maxOnes = Math.max(maxOnes, newOnes);
        }
        return maxOnes;

    }
    public static void main(String[] args) {
        int arr[] = { 1, 1, 0, 1, 1, 1 };
        
        System.out.println("SL Out: "+findMaxConsecutiveOnes(arr));

    }
}