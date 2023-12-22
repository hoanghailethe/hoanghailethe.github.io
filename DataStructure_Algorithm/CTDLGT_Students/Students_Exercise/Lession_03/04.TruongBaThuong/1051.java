class 1051 {
    public int heightChecker(int[] heights) {
        int count=0;
        int arr[]=new int[heights.length];
            arr[i]=heights[i];
        }
        Arrays.sort(arr);
        for(int i=0;i<heights.length;i++){

            if(arr[i]!=heights[i]){
                count++;
            }
        }
        return count;
    }
 public static void main(String[] args) {
        int[] heights = { 1, 2, 3, 4, 5 };
        System.out.println(heightChecker(heights));
        }
}